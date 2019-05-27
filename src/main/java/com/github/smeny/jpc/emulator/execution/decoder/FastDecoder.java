/*
    JPC: An x86 PC Hardware Emulator for a pure Java Virtual Machine

    Copyright (C) 2012-2013 Ian Preston

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License version 2 as published by
    the Free Software Foundation.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along
    with this program; if not, write to the Free Software Foundation, Inc.,
    51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.

    Details (including contact information) can be found at:

    jpc.sourceforge.net
    or the developer website
    sourceforge.net/projects/jpc/

    End of licence header
*/

package com.github.smeny.jpc.emulator.execution.decoder;

import com.github.smeny.jpc.emulator.execution.Executable;
import com.github.smeny.jpc.emulator.execution.ExecutableParameters;
import com.github.smeny.jpc.emulator.execution.OperatingMode;
import com.github.smeny.jpc.emulator.execution.opcodes.EipUpdate;
import com.github.smeny.jpc.emulator.processor.Processor;
import com.github.smeny.jpc.j2se.Option;

import java.util.HashSet;
import java.util.Set;

public class FastDecoder {
    public static final boolean PRINT_DISAM = Option.log_disam.value();
    public static final int MAX_INSTRUCTIONS_PER_BLOCK = Option.max_instructions_per_block.intValue(10000);
    public static final boolean DEBUG_BLOCKS = Option.debug_blocks.value();

    static OpcodeDecoder[] pmOps = new OpcodeDecoder[0x800];
    static OpcodeDecoder[] rmOps = new OpcodeDecoder[0x800];
    static OpcodeDecoder[] vmOps = new OpcodeDecoder[0x800];
    static Set<Class<?>> delayInts = new HashSet<>();
    static Set<Class<?>> maybeDelayInts = new HashSet<>();

    static {
        ExecutableTables.populateRMOpcodes(rmOps);
        ExecutableTables.populatePMOpcodes(pmOps);
        ExecutableTables.populateVMOpcodes(vmOps);
        delayInts.add(com.github.smeny.jpc.emulator.execution.opcodes.rm.sti.class);
        delayInts.add(com.github.smeny.jpc.emulator.execution.opcodes.pm.sti.class);
        delayInts.add(com.github.smeny.jpc.emulator.execution.opcodes.vm.sti.class);
        delayInts.add(com.github.smeny.jpc.emulator.execution.opcodes.rm.pop_o16_SS.class);
        delayInts.add(com.github.smeny.jpc.emulator.execution.opcodes.pm.pop_o32_SS.class);
        delayInts.add(com.github.smeny.jpc.emulator.execution.opcodes.pm.pop_o16_SS.class);
        delayInts.add(com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o16_SS.class);
        maybeDelayInts.add(com.github.smeny.jpc.emulator.execution.opcodes.rm.mov_S_Ew.class);
        maybeDelayInts.add(com.github.smeny.jpc.emulator.execution.opcodes.rm.mov_S_Ew_mem.class);
        maybeDelayInts.add(com.github.smeny.jpc.emulator.execution.opcodes.pm.mov_S_Ew.class);
        maybeDelayInts.add(com.github.smeny.jpc.emulator.execution.opcodes.pm.mov_S_Ew_mem.class);
        maybeDelayInts.add(com.github.smeny.jpc.emulator.execution.opcodes.pm.mov_S_Ed.class);
        maybeDelayInts.add(com.github.smeny.jpc.emulator.execution.opcodes.pm.mov_S_Ed_mem.class);
        maybeDelayInts.add(com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_S_Ew.class);
        maybeDelayInts.add(com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_S_Ew_mem.class);
    }

    static int decodeCount = 0;

