package com.github.smeny.jpc.emulator.execution.opcodes.pm;

import com.github.smeny.jpc.emulator.execution.*;
import com.github.smeny.jpc.emulator.execution.decoder.*;
import com.github.smeny.jpc.emulator.processor.*;
import com.github.smeny.jpc.emulator.processor.fpu64.*;
import static com.github.smeny.jpc.emulator.processor.Processor.*;

public class UnimplementedOpcode extends Executable
{
    final int blockLength;
    final int instructionLength;
    String error;

    public UnimplementedOpcode(int blockStart, int eip, int prefices, PeekableInputStream input)
    {
        super(blockStart, eip);
        instructionLength = (int)input.getAddress()-eip;
        blockLength = (int)input.getAddress()-blockStart;
        input.seek(-instructionLength);
        Instruction in = Disassembler.disassemble(input, Prefices.isAddr16(prefices) ? 16 : 32);
        error = in.toString() + " ("+in.getGeneralClassName(false, false)+"), x86 byte = " + Disassembler.getRawBytes(input, eip-blockStart);
    }

    public Branch execute(Processor cpu)
    {
        if (true) throw new IllegalStateException("Unimplemented opcode: "+error);
        return Branch.Jmp_Unknown;
    }

    public boolean isBranch()
    {
        return true;
    }

    public String toString()
    {
        return this.getClass().getName();
    }
}