    public static BasicBlock decodeBlock(PeekableInputStream input, int operand_size, OperatingMode mode) {
        decodeCount++;
        if (decodeCount % 1000 == 0) {
            System.out.println("Decoded " + decodeCount + " blocks...");
        }
        int startAddr = (int) input.getAddress();
        boolean debug = false;
        int beginCount = input.getCounter();
        boolean is32Bit = operand_size == 32;

        if (debug) {
            System.out.printf("Block decode started at %x\n", input.getAddress());
        }
        Executable start = decodeOpcode(startAddr, input, mode, is32Bit);
        if (PRINT_DISAM) {
            System.out.printf("%d;%s;", operand_size, start.getClass().getName());
            System.out.println(Disassembler.getRawBytes(input, beginCount));
        }
        if (debug) {
            System.out.printf("Disassembled instruction (%d): %s at %x\n", 0, start, input.getAddress());
        }
        Executable current = start;
        int count = 1;
        boolean delayInterrupts = false;
        while (!current.isBranch()) {
            if (((delayInterrupts) || (count >= MAX_INSTRUCTIONS_PER_BLOCK)) && !delayInterrupts(current)) {
                ExecutableParameters.Builder parametersBuilder = new ExecutableParameters.Builder(startAddr, (int) input.getAddress()).operatingMode(mode);
                parametersBuilder.input(input);
                Executable eip = new EipUpdate(parametersBuilder.build());
                current.next = eip;
                if (!delayInterrupts && (MAX_INSTRUCTIONS_PER_BLOCK > 10)) {
                    System.out.println((String.format("Exceeded maximum number of instructions in a block at %x", startAddr)));
                }
                return constructBlock(start, (int) input.getAddress() - startAddr, count, input, operand_size);
            }
            beginCount = input.getCounter();
            Executable next = decodeOpcode(startAddr, input, mode, is32Bit);
            if (PRINT_DISAM) {
                System.out.printf("%d;%s;", operand_size, next.getClass().getName());
                System.out.println(Disassembler.getRawBytes(input, beginCount));
            }

            if (debug) {
                System.out.printf("Disassembled next instruction (%d): %s at %x\n", count, next, input.getAddress());
            }
            count++;
            if (delayInterrupts(current)) {
                delayInterrupts = true;
            }

            current.next = next;
            current = next;
        }

        return constructBlock(start, (int) input.getAddress() - startAddr, count, input, operand_size);
    }

    private static BasicBlock constructBlock(Executable start, int x86Length, int x86Count, PeekableInputStream input,
                                             int mode) {
        if (DEBUG_BLOCKS) {
            input.seek(-x86Length);
            Instruction startin = Disassembler.disassemble(input, mode);
            Instruction prev = startin;
            for (int i = 1; i < x86Count; i++) {
                Instruction next = Disassembler.disassemble(input, mode);
                prev.next = next;
                prev = next;
            }
            return new DebugBasicBlock(startin, start, x86Length, x86Count);
        }
        return new BasicBlock(start, x86Length, x86Count);
    }

    public static boolean delayInterrupts(Executable opcode) {
        // sti, pop ss, mov ss
        if (delayInts.contains(opcode.getClass())) {
            return true;
        }
        if (maybeDelayInts.contains(opcode.getClass())) {
            if (opcode instanceof com.github.smeny.jpc.emulator.execution.opcodes.rm.mov_S_Ew) {
                return ((com.github.smeny.jpc.emulator.execution.opcodes.rm.mov_S_Ew) opcode).segIndex == Processor.SS_INDEX;
            }
            if (opcode instanceof com.github.smeny.jpc.emulator.execution.opcodes.rm.mov_S_Ew_mem) {
                return ((com.github.smeny.jpc.emulator.execution.opcodes.rm.mov_S_Ew_mem) opcode).segIndex == Processor.SS_INDEX;
            }
            if (opcode instanceof com.github.smeny.jpc.emulator.execution.opcodes.pm.mov_S_Ew) {
                return ((com.github.smeny.jpc.emulator.execution.opcodes.pm.mov_S_Ew) opcode).segIndex == Processor.SS_INDEX;
            }
            if (opcode instanceof com.github.smeny.jpc.emulator.execution.opcodes.pm.mov_S_Ew_mem) {
                return ((com.github.smeny.jpc.emulator.execution.opcodes.pm.mov_S_Ew_mem) opcode).segIndex == Processor.SS_INDEX;
            }
            if (opcode instanceof com.github.smeny.jpc.emulator.execution.opcodes.pm.mov_S_Ed) {
                return ((com.github.smeny.jpc.emulator.execution.opcodes.pm.mov_S_Ed) opcode).segIndex == Processor.SS_INDEX;
            }
            if (opcode instanceof com.github.smeny.jpc.emulator.execution.opcodes.pm.mov_S_Ed_mem) {
                return ((com.github.smeny.jpc.emulator.execution.opcodes.pm.mov_S_Ed_mem) opcode).segIndex == Processor.SS_INDEX;
            }
            if (opcode instanceof com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_S_Ew) {
                return ((com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_S_Ew) opcode).segIndex == Processor.SS_INDEX;
            }
            if (opcode instanceof com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_S_Ew_mem) {
                return ((com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_S_Ew_mem) opcode).segIndex == Processor.SS_INDEX;
            }
        }
        return false;
    }

    private static Executable decodeOpcode(int blockStart, PeekableInputStream input, OperatingMode mode,
                                           boolean is32Bit) {
        switch (mode) {
            case REAL_MODE:
                return decodeRMOpcode(blockStart, input);
            case PROTECTED_MODE:
                return decodePMOpcode(blockStart, input, is32Bit);
            case VIRTUAL_8086_MODE:
                return decodeVMOpcode(blockStart, input);
        }
        throw new RuntimeException("Unknown operating mode while decoding opcode");
    }


//  private static Executable innerDecodeOpcode(int blockStart, PeekableInputStream input) {
//    // FIXME: Casting long to int !!!
//    int opStart = (int) input.getAddress();
//    int prefices = 0x1C; // define constant
//    int currentReadByte = input.readU8(); // should be a byte really
//
//    while (Prefices.isPrefix(currentReadByte)) {
//
//    }
//
//  }


    private static Executable decodePMOpcode(int blockStart, PeekableInputStream input, boolean is32BitSeg) {
        int opStart = (int) input.getAddress();
        int prefices = 0x1C;
        int b = input.readU8();
        boolean addrSize = is32BitSeg;
        boolean is32Bit = is32BitSeg;
        while (Prefices.isPrefix(b)) {
            if (b == 0x66) {
                is32Bit = !is32BitSeg;
            } else if (b == 0x67) {
                addrSize = !is32BitSeg;
            } else {
                prefices = Prefices.encodePrefix(prefices, b);
            }
            b = input.readU8();
        }
        int opcode = 0;
        if (is32Bit) {
            opcode += 0x200;
            prefices = Prefices.encodePrefix(prefices, 0x66);
        }
        if (addrSize) {
            opcode += 0x400;
            prefices = Prefices.encodePrefix(prefices, 0x67);
        }
        if (b == 0x0F) {
            opcode += 0x100;
            b = input.readU8();
        }
        opcode += b;

        ExecutableParameters parameters = new ExecutableParameters.Builder(blockStart, opStart)
                .prefices(prefices)
                .input(input)
                .build();
        return pmOps[opcode].decodeOpcode(parameters);
    }

    private static Executable decodeRMOpcode(int blockStart, PeekableInputStream input) {
        int opStart = (int) input.getAddress();
        int prefices = 0x1C;
        int b = input.readU8();
        boolean addrSize = false, is32Bit = false;
        while (Prefices.isPrefix(b)) {
            if (b == 0x66) {
                is32Bit = true;
            } else if (b == 0x67) {
                addrSize = true;
            } else {
                prefices = Prefices.encodePrefix(prefices, b);
            }
            b = input.readU8();
        }
        int opcode = 0;
        if (is32Bit) {
            opcode += 0x200;
            prefices = Prefices.encodePrefix(prefices, 0x66);
        }
        if (addrSize) {
            opcode += 0x400;
            prefices = Prefices.encodePrefix(prefices, 0x67);
        }
        if (b == 0x0F) {
            opcode += 0x100;
            b = input.readU8();
        }
        opcode += b;

        ExecutableParameters parameters = new ExecutableParameters.Builder(blockStart, opStart)
                .prefices(prefices)
                .input(input)
                .build();
        return rmOps[opcode].decodeOpcode(parameters);
    }

    private static Executable decodeVMOpcode(int blockStart, PeekableInputStream input) {
        int opStart = (int) input.getAddress();
        int prefices = 0x1C;
        int b = input.readU8();
        boolean addrSize = false, is32Bit = false;
        while (Prefices.isPrefix(b)) {
            if (b == 0x66) {
                is32Bit = true;
            } else if (b == 0x67) {
                addrSize = true;
            } else {
                prefices = Prefices.encodePrefix(prefices, b);
            }
            b = input.readU8();
        }
        int opcode = 0;
        if (is32Bit) {
            opcode += 0x200;
            prefices = Prefices.encodePrefix(prefices, 0x66);
        }
        if (addrSize) {
            opcode += 0x400;
            prefices = Prefices.encodePrefix(prefices, 0x67);
        }
        if (b == 0x0F) {
            opcode += 0x100;
            b = input.readU8();
        }
        opcode += b;

        ExecutableParameters parameters = new ExecutableParameters.Builder(blockStart, opStart)
                .prefices(prefices)
                .input(input)
                .build();
        return vmOps[opcode].decodeOpcode(parameters);
    }
}
