package com.github.smeny.jpc.emulator.execution.decoder;

import com.github.smeny.jpc.emulator.execution.Executable;
import com.github.smeny.jpc.emulator.execution.ExecutableParameters;

public class ExecutableTablesVM implements ExecutableTables {

    public void populateOpcodes(OpcodeDecoder[] ops) {

        ops[0x00] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Eb_Gb_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Eb_Gb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x01] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Ew_Gw_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Ew_Gw(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x02] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Gb_Eb_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Gb_Eb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x03] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Gw_Ew_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Gw_Ew(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x04] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_AL_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0x05] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_o16_rAX_Iw(blockStart, eip, prefices, input);
            }
        };
        ops[0x06] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o16_ES(blockStart, eip, prefices, input);
            }
        };
        ops[0x07] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o16_ES(blockStart, eip, prefices, input);
            }
        };
        ops[0x08] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Eb_Gb_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Eb_Gb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x09] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Ew_Gw_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Ew_Gw(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x0a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Gb_Eb_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Gb_Eb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x0b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Gw_Ew_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Gw_Ew(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x0c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_AL_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0x0d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_o16_rAX_Iw(blockStart, eip, prefices, input);
            }
        };
        ops[0x0e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o16_CS(blockStart, eip, prefices, input);
            }
        };
        ops[0x0f] = null;
        ops[0x10] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Eb_Gb_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Eb_Gb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x11] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Ew_Gw_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Ew_Gw(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x12] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Gb_Eb_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Gb_Eb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x13] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Gw_Ew_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Gw_Ew(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x14] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_AL_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0x15] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_o16_rAX_Iw(blockStart, eip, prefices, input);
            }
        };
        ops[0x16] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o16_SS(blockStart, eip, prefices, input);
            }
        };
        ops[0x17] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o16_SS(blockStart, eip, prefices, input);
            }
        };
        ops[0x18] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Eb_Gb_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Eb_Gb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x19] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Ew_Gw_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Ew_Gw(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x1a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Gb_Eb_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Gb_Eb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x1b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Gw_Ew_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Gw_Ew(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x1c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_AL_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0x1d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_o16_rAX_Iw(blockStart, eip, prefices, input);
            }
        };
        ops[0x1e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o16_DS(blockStart, eip, prefices, input);
            }
        };
        ops[0x1f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o16_DS(blockStart, eip, prefices, input);
            }
        };
        ops[0x20] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Eb_Gb_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Eb_Gb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x21] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Ew_Gw_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Ew_Gw(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x22] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Gb_Eb_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Gb_Eb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x23] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Gw_Ew_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Gw_Ew(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x24] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_AL_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0x25] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_o16_rAX_Iw(blockStart, eip, prefices, input);
            }
        };
        ops[0x26] = null;
        ops[0x27] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.daa(blockStart, eip, prefices, input);
            }
        };
        ops[0x28] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Eb_Gb_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Eb_Gb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x29] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Ew_Gw_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Ew_Gw(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x2a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Gb_Eb_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Gb_Eb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x2b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Gw_Ew_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Gw_Ew(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x2c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_AL_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0x2d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_o16_rAX_Iw(blockStart, eip, prefices, input);
            }
        };
        ops[0x2e] = null;
        ops[0x2f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.das(blockStart, eip, prefices, input);
            }
        };
        ops[0x30] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Eb_Gb_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Eb_Gb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x31] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Ew_Gw_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Ew_Gw(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x32] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Gb_Eb_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Gb_Eb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x33] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Gw_Ew_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Gw_Ew(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x34] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_AL_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0x35] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_o16_rAX_Iw(blockStart, eip, prefices, input);
            }
        };
        ops[0x36] = null;
        ops[0x37] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.aaa(blockStart, eip, prefices, input);
            }
        };
        ops[0x38] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Eb_Gb_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Eb_Gb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x39] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Ew_Gw_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Ew_Gw(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x3a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Gb_Eb_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Gb_Eb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x3b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Gw_Ew_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Gw_Ew(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x3c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_AL_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0x3d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_o16_rAX_Iw(blockStart, eip, prefices, input);
            }
        };
        ops[0x3e] = null;
        ops[0x3f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.aas(blockStart, eip, prefices, input);
            }
        };
        ops[0x40] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o16_eAX(blockStart, eip, prefices, input);
            }
        };
        ops[0x41] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o16_eCX(blockStart, eip, prefices, input);
            }
        };
        ops[0x42] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o16_eDX(blockStart, eip, prefices, input);
            }
        };
        ops[0x43] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o16_eBX(blockStart, eip, prefices, input);
            }
        };
        ops[0x44] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o16_eSP(blockStart, eip, prefices, input);
            }
        };
        ops[0x45] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o16_eBP(blockStart, eip, prefices, input);
            }
        };
        ops[0x46] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o16_eSI(blockStart, eip, prefices, input);
            }
        };
        ops[0x47] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o16_eDI(blockStart, eip, prefices, input);
            }
        };
        ops[0x48] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o16_eAX(blockStart, eip, prefices, input);
            }
        };
        ops[0x49] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o16_eCX(blockStart, eip, prefices, input);
            }
        };
        ops[0x4a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o16_eDX(blockStart, eip, prefices, input);
            }
        };
        ops[0x4b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o16_eBX(blockStart, eip, prefices, input);
            }
        };
        ops[0x4c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o16_eSP(blockStart, eip, prefices, input);
            }
        };
        ops[0x4d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o16_eBP(blockStart, eip, prefices, input);
            }
        };
        ops[0x4e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o16_eSI(blockStart, eip, prefices, input);
            }
        };
        ops[0x4f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o16_eDI(blockStart, eip, prefices, input);
            }
        };
        ops[0x50] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o16_rAXr8(blockStart, eip, prefices, input);
            }
        };
        ops[0x51] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o16_rCXr9(blockStart, eip, prefices, input);
            }
        };
        ops[0x52] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o16_rDXr10(blockStart, eip, prefices, input);
            }
        };
        ops[0x53] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o16_rBXr11(blockStart, eip, prefices, input);
            }
        };
        ops[0x54] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o16_rSPr12(blockStart, eip, prefices, input);
            }
        };
        ops[0x55] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o16_rBPr13(blockStart, eip, prefices, input);
            }
        };
        ops[0x56] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o16_rSIr14(blockStart, eip, prefices, input);
            }
        };
        ops[0x57] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o16_rDIr15(blockStart, eip, prefices, input);
            }
        };
        ops[0x58] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o16_rAXr8(blockStart, eip, prefices, input);
            }
        };
        ops[0x59] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o16_rCXr9(blockStart, eip, prefices, input);
            }
        };
        ops[0x5a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o16_rDXr10(blockStart, eip, prefices, input);
            }
        };
        ops[0x5b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o16_rBXr11(blockStart, eip, prefices, input);
            }
        };
        ops[0x5c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o16_rSPr12(blockStart, eip, prefices, input);
            }
        };
        ops[0x5d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o16_rBPr13(blockStart, eip, prefices, input);
            }
        };
        ops[0x5e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o16_rSIr14(blockStart, eip, prefices, input);
            }
        };
        ops[0x5f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o16_rDIr15(blockStart, eip, prefices, input);
            }
        };
        ops[0x60] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pusha(blockStart, eip, prefices, input);
            }
        };
        ops[0x61] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.popa(blockStart, eip, prefices, input);
            }
        };
        ops[0x62] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode/*(Disassembler.java line 189)*/(
                                    blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x63] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.arpl_Ew_Gw_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.arpl_Ew_Gw(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x64] = null;
        ops[0x65] = null;
        ops[0x66] = null;
        ops[0x67] = null;
        ops[0x68] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o16_Iw(blockStart, eip, prefices, input);
            }
        };
        ops[0x69] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Gw_Ew_Iw_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Gw_Ew_Iw(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x6a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o16_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0x6b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Gw_Ew_Ib_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Gw_Ew_Ib(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x6c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x6d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_insw_a16(blockStart, eip, prefices, input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_insw_a16(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.insw_a16(blockStart, eip, prefices, input);
            }
        };
        ops[0x6e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x6f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_outsw_a16(blockStart, eip, prefices, input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_outsw_a16(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.outsw_a16(blockStart, eip, prefices, input);
            }
        };
        ops[0x70] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jo_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0x71] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jno_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0x72] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jb_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0x73] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jae_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0x74] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.je_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0x75] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jne_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0x76] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jbe_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0x77] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ja_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0x78] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.js_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0x79] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jns_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0x7a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jp_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0x7b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jnp_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0x7c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jl_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0x7d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jge_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0x7e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jle_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0x7f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jg_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0x80] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Eb_Ib(blockStart, eip, prefices, input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Eb_Ib(blockStart, eip, prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Eb_Ib(blockStart, eip, prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Eb_Ib(blockStart, eip, prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Eb_Ib(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Eb_Ib(blockStart, eip, prefices, input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Eb_Ib(blockStart, eip, prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Eb_Ib(blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x81] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Ew_Iw_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Ew_Iw_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Ew_Iw_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Ew_Iw_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Ew_Iw_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Ew_Iw_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Ew_Iw_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Ew_Iw_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Ew_Iw(blockStart, eip, prefices, input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Ew_Iw(blockStart, eip, prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Ew_Iw(blockStart, eip, prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Ew_Iw(blockStart, eip, prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Ew_Iw(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Ew_Iw(blockStart, eip, prefices, input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Ew_Iw(blockStart, eip, prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Ew_Iw(blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x82] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Eb_Ib(blockStart, eip, prefices, input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Eb_Ib(blockStart, eip, prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Eb_Ib(blockStart, eip, prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Eb_Ib(blockStart, eip, prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Eb_Ib(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Eb_Ib(blockStart, eip, prefices, input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Eb_Ib(blockStart, eip, prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Eb_Ib(blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x83] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Ew_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Ew_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Ew_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Ew_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Ew_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Ew_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Ew_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Ew_Ib_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Ew_Ib(blockStart, eip, prefices, input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Ew_Ib(blockStart, eip, prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Ew_Ib(blockStart, eip, prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Ew_Ib(blockStart, eip, prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Ew_Ib(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Ew_Ib(blockStart, eip, prefices, input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Ew_Ib(blockStart, eip, prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Ew_Ib(blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x84] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.test_Eb_Gb_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.test_Eb_Gb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x85] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.test_Ew_Gw_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.test_Ew_Gw(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x86] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_Eb_Gb_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_Eb_Gb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x87] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_Ew_Gw_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_Ew_Gw(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x88] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Eb_Gb_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Eb_Gb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x89] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Ew_Gw_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Ew_Gw(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x8a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Gb_Eb_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Gb_Eb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x8b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Gw_Ew_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Gw_Ew(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x8c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Ew_S_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Ew_S(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x8d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lea_Gw_M_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode/*(Disassembler.java line 189)*/(
                                    blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x8e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_S_Ew_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_S_Ew(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x8f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_Ew_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_Ew(blockStart, eip, prefices, input);
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                }
                return null;
            }
        };
        ops[0x90] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.nop(blockStart, eip, prefices, input);
            }
        };
        ops[0x91] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_o16_rCXr9_rAX(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x92] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_o16_rDXr10_rAX(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x93] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_o16_rBXr11_rAX(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x94] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_o16_rSPr12_rAX(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x95] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_o16_rBPr13_rAX(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x96] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_o16_rSIr14_rAX(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x97] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_o16_rDIr15_rAX(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x98] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cbw(blockStart, eip, prefices, input);
            }
        };
        ops[0x99] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cwd(blockStart, eip, prefices, input);
            }
        };
        ops[0x9a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.call_o16_Ap(blockStart, eip, prefices, input);
            }
        };
        ops[0x9b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.wait(blockStart, eip, prefices, input);
            }
        };
        ops[0x9c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pushfw(blockStart, eip, prefices, input);
            }
        };
        ops[0x9d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.popfw(blockStart, eip, prefices, input);
            }
        };
        ops[0x9e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sahf(blockStart, eip, prefices, input);
            }
        };
        ops[0x9f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lahf(blockStart, eip, prefices, input);
            }
        };
        ops[0xa0] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_AL_Ob_mem(blockStart, eip, prefices, input);
            }
        };
        ops[0xa1] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rAX_Ow_mem(blockStart, eip, prefices, input);
            }
        };
        ops[0xa2] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Ob_AL_mem(blockStart, eip, prefices, input);
            }
        };
        ops[0xa3] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Ow_rAX_mem(blockStart, eip, prefices, input);
            }
        };
        ops[0xa4] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_movsb_a16(blockStart, eip, prefices, input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_movsb_a16(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movsb_a16(blockStart, eip, prefices, input);
            }
        };
        ops[0xa5] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_movsw_a16(blockStart, eip, prefices, input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_movsw_a16(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movsw_a16(blockStart, eip, prefices, input);
            }
        };
        ops[0xa6] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_cmpsb_a16(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmpsb_a16(blockStart, eip, prefices, input);
            }
        };
        ops[0xa7] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_cmpsw_a16(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmpsw_a16(blockStart, eip, prefices, input);
            }
        };
        ops[0xa8] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.test_AL_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0xa9] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.test_o16_rAX_Iw(blockStart, eip, prefices, input);
            }
        };
        ops[0xaa] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_stosb_a16(blockStart, eip, prefices, input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_stosb_a16(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.stosb_a16(blockStart, eip, prefices, input);
            }
        };
        ops[0xab] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_stosw_a16(blockStart, eip, prefices, input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_stosw_a16(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.stosw_a16(blockStart, eip, prefices, input);
            }
        };
        ops[0xac] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_lodsb_a16(blockStart, eip, prefices, input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_lodsb_a16(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lodsb_a16(blockStart, eip, prefices, input);
            }
        };
        ops[0xad] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lodsw_a16(blockStart, eip, prefices, input);
            }
        };
        ops[0xae] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.repne_scasb_a16(blockStart, eip, prefices,
                            input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_scasb_a16(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.scasb_a16(blockStart, eip, prefices, input);
            }
        };
        ops[0xaf] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.repne_scasw_a16(blockStart, eip, prefices,
                            input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_scasw_a16(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.scasw_a16(blockStart, eip, prefices, input);
            }
        };
        ops[0xb0] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_ALr8b_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0xb1] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_CLr9b_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0xb2] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_DLr10b_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0xb3] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_BLr11b_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0xb4] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_AHr12b_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0xb5] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_CHr13b_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0xb6] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_DHr14b_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0xb7] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_BHr15b_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0xb8] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rAXr8_Iw(blockStart, eip, prefices, input);
            }
        };
        ops[0xb9] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rCXr9_Iw(blockStart, eip, prefices, input);
            }
        };
        ops[0xba] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rDXr10_Iw(blockStart, eip, prefices, input);
            }
        };
        ops[0xbb] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rBXr11_Iw(blockStart, eip, prefices, input);
            }
        };
        ops[0xbc] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rSPr12_Iw(blockStart, eip, prefices, input);
            }
        };
        ops[0xbd] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rBPr13_Iw(blockStart, eip, prefices, input);
            }
        };
        ops[0xbe] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rSIr14_Iw(blockStart, eip, prefices, input);
            }
        };
        ops[0xbf] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rDIr15_Iw(blockStart, eip, prefices, input);
            }
        };
        ops[0xc0] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcr_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Eb_Ib(blockStart, eip, prefices, input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Eb_Ib(blockStart, eip, prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Eb_Ib(blockStart, eip, prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcr_Eb_Ib(blockStart, eip, prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Eb_Ib(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Eb_Ib(blockStart, eip, prefices, input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Eb_Ib(blockStart, eip, prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Eb_Ib(blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0xc1] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Ew_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Ew_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Ew_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ew_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Ew_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ew_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Ew_Ib_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Ew_Ib(blockStart, eip, prefices, input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Ew_Ib(blockStart, eip, prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Ew_Ib(blockStart, eip, prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ew_Ib(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Ew_Ib(blockStart, eip, prefices, input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ew_Ib(blockStart, eip, prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Ew_Ib(blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0xc2] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ret_Iw(blockStart, eip, prefices, input);
            }
        };
        ops[0xc3] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ret_o16(blockStart, eip, prefices, input);
            }
        };
        ops[0xc4] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.les_o16_Gw_M_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode/*(Disassembler.java line 189)*/(
                                    blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0xc5] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lds_o16_Gw_M_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode/*(Disassembler.java line 189)*/(
                                    blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0xc6] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Eb_Ib(blockStart, eip, prefices, input);
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                }
                return null;
            }
        };
        ops[0xc7] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Ew_Iw_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Ew_Iw(blockStart, eip, prefices, input);
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                }
                return null;
            }
        };
        ops[0xc8] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.enter_o16_Iw_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0xc9] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.leave_o16(blockStart, eip, prefices, input);
            }
        };
        ops[0xca] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.retf_Iw(blockStart, eip, prefices, input);
            }
        };
        ops[0xcb] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.retf(blockStart, eip, prefices, input);
            }
        };
        ops[0xcc] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.int3(blockStart, eip, prefices, input);
            }
        };
        ops[0xcd] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.int_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0xce] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0xcf] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.iretw(blockStart, eip, prefices, input);
            }
        };
        ops[0xd0] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Eb_I1_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Eb_I1_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Eb_I1_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcr_Eb_I1_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Eb_I1_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Eb_I1_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Eb_I1_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Eb_I1_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Eb_I1(blockStart, eip, prefices, input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Eb_I1(blockStart, eip, prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Eb_I1(blockStart, eip, prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcr_Eb_I1(blockStart, eip, prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Eb_I1(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Eb_I1(blockStart, eip, prefices, input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Eb_I1(blockStart, eip, prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Eb_I1(blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0xd1] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Ew_I1_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Ew_I1_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Ew_I1_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcr_Ew_I1_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ew_I1_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Ew_I1_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ew_I1_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Ew_I1_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Ew_I1(blockStart, eip, prefices, input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Ew_I1(blockStart, eip, prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Ew_I1(blockStart, eip, prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcr_Ew_I1(blockStart, eip, prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ew_I1(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Ew_I1(blockStart, eip, prefices, input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ew_I1(blockStart, eip, prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Ew_I1(blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0xd2] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Eb_CL_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Eb_CL_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Eb_CL_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcr_Eb_CL_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Eb_CL_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Eb_CL_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Eb_CL_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Eb_CL_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Eb_CL(blockStart, eip, prefices, input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Eb_CL(blockStart, eip, prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Eb_CL(blockStart, eip, prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcr_Eb_CL(blockStart, eip, prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Eb_CL(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Eb_CL(blockStart, eip, prefices, input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Eb_CL(blockStart, eip, prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Eb_CL(blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0xd3] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Ew_CL_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Ew_CL_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Ew_CL_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcr_Ew_CL_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ew_CL_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Ew_CL_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ew_CL_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Ew_CL_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Ew_CL(blockStart, eip, prefices, input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Ew_CL(blockStart, eip, prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Ew_CL(blockStart, eip, prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcr_Ew_CL(blockStart, eip, prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ew_CL(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Ew_CL(blockStart, eip, prefices, input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ew_CL(blockStart, eip, prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Ew_CL(blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0xd4] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.aam_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0xd5] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.aad_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0xd6] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0xd7] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xlatb_a16(blockStart, eip, prefices, input);
            }
        };
        ops[0xd8] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fadd_Md_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmul_Md_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcom_Md_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcomp_Md_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsub_Md_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubr_Md_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdiv_Md_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivr_Md_mem(blockStart, eip, prefices,
                                    input);
                    }
                }
                switch (modrm) {
                    case 0xc0:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fadd_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xc1:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fadd_ST0_ST1(blockStart, eip, prefices,
                                input);
                    case 0xc2:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fadd_ST0_ST2(blockStart, eip, prefices,
                                input);
                    case 0xc3:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fadd_ST0_ST3(blockStart, eip, prefices,
                                input);
                    case 0xc4:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fadd_ST0_ST4(blockStart, eip, prefices,
                                input);
                    case 0xc5:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fadd_ST0_ST5(blockStart, eip, prefices,
                                input);
                    case 0xc6:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fadd_ST0_ST6(blockStart, eip, prefices,
                                input);
                    case 0xc7:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fadd_ST0_ST7(blockStart, eip, prefices,
                                input);
                    case 0xc8:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmul_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xc9:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmul_ST0_ST1(blockStart, eip, prefices,
                                input);
                    case 0xca:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmul_ST0_ST2(blockStart, eip, prefices,
                                input);
                    case 0xcb:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmul_ST0_ST3(blockStart, eip, prefices,
                                input);
                    case 0xcc:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmul_ST0_ST4(blockStart, eip, prefices,
                                input);
                    case 0xcd:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmul_ST0_ST5(blockStart, eip, prefices,
                                input);
                    case 0xce:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmul_ST0_ST6(blockStart, eip, prefices,
                                input);
                    case 0xcf:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmul_ST0_ST7(blockStart, eip, prefices,
                                input);
                    case 0xd0:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcom_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xd1:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcom_ST0_ST1(blockStart, eip, prefices,
                                input);
                    case 0xd2:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcom_ST0_ST2(blockStart, eip, prefices,
                                input);
                    case 0xd3:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcom_ST0_ST3(blockStart, eip, prefices,
                                input);
                    case 0xd4:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcom_ST0_ST4(blockStart, eip, prefices,
                                input);
                    case 0xd5:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcom_ST0_ST5(blockStart, eip, prefices,
                                input);
                    case 0xd6:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcom_ST0_ST6(blockStart, eip, prefices,
                                input);
                    case 0xd7:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcom_ST0_ST7(blockStart, eip, prefices,
                                input);
                    case 0xd8:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcomp_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xd9:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcomp_ST0_ST1(blockStart, eip, prefices,
                                input);
                    case 0xda:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcomp_ST0_ST2(blockStart, eip, prefices,
                                input);
                    case 0xdb:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcomp_ST0_ST3(blockStart, eip, prefices,
                                input);
                    case 0xdc:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcomp_ST0_ST4(blockStart, eip, prefices,
                                input);
                    case 0xdd:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcomp_ST0_ST5(blockStart, eip, prefices,
                                input);
                    case 0xde:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcomp_ST0_ST6(blockStart, eip, prefices,
                                input);
                    case 0xdf:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcomp_ST0_ST7(blockStart, eip, prefices,
                                input);
                    case 0xe0:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsub_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xe1:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsub_ST0_ST1(blockStart, eip, prefices,
                                input);
                    case 0xe2:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsub_ST0_ST2(blockStart, eip, prefices,
                                input);
                    case 0xe3:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsub_ST0_ST3(blockStart, eip, prefices,
                                input);
                    case 0xe4:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsub_ST0_ST4(blockStart, eip, prefices,
                                input);
                    case 0xe5:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsub_ST0_ST5(blockStart, eip, prefices,
                                input);
                    case 0xe6:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsub_ST0_ST6(blockStart, eip, prefices,
                                input);
                    case 0xe7:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsub_ST0_ST7(blockStart, eip, prefices,
                                input);
                    case 0xe8:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubr_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xe9:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubr_ST0_ST1(blockStart, eip, prefices,
                                input);
                    case 0xea:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubr_ST0_ST2(blockStart, eip, prefices,
                                input);
                    case 0xeb:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubr_ST0_ST3(blockStart, eip, prefices,
                                input);
                    case 0xec:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubr_ST0_ST4(blockStart, eip, prefices,
                                input);
                    case 0xed:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubr_ST0_ST5(blockStart, eip, prefices,
                                input);
                    case 0xee:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubr_ST0_ST6(blockStart, eip, prefices,
                                input);
                    case 0xef:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubr_ST0_ST7(blockStart, eip, prefices,
                                input);
                    case 0xf0:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdiv_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xf1:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdiv_ST0_ST1(blockStart, eip, prefices,
                                input);
                    case 0xf2:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdiv_ST0_ST2(blockStart, eip, prefices,
                                input);
                    case 0xf3:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdiv_ST0_ST3(blockStart, eip, prefices,
                                input);
                    case 0xf4:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdiv_ST0_ST4(blockStart, eip, prefices,
                                input);
                    case 0xf5:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdiv_ST0_ST5(blockStart, eip, prefices,
                                input);
                    case 0xf6:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdiv_ST0_ST6(blockStart, eip, prefices,
                                input);
                    case 0xf7:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdiv_ST0_ST7(blockStart, eip, prefices,
                                input);
                    case 0xf8:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivr_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xf9:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivr_ST0_ST1(blockStart, eip, prefices,
                                input);
                    case 0xfa:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivr_ST0_ST2(blockStart, eip, prefices,
                                input);
                    case 0xfb:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivr_ST0_ST3(blockStart, eip, prefices,
                                input);
                    case 0xfc:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivr_ST0_ST4(blockStart, eip, prefices,
                                input);
                    case 0xfd:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivr_ST0_ST5(blockStart, eip, prefices,
                                input);
                    case 0xfe:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivr_ST0_ST6(blockStart, eip, prefices,
                                input);
                    case 0xff:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivr_ST0_ST7(blockStart, eip, prefices,
                                input);
                }
                return null;
            }
        };
        ops[0xd9] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_Md_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_Md_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_Md_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldenv_o16_M_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldcw_Mw_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fnstenv_o16_M_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fnstcw_Mw_mem(blockStart, eip, prefices,
                                    input);
                    }
                }
                switch (modrm) {
                    case 0xc0:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST0(blockStart, eip, prefices, input);
                    case 0xc1:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST1(blockStart, eip, prefices, input);
                    case 0xc2:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST2(blockStart, eip, prefices, input);
                    case 0xc3:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST3(blockStart, eip, prefices, input);
                    case 0xc4:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST4(blockStart, eip, prefices, input);
                    case 0xc5:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST5(blockStart, eip, prefices, input);
                    case 0xc6:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST6(blockStart, eip, prefices, input);
                    case 0xc7:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST7(blockStart, eip, prefices, input);
                    case 0xc8:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xc9:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST1(blockStart, eip, prefices,
                                input);
                    case 0xca:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST2(blockStart, eip, prefices,
                                input);
                    case 0xcb:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST3(blockStart, eip, prefices,
                                input);
                    case 0xcc:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST4(blockStart, eip, prefices,
                                input);
                    case 0xcd:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST5(blockStart, eip, prefices,
                                input);
                    case 0xce:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST6(blockStart, eip, prefices,
                                input);
                    case 0xcf:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST7(blockStart, eip, prefices,
                                input);
                    case 0xd0:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xd1:
                    case 0xd2:
                    case 0xd3:
                    case 0xd4:
                    case 0xd5:
                    case 0xd6:
                    case 0xd7:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xd8:
                    case 0xd9:
                    case 0xda:
                    case 0xdb:
                    case 0xdc:
                    case 0xdd:
                    case 0xde:
                    case 0xdf:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xe0:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fchs(blockStart, eip, prefices, input);
                    case 0xe1:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fabs(blockStart, eip, prefices, input);
                    case 0xe2:
                    case 0xe3:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xe4:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ftst(blockStart, eip, prefices, input);
                    case 0xe5:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxam(blockStart, eip, prefices, input);
                    case 0xe6:
                    case 0xe7:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xe8:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld1(blockStart, eip, prefices, input);
                    case 0xe9:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldl2t(blockStart, eip, prefices, input);
                    case 0xea:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldl2e(blockStart, eip, prefices, input);
                    case 0xeb:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldpi(blockStart, eip, prefices, input);
                    case 0xec:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldlg2(blockStart, eip, prefices, input);
                    case 0xed:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldln2(blockStart, eip, prefices, input);
                    case 0xee:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldz(blockStart, eip, prefices, input);
                    case 0xef:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xf0:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.f2xm1(blockStart, eip, prefices, input);
                    case 0xf1:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fyl2x(blockStart, eip, prefices, input);
                    case 0xf2:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fptan(blockStart, eip, prefices, input);
                    case 0xf3:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fpatan(blockStart, eip, prefices, input);
                    case 0xf4:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xf5:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fprem1(blockStart, eip, prefices, input);
                    case 0xf6:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xf7:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fincstp(blockStart, eip, prefices, input);
                    case 0xf8:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fprem(blockStart, eip, prefices, input);
                    case 0xf9:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fyl2xp1(blockStart, eip, prefices, input);
                    case 0xfa:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsqrt(blockStart, eip, prefices, input);
                    case 0xfb:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xfc:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.frndint(blockStart, eip, prefices, input);
                    case 0xfd:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fscale(blockStart, eip, prefices, input);
                    case 0xfe:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsin(blockStart, eip, prefices, input);
                    case 0xff:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcos(blockStart, eip, prefices, input);
                }
                return null;
            }
        };
        ops[0xda] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fiadd_Md_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fimul_Md_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fisub_Md_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fisubr_Md_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fidiv_Md_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fidivr_Md_mem(blockStart, eip, prefices,
                                    input);
                    }
                }
                switch (modrm) {
                    case 0xc0:
                    case 0xc1:
                    case 0xc2:
                    case 0xc3:
                    case 0xc4:
                    case 0xc5:
                    case 0xc6:
                    case 0xc7:
                    case 0xc8:
                    case 0xc9:
                    case 0xca:
                    case 0xcb:
                    case 0xcc:
                    case 0xcd:
                    case 0xce:
                    case 0xcf:
                    case 0xd0:
                    case 0xd1:
                    case 0xd2:
                    case 0xd3:
                    case 0xd4:
                    case 0xd5:
                    case 0xd6:
                    case 0xd7:
                    case 0xd8:
                    case 0xd9:
                    case 0xda:
                    case 0xdb:
                    case 0xdc:
                    case 0xdd:
                    case 0xde:
                    case 0xdf:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xe0:
                    case 0xe1:
                    case 0xe2:
                    case 0xe3:
                    case 0xe4:
                    case 0xe5:
                    case 0xe6:
                    case 0xe7:
                    case 0xe8:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xe9:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucompp(blockStart, eip, prefices, input);
                    case 0xea:
                    case 0xeb:
                    case 0xec:
                    case 0xed:
                    case 0xee:
                    case 0xef:
                    case 0xf0:
                    case 0xf1:
                    case 0xf2:
                    case 0xf3:
                    case 0xf4:
                    case 0xf5:
                    case 0xf6:
                    case 0xf7:
                    case 0xf8:
                    case 0xf9:
                    case 0xfa:
                    case 0xfb:
                    case 0xfc:
                    case 0xfd:
                    case 0xfe:
                    case 0xff:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                }
                return null;
            }
        };
        ops[0xdb] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fild_Md_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fist_Md_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fistp_Md_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_Mt_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_Mt_mem(blockStart, eip, prefices,
                                    input);
                    }
                }
                switch (modrm) {
                    case 0xc0:
                    case 0xc1:
                    case 0xc2:
                    case 0xc3:
                    case 0xc4:
                    case 0xc5:
                    case 0xc6:
                    case 0xc7:
                    case 0xc8:
                    case 0xc9:
                    case 0xca:
                    case 0xcb:
                    case 0xcc:
                    case 0xcd:
                    case 0xce:
                    case 0xcf:
                    case 0xd0:
                    case 0xd1:
                    case 0xd2:
                    case 0xd3:
                    case 0xd4:
                    case 0xd5:
                    case 0xd6:
                    case 0xd7:
                    case 0xd8:
                    case 0xd9:
                    case 0xda:
                    case 0xdb:
                    case 0xdc:
                    case 0xdd:
                    case 0xde:
                    case 0xdf:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xe0:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xe1:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fndisi(blockStart, eip, prefices, input);
                    case 0xe2:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fclex(blockStart, eip, prefices, input);
                    case 0xe3:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fninit(blockStart, eip, prefices, input);
                    case 0xe4:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsetpm(blockStart, eip, prefices, input);
                    case 0xe5:
                    case 0xe6:
                    case 0xe7:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xe8:
                    case 0xe9:
                    case 0xea:
                    case 0xeb:
                    case 0xec:
                    case 0xed:
                    case 0xee:
                    case 0xef:
                    case 0xf0:
                    case 0xf1:
                    case 0xf2:
                    case 0xf3:
                    case 0xf4:
                    case 0xf5:
                    case 0xf6:
                    case 0xf7:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xf8:
                    case 0xf9:
                    case 0xfa:
                    case 0xfb:
                    case 0xfc:
                    case 0xfd:
                    case 0xfe:
                    case 0xff:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                }
                return null;
            }
        };
        ops[0xdc] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fadd_Mq_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmul_Mq_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcom_Mq_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcomp_Mq_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsub_Mq_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubr_Mq_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdiv_Mq_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivr_Mq_mem(blockStart, eip, prefices,
                                    input);
                    }
                }
                switch (modrm) {
                    case 0xc0:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fadd_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xc1:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fadd_ST1_ST0(blockStart, eip, prefices,
                                input);
                    case 0xc2:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fadd_ST2_ST0(blockStart, eip, prefices,
                                input);
                    case 0xc3:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fadd_ST3_ST0(blockStart, eip, prefices,
                                input);
                    case 0xc4:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fadd_ST4_ST0(blockStart, eip, prefices,
                                input);
                    case 0xc5:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fadd_ST5_ST0(blockStart, eip, prefices,
                                input);
                    case 0xc6:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fadd_ST6_ST0(blockStart, eip, prefices,
                                input);
                    case 0xc7:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fadd_ST7_ST0(blockStart, eip, prefices,
                                input);
                    case 0xc8:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmul_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xc9:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmul_ST1_ST0(blockStart, eip, prefices,
                                input);
                    case 0xca:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmul_ST2_ST0(blockStart, eip, prefices,
                                input);
                    case 0xcb:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmul_ST3_ST0(blockStart, eip, prefices,
                                input);
                    case 0xcc:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmul_ST4_ST0(blockStart, eip, prefices,
                                input);
                    case 0xcd:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmul_ST5_ST0(blockStart, eip, prefices,
                                input);
                    case 0xce:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmul_ST6_ST0(blockStart, eip, prefices,
                                input);
                    case 0xcf:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmul_ST7_ST0(blockStart, eip, prefices,
                                input);
                    case 0xd0:
                    case 0xd1:
                    case 0xd2:
                    case 0xd3:
                    case 0xd4:
                    case 0xd5:
                    case 0xd6:
                    case 0xd7:
                    case 0xd8:
                    case 0xd9:
                    case 0xda:
                    case 0xdb:
                    case 0xdc:
                    case 0xdd:
                    case 0xde:
                    case 0xdf:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xe0:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubr_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xe1:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubr_ST1_ST0(blockStart, eip, prefices,
                                input);
                    case 0xe2:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubr_ST2_ST0(blockStart, eip, prefices,
                                input);
                    case 0xe3:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubr_ST3_ST0(blockStart, eip, prefices,
                                input);
                    case 0xe4:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubr_ST4_ST0(blockStart, eip, prefices,
                                input);
                    case 0xe5:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubr_ST5_ST0(blockStart, eip, prefices,
                                input);
                    case 0xe6:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubr_ST6_ST0(blockStart, eip, prefices,
                                input);
                    case 0xe7:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubr_ST7_ST0(blockStart, eip, prefices,
                                input);
                    case 0xe8:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsub_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xe9:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsub_ST1_ST0(blockStart, eip, prefices,
                                input);
                    case 0xea:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsub_ST2_ST0(blockStart, eip, prefices,
                                input);
                    case 0xeb:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsub_ST3_ST0(blockStart, eip, prefices,
                                input);
                    case 0xec:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsub_ST4_ST0(blockStart, eip, prefices,
                                input);
                    case 0xed:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsub_ST5_ST0(blockStart, eip, prefices,
                                input);
                    case 0xee:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsub_ST6_ST0(blockStart, eip, prefices,
                                input);
                    case 0xef:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsub_ST7_ST0(blockStart, eip, prefices,
                                input);
                    case 0xf0:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivr_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xf1:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivr_ST1_ST0(blockStart, eip, prefices,
                                input);
                    case 0xf2:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivr_ST2_ST0(blockStart, eip, prefices,
                                input);
                    case 0xf3:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivr_ST3_ST0(blockStart, eip, prefices,
                                input);
                    case 0xf4:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivr_ST4_ST0(blockStart, eip, prefices,
                                input);
                    case 0xf5:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivr_ST5_ST0(blockStart, eip, prefices,
                                input);
                    case 0xf6:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivr_ST6_ST0(blockStart, eip, prefices,
                                input);
                    case 0xf7:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivr_ST7_ST0(blockStart, eip, prefices,
                                input);
                    case 0xf8:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdiv_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xf9:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdiv_ST1_ST0(blockStart, eip, prefices,
                                input);
                    case 0xfa:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdiv_ST2_ST0(blockStart, eip, prefices,
                                input);
                    case 0xfb:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdiv_ST3_ST0(blockStart, eip, prefices,
                                input);
                    case 0xfc:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdiv_ST4_ST0(blockStart, eip, prefices,
                                input);
                    case 0xfd:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdiv_ST5_ST0(blockStart, eip, prefices,
                                input);
                    case 0xfe:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdiv_ST6_ST0(blockStart, eip, prefices,
                                input);
                    case 0xff:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdiv_ST7_ST0(blockStart, eip, prefices,
                                input);
                }
                return null;
            }
        };
        ops[0xdd] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_Mq_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_Mq_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_Mq_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.frstor_o16_M_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fnsave_o16_M_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fnstsw_Mw_mem(blockStart, eip, prefices,
                                    input);
                    }
                }
                switch (modrm) {
                    case 0xc0:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ffree_ST0(blockStart, eip, prefices, input);
                    case 0xc1:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ffree_ST1(blockStart, eip, prefices, input);
                    case 0xc2:
                    case 0xc3:
                    case 0xc4:
                    case 0xc5:
                    case 0xc6:
                    case 0xc7:
                    case 0xc8:
                    case 0xc9:
                    case 0xca:
                    case 0xcb:
                    case 0xcc:
                    case 0xcd:
                    case 0xce:
                    case 0xcf:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xd0:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST0(blockStart, eip, prefices, input);
                    case 0xd1:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST1(blockStart, eip, prefices, input);
                    case 0xd2:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST2(blockStart, eip, prefices, input);
                    case 0xd3:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST3(blockStart, eip, prefices, input);
                    case 0xd4:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST4(blockStart, eip, prefices, input);
                    case 0xd5:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST5(blockStart, eip, prefices, input);
                    case 0xd6:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST6(blockStart, eip, prefices, input);
                    case 0xd7:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST7(blockStart, eip, prefices, input);
                    case 0xd8:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST0(blockStart, eip, prefices, input);
                    case 0xd9:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST1(blockStart, eip, prefices, input);
                    case 0xda:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST2(blockStart, eip, prefices, input);
                    case 0xdb:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST3(blockStart, eip, prefices, input);
                    case 0xdc:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST4(blockStart, eip, prefices, input);
                    case 0xdd:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST5(blockStart, eip, prefices, input);
                    case 0xde:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST6(blockStart, eip, prefices, input);
                    case 0xdf:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST7(blockStart, eip, prefices, input);
                    case 0xe0:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST0(blockStart, eip, prefices, input);
                    case 0xe1:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST1(blockStart, eip, prefices, input);
                    case 0xe2:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST2(blockStart, eip, prefices, input);
                    case 0xe3:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST3(blockStart, eip, prefices, input);
                    case 0xe4:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST4(blockStart, eip, prefices, input);
                    case 0xe5:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST5(blockStart, eip, prefices, input);
                    case 0xe6:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST6(blockStart, eip, prefices, input);
                    case 0xe7:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST7(blockStart, eip, prefices, input);
                    case 0xe8:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST0(blockStart, eip, prefices, input);
                    case 0xe9:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST1(blockStart, eip, prefices, input);
                    case 0xea:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST2(blockStart, eip, prefices, input);
                    case 0xeb:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST3(blockStart, eip, prefices, input);
                    case 0xec:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST4(blockStart, eip, prefices, input);
                    case 0xed:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST5(blockStart, eip, prefices, input);
                    case 0xee:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST6(blockStart, eip, prefices, input);
                    case 0xef:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST7(blockStart, eip, prefices, input);
                    case 0xf0:
                    case 0xf1:
                    case 0xf2:
                    case 0xf3:
                    case 0xf4:
                    case 0xf5:
                    case 0xf6:
                    case 0xf7:
                    case 0xf8:
                    case 0xf9:
                    case 0xfa:
                    case 0xfb:
                    case 0xfc:
                    case 0xfd:
                    case 0xfe:
                    case 0xff:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                }
                return null;
            }
        };
        ops[0xde] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fiadd_Mw_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fimul_Mw_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fisub_Mw_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fisubr_Mw_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fidiv_Mw_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fidivr_Mw_mem(blockStart, eip, prefices,
                                    input);
                    }
                }
                switch (modrm) {
                    case 0xc0:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.faddp_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xc1:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.faddp_ST1_ST0(blockStart, eip, prefices,
                                input);
                    case 0xc2:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.faddp_ST2_ST0(blockStart, eip, prefices,
                                input);
                    case 0xc3:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.faddp_ST3_ST0(blockStart, eip, prefices,
                                input);
                    case 0xc4:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.faddp_ST4_ST0(blockStart, eip, prefices,
                                input);
                    case 0xc5:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.faddp_ST5_ST0(blockStart, eip, prefices,
                                input);
                    case 0xc6:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.faddp_ST6_ST0(blockStart, eip, prefices,
                                input);
                    case 0xc7:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.faddp_ST7_ST0(blockStart, eip, prefices,
                                input);
                    case 0xc8:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmulp_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xc9:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmulp_ST1_ST0(blockStart, eip, prefices,
                                input);
                    case 0xca:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmulp_ST2_ST0(blockStart, eip, prefices,
                                input);
                    case 0xcb:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmulp_ST3_ST0(blockStart, eip, prefices,
                                input);
                    case 0xcc:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmulp_ST4_ST0(blockStart, eip, prefices,
                                input);
                    case 0xcd:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmulp_ST5_ST0(blockStart, eip, prefices,
                                input);
                    case 0xce:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmulp_ST6_ST0(blockStart, eip, prefices,
                                input);
                    case 0xcf:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fmulp_ST7_ST0(blockStart, eip, prefices,
                                input);
                    case 0xd0:
                    case 0xd1:
                    case 0xd2:
                    case 0xd3:
                    case 0xd4:
                    case 0xd5:
                    case 0xd6:
                    case 0xd7:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xd8:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xd9:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcompp(blockStart, eip, prefices, input);
                    case 0xda:
                    case 0xdb:
                    case 0xdc:
                    case 0xdd:
                    case 0xde:
                    case 0xdf:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xe0:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubrp_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xe1:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubrp_ST1_ST0(blockStart, eip, prefices,
                                input);
                    case 0xe2:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubrp_ST2_ST0(blockStart, eip, prefices,
                                input);
                    case 0xe3:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubrp_ST3_ST0(blockStart, eip, prefices,
                                input);
                    case 0xe4:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubrp_ST4_ST0(blockStart, eip, prefices,
                                input);
                    case 0xe5:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubrp_ST5_ST0(blockStart, eip, prefices,
                                input);
                    case 0xe6:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubrp_ST6_ST0(blockStart, eip, prefices,
                                input);
                    case 0xe7:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubrp_ST7_ST0(blockStart, eip, prefices,
                                input);
                    case 0xe8:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubp_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xe9:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubp_ST1_ST0(blockStart, eip, prefices,
                                input);
                    case 0xea:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubp_ST2_ST0(blockStart, eip, prefices,
                                input);
                    case 0xeb:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubp_ST3_ST0(blockStart, eip, prefices,
                                input);
                    case 0xec:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubp_ST4_ST0(blockStart, eip, prefices,
                                input);
                    case 0xed:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubp_ST5_ST0(blockStart, eip, prefices,
                                input);
                    case 0xee:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubp_ST6_ST0(blockStart, eip, prefices,
                                input);
                    case 0xef:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsubp_ST7_ST0(blockStart, eip, prefices,
                                input);
                    case 0xf0:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivrp_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xf1:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivrp_ST1_ST0(blockStart, eip, prefices,
                                input);
                    case 0xf2:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivrp_ST2_ST0(blockStart, eip, prefices,
                                input);
                    case 0xf3:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivrp_ST3_ST0(blockStart, eip, prefices,
                                input);
                    case 0xf4:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivrp_ST4_ST0(blockStart, eip, prefices,
                                input);
                    case 0xf5:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivrp_ST5_ST0(blockStart, eip, prefices,
                                input);
                    case 0xf6:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivrp_ST6_ST0(blockStart, eip, prefices,
                                input);
                    case 0xf7:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivrp_ST7_ST0(blockStart, eip, prefices,
                                input);
                    case 0xf8:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivp_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xf9:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivp_ST1_ST0(blockStart, eip, prefices,
                                input);
                    case 0xfa:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivp_ST2_ST0(blockStart, eip, prefices,
                                input);
                    case 0xfb:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivp_ST3_ST0(blockStart, eip, prefices,
                                input);
                    case 0xfc:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivp_ST4_ST0(blockStart, eip, prefices,
                                input);
                    case 0xfd:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivp_ST5_ST0(blockStart, eip, prefices,
                                input);
                    case 0xfe:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivp_ST6_ST0(blockStart, eip, prefices,
                                input);
                    case 0xff:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fdivp_ST7_ST0(blockStart, eip, prefices,
                                input);
                }
                return null;
            }
        };
        ops[0xdf] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fild_Mw_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fisttp_Mw_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fist_Mw_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fistp_Mw_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fbld_Mt_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fild_Mq_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fbstp_Mt_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fistp_Mq_mem(blockStart, eip, prefices,
                                    input);
                    }
                }
                switch (modrm) {
                    case 0xc0:
                    case 0xc1:
                    case 0xc2:
                    case 0xc3:
                    case 0xc4:
                    case 0xc5:
                    case 0xc6:
                    case 0xc7:
                    case 0xc8:
                    case 0xc9:
                    case 0xca:
                    case 0xcb:
                    case 0xcc:
                    case 0xcd:
                    case 0xce:
                    case 0xcf:
                    case 0xd0:
                    case 0xd1:
                    case 0xd2:
                    case 0xd3:
                    case 0xd4:
                    case 0xd5:
                    case 0xd6:
                    case 0xd7:
                    case 0xd8:
                    case 0xd9:
                    case 0xda:
                    case 0xdb:
                    case 0xdc:
                    case 0xdd:
                    case 0xde:
                    case 0xdf:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xe0:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fnstsw_AX(blockStart, eip, prefices, input);
                    case 0xe1:
                    case 0xe2:
                    case 0xe3:
                    case 0xe4:
                    case 0xe5:
                    case 0xe6:
                    case 0xe7:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xe8:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomip_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xe9:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomip_ST0_ST1(blockStart, eip, prefices,
                                input);
                    case 0xea:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomip_ST0_ST2(blockStart, eip, prefices,
                                input);
                    case 0xeb:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomip_ST0_ST3(blockStart, eip, prefices,
                                input);
                    case 0xec:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomip_ST0_ST4(blockStart, eip, prefices,
                                input);
                    case 0xed:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomip_ST0_ST5(blockStart, eip, prefices,
                                input);
                    case 0xee:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomip_ST0_ST6(blockStart, eip, prefices,
                                input);
                    case 0xef:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomip_ST0_ST7(blockStart, eip, prefices,
                                input);
                    case 0xf0:
                    case 0xf1:
                    case 0xf2:
                    case 0xf3:
                    case 0xf4:
                    case 0xf5:
                    case 0xf6:
                    case 0xf7:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xf8:
                    case 0xf9:
                    case 0xfa:
                    case 0xfb:
                    case 0xfc:
                    case 0xfd:
                    case 0xfe:
                    case 0xff:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                }
                return null;
            }
        };
        ops[0xe0] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.loopne_a16_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0xe1] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.loope_a16_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0xe2] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.loop_a16_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0xe3] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jcxz_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0xe4] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.in_AL_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0xe5] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.in_o16_eAX_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0xe6] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.out_Ib_AL(blockStart, eip, prefices, input);
            }
        };
        ops[0xe7] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0xe8] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.call_Jw(blockStart, eip, prefices, input);
            }
        };
        ops[0xe9] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jmp_Jw(blockStart, eip, prefices, input);
            }
        };
        ops[0xea] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jmp_Ap(blockStart, eip, prefices, input);
            }
        };
        ops[0xeb] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jmp_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0xec] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.in_AL_DX(blockStart, eip, prefices, input);
            }
        };
        ops[0xed] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.in_o16_eAX_DX(blockStart, eip, prefices, input);
            }
        };
        ops[0xee] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.out_DX_AL(blockStart, eip, prefices, input);
            }
        };
        ops[0xef] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.out_o16_DX_eAX(blockStart, eip, prefices, input);
            }
        };
        ops[0xf0] = null;
        ops[0xf1] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0xf2] = null;
        ops[0xf3] = null;
        ops[0xf4] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.hlt(blockStart, eip, prefices, input);
            }
        };
        ops[0xf5] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmc(blockStart, eip, prefices, input);
            }
        };
        ops[0xf6] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.test_Eb_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.not_Eb_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.neg_Eb_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mul_Eb_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Eb_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.div_Eb_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.idiv_Eb_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.test_Eb_Ib(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.not_Eb(blockStart, eip, prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.neg_Eb(blockStart, eip, prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mul_Eb(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Eb(blockStart, eip, prefices, input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.div_Eb(blockStart, eip, prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.idiv_Eb(blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0xf7] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.test_Ew_Iw_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.not_Ew_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.neg_Ew_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mul_Ew_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Ew_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.div_Ew_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.idiv_Ew_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.test_Ew_Iw(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.not_Ew(blockStart, eip, prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.neg_Ew(blockStart, eip, prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mul_Ew(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Ew(blockStart, eip, prefices, input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.div_Ew(blockStart, eip, prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.idiv_Ew(blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0xf8] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.clc(blockStart, eip, prefices, input);
            }
        };
        ops[0xf9] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.stc(blockStart, eip, prefices, input);
            }
        };
        ops[0xfa] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cli(blockStart, eip, prefices, input);
            }
        };
        ops[0xfb] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sti(blockStart, eip, prefices, input);
            }
        };
        ops[0xfc] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cld(blockStart, eip, prefices, input);
            }
        };
        ops[0xfd] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.std(blockStart, eip, prefices, input);
            }
        };
        ops[0xfe] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_Eb_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_Eb_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_Eb(blockStart, eip, prefices, input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_Eb(blockStart, eip, prefices, input);
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                }
                return null;
            }
        };
        ops[0xff] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_Ew_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_Ew_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.call_o16_Ew_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.call_o16_Ep_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jmp_Ew_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jmp_Ep_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_Ew_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_Ew(blockStart, eip, prefices, input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_Ew(blockStart, eip, prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.call_o16_Ew(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jmp_Ew(blockStart, eip, prefices, input);
                        case 0x05:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_Ew(blockStart, eip, prefices, input);
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                }
                return null;
            }
        };
        ops[0x100] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sldt_Ew_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                        case 0x02:
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.verr_Ew_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sldt_Ew(blockStart, eip, prefices, input);
                        case 0x01:
                        case 0x02:
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.verr_Ew(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                }
                return null;
            }
        };
        ops[0x101] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.smsw_Ew_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                    }
                }
                switch (modrm) {
                    case 0xc0:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xc1:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xc2:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xc3:
                    case 0xc4:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xc5:
                    case 0xc6:
                    case 0xc7:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xc8:
                    case 0xc9:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xca:
                    case 0xcb:
                    case 0xcc:
                    case 0xcd:
                    case 0xce:
                    case 0xcf:
                    case 0xd0:
                    case 0xd1:
                    case 0xd2:
                    case 0xd3:
                    case 0xd4:
                    case 0xd5:
                    case 0xd6:
                    case 0xd7:
                    case 0xd8:
                    case 0xd9:
                    case 0xda:
                    case 0xdb:
                    case 0xdc:
                    case 0xdd:
                    case 0xde:
                    case 0xdf:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xe0:
                    case 0xe1:
                    case 0xe2:
                    case 0xe3:
                    case 0xe4:
                    case 0xe5:
                    case 0xe6:
                    case 0xe7:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.smsw_Ew(blockStart, eip, prefices, input);
                    case 0xe8:
                    case 0xe9:
                    case 0xea:
                    case 0xeb:
                    case 0xec:
                    case 0xed:
                    case 0xee:
                    case 0xef:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xf0:
                    case 0xf1:
                    case 0xf2:
                    case 0xf3:
                    case 0xf4:
                    case 0xf5:
                    case 0xf6:
                    case 0xf7:
                    case 0xf8:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xf9:
                    case 0xfa:
                    case 0xfb:
                    case 0xfc:
                    case 0xfd:
                    case 0xfe:
                    case 0xff:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                }
                return null;
            }
        };
        ops[0x102] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x103] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x104] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x105] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x106] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x107] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x108] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x109] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x10a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x10b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x10c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x10d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x10e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x10f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x110] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x111] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x112] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x113] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x114] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x115] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x116] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x117] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x118] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                }
                return null;
            }
        };
        ops[0x119] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.nop_M_mem(blockStart, eip, prefices, input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x11a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.nop_M_mem(blockStart, eip, prefices, input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x11b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.nop_M_mem(blockStart, eip, prefices, input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x11c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.nop_M_mem(blockStart, eip, prefices, input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x11d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.nop_M_mem(blockStart, eip, prefices, input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x11e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.nop_M_mem(blockStart, eip, prefices, input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x11f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.nop_M_mem(blockStart, eip, prefices, input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x120] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_R_C(blockStart, eip, prefices, input);
            }
        };
        ops[0x121] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x122] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x123] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x124] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x125] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x126] = null;
        ops[0x127] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x128] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x129] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x12a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x12b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x12c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x12d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x12e] = null;
        ops[0x12f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x130] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x131] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x132] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x133] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x134] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x135] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x136] = null;
        ops[0x137] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x138] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x139] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x13a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x13b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x13c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x13d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x13e] = null;
        ops[0x13f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x140] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x141] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x142] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x143] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x144] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x145] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x146] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x147] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x148] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x149] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x14a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x14b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x14c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x14d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x14e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x14f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x150] = null;
        ops[0x151] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x152] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x153] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x154] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x155] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x156] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x157] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x158] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x159] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x15a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x15b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x15c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x15d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x15e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x15f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x160] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x161] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x162] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x163] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x164] = null;
        ops[0x165] = null;
        ops[0x166] = null;
        ops[0x167] = null;
        ops[0x168] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x169] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x16a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x16b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x16c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x16d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x16e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x16f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x170] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x171] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x03:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x05:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x03:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x05:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                }
                return null;
            }
        };
        ops[0x172] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x03:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x05:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x03:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x05:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                }
                return null;
            }
        };
        ops[0x173] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x03:
                        case 0x04:
                        case 0x05:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x03:
                        case 0x04:
                        case 0x05:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                }
                return null;
            }
        };
        ops[0x174] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x175] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x176] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x177] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x178] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x179] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x17a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x17b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x17c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x17d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x17e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x17f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x180] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jo_Jw(blockStart, eip, prefices, input);
            }
        };
        ops[0x181] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jno_Jw(blockStart, eip, prefices, input);
            }
        };
        ops[0x182] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jb_Jw(blockStart, eip, prefices, input);
            }
        };
        ops[0x183] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jae_Jw(blockStart, eip, prefices, input);
            }
        };
        ops[0x184] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.je_Jw(blockStart, eip, prefices, input);
            }
        };
        ops[0x185] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jne_Jw(blockStart, eip, prefices, input);
            }
        };
        ops[0x186] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jbe_Jw(blockStart, eip, prefices, input);
            }
        };
        ops[0x187] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ja_Jw(blockStart, eip, prefices, input);
            }
        };
        ops[0x188] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.js_Jw(blockStart, eip, prefices, input);
            }
        };
        ops[0x189] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jns_Jw(blockStart, eip, prefices, input);
            }
        };
        ops[0x18a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jp_Jw(blockStart, eip, prefices, input);
            }
        };
        ops[0x18b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jnp_Jw(blockStart, eip, prefices, input);
            }
        };
        ops[0x18c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jl_Jw(blockStart, eip, prefices, input);
            }
        };
        ops[0x18d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jge_Jw(blockStart, eip, prefices, input);
            }
        };
        ops[0x18e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jle_Jw(blockStart, eip, prefices, input);
            }
        };
        ops[0x18f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jg_Jw(blockStart, eip, prefices, input);
            }
        };
        ops[0x190] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x191] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x192] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x193] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x194] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x195] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x196] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x197] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x198] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x199] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x19a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x19b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x19c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x19d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x19e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x19f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1a0] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o16_FS(blockStart, eip, prefices, input);
            }
        };
        ops[0x1a1] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o16_FS(blockStart, eip, prefices, input);
            }
        };
        ops[0x1a2] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1a3] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bt_Ew_Gw_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bt_Ew_Gw(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x1a4] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shld_Ew_Gw_Ib_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shld_Ew_Gw_Ib(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x1a5] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shld_Ew_Gw_CL_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shld_Ew_Gw_CL(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x1a6] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x1a7] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x1a8] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o16_GS(blockStart, eip, prefices, input);
            }
        };
        ops[0x1a9] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o16_GS(blockStart, eip, prefices, input);
            }
        };
        ops[0x1aa] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1ab] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bts_Ew_Gw_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bts_Ew_Gw(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x1ac] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shrd_Ew_Gw_Ib_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shrd_Ew_Gw_Ib(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x1ad] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shrd_Ew_Gw_CL_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shrd_Ew_Gw_CL(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x1ae] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x04:
                        case 0x05:
                        case 0x06:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x04:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x1af] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Gw_Ew_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Gw_Ew(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x1b0] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1b1] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1b2] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lss_o16_Gw_M_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode/*(Disassembler.java line 189)*/(
                                    blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x1b3] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btr_Ew_Gw_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btr_Ew_Gw(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x1b4] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lfs_o16_Gw_M_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode/*(Disassembler.java line 189)*/(
                                    blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x1b5] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lgs_o16_Gw_M_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode/*(Disassembler.java line 189)*/(
                                    blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x1b6] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movzx_Gw_Eb_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movzx_Gw_Eb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x1b7] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1b8] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x1b9] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x1ba] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bt_Ew_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bts_Ew_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btr_Ew_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btc_Ew_Ib_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bt_Ew_Ib(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bts_Ew_Ib(blockStart, eip, prefices, input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btr_Ew_Ib(blockStart, eip, prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btc_Ew_Ib(blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x1bb] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btc_Ew_Gw_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btc_Ew_Gw(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x1bc] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bsf_Gw_Ew_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bsf_Gw_Ew(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x1bd] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1be] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movsx_Gw_Eb_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movsx_Gw_Eb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x1bf] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1c0] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1c1] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1c2] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1c3] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1c4] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1c5] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1c6] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1c7] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x1c8] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o16_rAXr8(blockStart, eip, prefices, input);
            }
        };
        ops[0x1c9] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o16_rCXr9(blockStart, eip, prefices, input);
            }
        };
        ops[0x1ca] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o16_rDXr10(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1cb] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o16_rBXr11(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1cc] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o16_rSPr12(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1cd] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o16_rBPr13(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1ce] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o16_rSIr14(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1cf] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o16_rDIr15(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1d0] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x1d1] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1d2] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1d3] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1d4] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1d5] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1d6] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x1d7] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1d8] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1d9] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1da] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1db] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1dc] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1dd] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1de] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1df] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1e0] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1e1] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1e2] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1e3] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1e4] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1e5] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1e6] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x1e7] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1e8] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1e9] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1ea] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1eb] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1ec] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1ed] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1ee] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1ef] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1f0] = null;
        ops[0x1f1] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1f2] = null;
        ops[0x1f3] = null;
        ops[0x1f4] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1f5] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1f6] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1f7] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1f8] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1f9] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1fa] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1fb] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1fc] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1fd] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x1fe] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x1ff] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
        };
        ops[0x200] = ops[0x0];

        ops[0x201] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Ed_Gd_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x202] = ops[0x2];

        ops[0x203] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Gd_Ed_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Gd_Ed(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x204] = ops[0x4];

        ops[0x205] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_o32_rAX_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x206] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x207] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x208] = ops[0x8];

        ops[0x209] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Ed_Gd_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x20a] = ops[0xa];

        ops[0x20b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Gd_Ed_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Gd_Ed(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x20c] = ops[0xc];

        ops[0x20d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_o32_rAX_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x20e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o32_CS(blockStart, eip, prefices, input);
            }
        };
        ops[0x20f] = null;
        ops[0x210] = ops[0x10];

        ops[0x211] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Ed_Gd_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x212] = ops[0x12];

        ops[0x213] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Gd_Ed_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Gd_Ed(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x214] = ops[0x14];

        ops[0x215] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x216] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x217] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x218] = ops[0x18];

        ops[0x219] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Ed_Gd_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x21a] = ops[0x1a];

        ops[0x21b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Gd_Ed_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Gd_Ed(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x21c] = ops[0x1c];

        ops[0x21d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_o32_rAX_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x21e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x21f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x220] = ops[0x20];

        ops[0x221] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Ed_Gd_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x222] = ops[0x22];

        ops[0x223] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Gd_Ed_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Gd_Ed(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x224] = ops[0x24];

        ops[0x225] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_o32_rAX_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x226] = null;
        ops[0x227] = ops[0x27];

        ops[0x228] = ops[0x28];

        ops[0x229] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Ed_Gd_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x22a] = ops[0x2a];

        ops[0x22b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Gd_Ed_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Gd_Ed(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x22c] = ops[0x2c];

        ops[0x22d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_o32_rAX_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x22e] = null;
        ops[0x22f] = ops[0x2f];

        ops[0x230] = ops[0x30];

        ops[0x231] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Ed_Gd_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x232] = ops[0x32];

        ops[0x233] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Gd_Ed_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Gd_Ed(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x234] = ops[0x34];

        ops[0x235] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_o32_rAX_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x236] = null;
        ops[0x237] = ops[0x37];

        ops[0x238] = ops[0x38];

        ops[0x239] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Ed_Gd_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x23a] = ops[0x3a];

        ops[0x23b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Gd_Ed_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Gd_Ed(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x23c] = ops[0x3c];

        ops[0x23d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_o32_rAX_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x23e] = null;
        ops[0x23f] = ops[0x3f];

        ops[0x240] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o32_eAX(blockStart, eip, prefices, input);
            }
        };
        ops[0x241] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o32_eCX(blockStart, eip, prefices, input);
            }
        };
        ops[0x242] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o32_eDX(blockStart, eip, prefices, input);
            }
        };
        ops[0x243] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o32_eBX(blockStart, eip, prefices, input);
            }
        };
        ops[0x244] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o32_eSP(blockStart, eip, prefices, input);
            }
        };
        ops[0x245] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o32_eBP(blockStart, eip, prefices, input);
            }
        };
        ops[0x246] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o32_eSI(blockStart, eip, prefices, input);
            }
        };
        ops[0x247] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o32_eDI(blockStart, eip, prefices, input);
            }
        };
        ops[0x248] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o32_eAX(blockStart, eip, prefices, input);
            }
        };
        ops[0x249] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o32_eCX(blockStart, eip, prefices, input);
            }
        };
        ops[0x24a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o32_eDX(blockStart, eip, prefices, input);
            }
        };
        ops[0x24b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o32_eBX(blockStart, eip, prefices, input);
            }
        };
        ops[0x24c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o32_eSP(blockStart, eip, prefices, input);
            }
        };
        ops[0x24d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o32_eBP(blockStart, eip, prefices, input);
            }
        };
        ops[0x24e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o32_eSI(blockStart, eip, prefices, input);
            }
        };
        ops[0x24f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o32_eDI(blockStart, eip, prefices, input);
            }
        };
        ops[0x250] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o32_rAXr8(blockStart, eip, prefices, input);
            }
        };
        ops[0x251] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o32_rCXr9(blockStart, eip, prefices, input);
            }
        };
        ops[0x252] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o32_rDXr10(blockStart, eip, prefices, input);
            }
        };
        ops[0x253] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o32_rBXr11(blockStart, eip, prefices, input);
            }
        };
        ops[0x254] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o32_rSPr12(blockStart, eip, prefices, input);
            }
        };
        ops[0x255] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o32_rBPr13(blockStart, eip, prefices, input);
            }
        };
        ops[0x256] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o32_rSIr14(blockStart, eip, prefices, input);
            }
        };
        ops[0x257] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o32_rDIr15(blockStart, eip, prefices, input);
            }
        };
        ops[0x258] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o32_rAXr8(blockStart, eip, prefices, input);
            }
        };
        ops[0x259] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o32_rCXr9(blockStart, eip, prefices, input);
            }
        };
        ops[0x25a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o32_rDXr10(blockStart, eip, prefices, input);
            }
        };
        ops[0x25b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o32_rBXr11(blockStart, eip, prefices, input);
            }
        };
        ops[0x25c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o32_rSPr12(blockStart, eip, prefices, input);
            }
        };
        ops[0x25d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o32_rBPr13(blockStart, eip, prefices, input);
            }
        };
        ops[0x25e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o32_rSIr14(blockStart, eip, prefices, input);
            }
        };
        ops[0x25f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o32_rDIr15(blockStart, eip, prefices, input);
            }
        };
        ops[0x260] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pushad(blockStart, eip, prefices, input);
            }
        };
        ops[0x261] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.popad(blockStart, eip, prefices, input);
            }
        };
        ops[0x262] = ops[0x62];

        ops[0x263] = ops[0x63];

        ops[0x264] = null;
        ops[0x265] = null;
        ops[0x266] = null;
        ops[0x267] = null;
        ops[0x268] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o32_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x269] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Gd_Ed_Id_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Gd_Ed_Id(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x26a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o32_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0x26b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Gd_Ed_Ib_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Gd_Ed_Ib(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x26c] = ops[0x6c];

        ops[0x26d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_insd_a16(blockStart, eip, prefices, input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_insd_a16(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x26e] = ops[0x6e];

        ops[0x26f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_outsd_a16(blockStart, eip, prefices, input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_outsd_a16(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.outsd_a16(blockStart, eip, prefices, input);
            }
        };
        ops[0x270] = ops[0x70];

        ops[0x271] = ops[0x71];

        ops[0x272] = ops[0x72];

        ops[0x273] = ops[0x73];

        ops[0x274] = ops[0x74];

        ops[0x275] = ops[0x75];

        ops[0x276] = ops[0x76];

        ops[0x277] = ops[0x77];

        ops[0x278] = ops[0x78];

        ops[0x279] = ops[0x79];

        ops[0x27a] = ops[0x7a];

        ops[0x27b] = ops[0x7b];

        ops[0x27c] = ops[0x7c];

        ops[0x27d] = ops[0x7d];

        ops[0x27e] = ops[0x7e];

        ops[0x27f] = ops[0x7f];

        ops[0x280] = ops[0x80];

        ops[0x281] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Ed_Id_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Ed_Id_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Ed_Id_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Ed_Id_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Ed_Id_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Ed_Id_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Ed_Id_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Ed_Id_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Ed_Id(blockStart, eip, prefices, input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Ed_Id(blockStart, eip, prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Ed_Id(blockStart, eip, prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Ed_Id(blockStart, eip, prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Ed_Id(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Ed_Id(blockStart, eip, prefices, input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Ed_Id(blockStart, eip, prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Ed_Id(blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x282] = ops[0x82];

        ops[0x283] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Ed_Ib(blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x284] = ops[0x84];

        ops[0x285] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.test_Ed_Gd_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.test_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x286] = ops[0x86];

        ops[0x287] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_Ed_Gd_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x288] = ops[0x88];

        ops[0x289] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Ed_Gd_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x28a] = ops[0x8a];

        ops[0x28b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Gd_Ed_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Gd_Ed(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x28c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Ed_S_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Ed_S(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x28d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lea_Gd_M_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode/*(Disassembler.java line 189)*/(
                                    blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x28e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x28f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_Ed_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_Ed(blockStart, eip, prefices, input);
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                }
                return null;
            }
        };
        ops[0x290] = ops[0x90];

        ops[0x291] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_o32_rCXr9_rAX(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x292] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_o32_rDXr10_rAX(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x293] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_o32_rBXr11_rAX(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x294] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_o32_rSPr12_rAX(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x295] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_o32_rBPr13_rAX(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x296] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_o32_rSIr14_rAX(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x297] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_o32_rDIr15_rAX(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x298] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cwde(blockStart, eip, prefices, input);
            }
        };
        ops[0x299] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cdq(blockStart, eip, prefices, input);
            }
        };
        ops[0x29a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x29b] = ops[0x9b];

        ops[0x29c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pushfd(blockStart, eip, prefices, input);
            }
        };
        ops[0x29d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.popfd(blockStart, eip, prefices, input);
            }
        };
        ops[0x29e] = ops[0x9e];

        ops[0x29f] = ops[0x9f];

        ops[0x2a0] = ops[0xa0];

        ops[0x2a1] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rAX_Od_mem(blockStart, eip, prefices, input);
            }
        };
        ops[0x2a2] = ops[0xa2];

        ops[0x2a3] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Od_rAX_mem(blockStart, eip, prefices, input);
            }
        };
        ops[0x2a4] = ops[0xa4];

        ops[0x2a5] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_movsd_a16(blockStart, eip, prefices, input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_movsd_a16(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movsd_a16(blockStart, eip, prefices, input);
            }
        };
        ops[0x2a6] = ops[0xa6];

        ops[0x2a7] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_cmpsd_a16(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmpsd_a16(blockStart, eip, prefices, input);
            }
        };
        ops[0x2a8] = ops[0xa8];

        ops[0x2a9] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.test_o32_rAX_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x2aa] = ops[0xaa];

        ops[0x2ab] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_stosd_a16(blockStart, eip, prefices, input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_stosd_a16(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.stosd_a16(blockStart, eip, prefices, input);
            }
        };
        ops[0x2ac] = ops[0xac];

        ops[0x2ad] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lodsd_a16(blockStart, eip, prefices, input);
            }
        };
        ops[0x2ae] = ops[0xae];

        ops[0x2af] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.repne_scasd_a16(blockStart, eip, prefices,
                            input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_scasd_a16(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x2b0] = ops[0xb0];

        ops[0x2b1] = ops[0xb1];

        ops[0x2b2] = ops[0xb2];

        ops[0x2b3] = ops[0xb3];

        ops[0x2b4] = ops[0xb4];

        ops[0x2b5] = ops[0xb5];

        ops[0x2b6] = ops[0xb6];

        ops[0x2b7] = ops[0xb7];

        ops[0x2b8] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rAXr8_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x2b9] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rCXr9_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x2ba] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rDXr10_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x2bb] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rBXr11_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x2bc] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rSPr12_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x2bd] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rBPr13_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x2be] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rSIr14_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x2bf] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rDIr15_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x2c0] = ops[0xc0];

        ops[0x2c1] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Ed_Ib(blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x2c2] = ops[0xc2];

        ops[0x2c3] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ret_o32(blockStart, eip, prefices, input);
            }
        };
        ops[0x2c4] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.les_o32_Gd_M_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode/*(Disassembler.java line 189)*/(
                                    blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x2c5] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lds_o32_Gd_M_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode/*(Disassembler.java line 189)*/(
                                    blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x2c6] = ops[0xc6];

        ops[0x2c7] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Ed_Id_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Ed_Id(blockStart, eip, prefices, input);
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                }
                return null;
            }
        };
        ops[0x2c8] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x2c9] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x2ca] = ops[0xca];

        ops[0x2cb] = ops[0xcb];

        ops[0x2cc] = ops[0xcc];

        ops[0x2cd] = ops[0xcd];

        ops[0x2ce] = ops[0xce];

        ops[0x2cf] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x2d0] = ops[0xd0];

        ops[0x2d1] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Ed_I1_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Ed_I1_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Ed_I1_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcr_Ed_I1_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_I1_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Ed_I1_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_I1_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Ed_I1_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Ed_I1(blockStart, eip, prefices, input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Ed_I1(blockStart, eip, prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Ed_I1(blockStart, eip, prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcr_Ed_I1(blockStart, eip, prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_I1(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Ed_I1(blockStart, eip, prefices, input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_I1(blockStart, eip, prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Ed_I1(blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x2d2] = ops[0xd2];

        ops[0x2d3] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Ed_CL_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Ed_CL_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Ed_CL_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcr_Ed_CL_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_CL_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Ed_CL_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_CL_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Ed_CL_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Ed_CL(blockStart, eip, prefices, input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Ed_CL(blockStart, eip, prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Ed_CL(blockStart, eip, prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcr_Ed_CL(blockStart, eip, prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_CL(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Ed_CL(blockStart, eip, prefices, input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_CL(blockStart, eip, prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Ed_CL(blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x2d4] = ops[0xd4];

        ops[0x2d5] = ops[0xd5];

        ops[0x2d6] = ops[0xd6];

        ops[0x2d7] = ops[0xd7];

        ops[0x2d8] = ops[0xd8];

        ops[0x2d9] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_Md_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_Md_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_Md_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldenv_o32_M_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldcw_Mw_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fnstenv_o32_M_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fnstcw_Mw_mem(blockStart, eip, prefices,
                                    input);
                    }
                }
                switch (modrm) {
                    case 0xc0:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST0(blockStart, eip, prefices, input);
                    case 0xc1:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST1(blockStart, eip, prefices, input);
                    case 0xc2:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST2(blockStart, eip, prefices, input);
                    case 0xc3:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST3(blockStart, eip, prefices, input);
                    case 0xc4:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST4(blockStart, eip, prefices, input);
                    case 0xc5:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST5(blockStart, eip, prefices, input);
                    case 0xc6:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST6(blockStart, eip, prefices, input);
                    case 0xc7:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST7(blockStart, eip, prefices, input);
                    case 0xc8:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST0(blockStart, eip, prefices,
                                input);
                    case 0xc9:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST1(blockStart, eip, prefices,
                                input);
                    case 0xca:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST2(blockStart, eip, prefices,
                                input);
                    case 0xcb:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST3(blockStart, eip, prefices,
                                input);
                    case 0xcc:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST4(blockStart, eip, prefices,
                                input);
                    case 0xcd:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST5(blockStart, eip, prefices,
                                input);
                    case 0xce:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST6(blockStart, eip, prefices,
                                input);
                    case 0xcf:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST7(blockStart, eip, prefices,
                                input);
                    case 0xd0:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xd1:
                    case 0xd2:
                    case 0xd3:
                    case 0xd4:
                    case 0xd5:
                    case 0xd6:
                    case 0xd7:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xd8:
                    case 0xd9:
                    case 0xda:
                    case 0xdb:
                    case 0xdc:
                    case 0xdd:
                    case 0xde:
                    case 0xdf:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xe0:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fchs(blockStart, eip, prefices, input);
                    case 0xe1:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fabs(blockStart, eip, prefices, input);
                    case 0xe2:
                    case 0xe3:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xe4:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ftst(blockStart, eip, prefices, input);
                    case 0xe5:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxam(blockStart, eip, prefices, input);
                    case 0xe6:
                    case 0xe7:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xe8:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld1(blockStart, eip, prefices, input);
                    case 0xe9:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldl2t(blockStart, eip, prefices, input);
                    case 0xea:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldl2e(blockStart, eip, prefices, input);
                    case 0xeb:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldpi(blockStart, eip, prefices, input);
                    case 0xec:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldlg2(blockStart, eip, prefices, input);
                    case 0xed:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldln2(blockStart, eip, prefices, input);
                    case 0xee:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldz(blockStart, eip, prefices, input);
                    case 0xef:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xf0:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.f2xm1(blockStart, eip, prefices, input);
                    case 0xf1:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fyl2x(blockStart, eip, prefices, input);
                    case 0xf2:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fptan(blockStart, eip, prefices, input);
                    case 0xf3:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fpatan(blockStart, eip, prefices, input);
                    case 0xf4:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xf5:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fprem1(blockStart, eip, prefices, input);
                    case 0xf6:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xf7:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fincstp(blockStart, eip, prefices, input);
                    case 0xf8:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fprem(blockStart, eip, prefices, input);
                    case 0xf9:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fyl2xp1(blockStart, eip, prefices, input);
                    case 0xfa:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsqrt(blockStart, eip, prefices, input);
                    case 0xfb:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xfc:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.frndint(blockStart, eip, prefices, input);
                    case 0xfd:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fscale(blockStart, eip, prefices, input);
                    case 0xfe:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsin(blockStart, eip, prefices, input);
                    case 0xff:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcos(blockStart, eip, prefices, input);
                }
                return null;
            }
        };
        ops[0x2da] = ops[0xda];

        ops[0x2db] = ops[0xdb];

        ops[0x2dc] = ops[0xdc];

        ops[0x2dd] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_Mq_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_Mq_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_Mq_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.frstor_o32_M_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fnsave_o32_M_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fnstsw_Mw_mem(blockStart, eip, prefices,
                                    input);
                    }
                }
                switch (modrm) {
                    case 0xc0:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ffree_ST0(blockStart, eip, prefices, input);
                    case 0xc1:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ffree_ST1(blockStart, eip, prefices, input);
                    case 0xc2:
                    case 0xc3:
                    case 0xc4:
                    case 0xc5:
                    case 0xc6:
                    case 0xc7:
                    case 0xc8:
                    case 0xc9:
                    case 0xca:
                    case 0xcb:
                    case 0xcc:
                    case 0xcd:
                    case 0xce:
                    case 0xcf:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xd0:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST0(blockStart, eip, prefices, input);
                    case 0xd1:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST1(blockStart, eip, prefices, input);
                    case 0xd2:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST2(blockStart, eip, prefices, input);
                    case 0xd3:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST3(blockStart, eip, prefices, input);
                    case 0xd4:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST4(blockStart, eip, prefices, input);
                    case 0xd5:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST5(blockStart, eip, prefices, input);
                    case 0xd6:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST6(blockStart, eip, prefices, input);
                    case 0xd7:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST7(blockStart, eip, prefices, input);
                    case 0xd8:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST0(blockStart, eip, prefices, input);
                    case 0xd9:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST1(blockStart, eip, prefices, input);
                    case 0xda:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST2(blockStart, eip, prefices, input);
                    case 0xdb:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST3(blockStart, eip, prefices, input);
                    case 0xdc:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST4(blockStart, eip, prefices, input);
                    case 0xdd:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST5(blockStart, eip, prefices, input);
                    case 0xde:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST6(blockStart, eip, prefices, input);
                    case 0xdf:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST7(blockStart, eip, prefices, input);
                    case 0xe0:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST0(blockStart, eip, prefices, input);
                    case 0xe1:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST1(blockStart, eip, prefices, input);
                    case 0xe2:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST2(blockStart, eip, prefices, input);
                    case 0xe3:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST3(blockStart, eip, prefices, input);
                    case 0xe4:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST4(blockStart, eip, prefices, input);
                    case 0xe5:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST5(blockStart, eip, prefices, input);
                    case 0xe6:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST6(blockStart, eip, prefices, input);
                    case 0xe7:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST7(blockStart, eip, prefices, input);
                    case 0xe8:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST0(blockStart, eip, prefices, input);
                    case 0xe9:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST1(blockStart, eip, prefices, input);
                    case 0xea:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST2(blockStart, eip, prefices, input);
                    case 0xeb:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST3(blockStart, eip, prefices, input);
                    case 0xec:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST4(blockStart, eip, prefices, input);
                    case 0xed:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST5(blockStart, eip, prefices, input);
                    case 0xee:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST6(blockStart, eip, prefices, input);
                    case 0xef:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST7(blockStart, eip, prefices, input);
                    case 0xf0:
                    case 0xf1:
                    case 0xf2:
                    case 0xf3:
                    case 0xf4:
                    case 0xf5:
                    case 0xf6:
                    case 0xf7:
                    case 0xf8:
                    case 0xf9:
                    case 0xfa:
                    case 0xfb:
                    case 0xfc:
                    case 0xfd:
                    case 0xfe:
                    case 0xff:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                }
                return null;
            }
        };
        ops[0x2de] = ops[0xde];

        ops[0x2df] = ops[0xdf];

        ops[0x2e0] = ops[0xe0];

        ops[0x2e1] = ops[0xe1];

        ops[0x2e2] = ops[0xe2];

        ops[0x2e3] = ops[0xe3];

        ops[0x2e4] = ops[0xe4];

        ops[0x2e5] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x2e6] = ops[0xe6];

        ops[0x2e7] = ops[0xe7];

        ops[0x2e8] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.call_Jd(blockStart, eip, prefices, input);
            }
        };
        ops[0x2e9] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jmp_Jd(blockStart, eip, prefices, input);
            }
        };
        ops[0x2ea] = ops[0xea];

        ops[0x2eb] = ops[0xeb];

        ops[0x2ec] = ops[0xec];

        ops[0x2ed] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.in_o32_eAX_DX(blockStart, eip, prefices, input);
            }
        };
        ops[0x2ee] = ops[0xee];

        ops[0x2ef] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.out_o32_DX_eAX(blockStart, eip, prefices, input);
            }
        };
        ops[0x2f0] = null;
        ops[0x2f1] = ops[0xf1];

        ops[0x2f2] = null;
        ops[0x2f3] = null;
        ops[0x2f4] = ops[0xf4];

        ops[0x2f5] = ops[0xf5];

        ops[0x2f6] = ops[0xf6];

        ops[0x2f7] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.test_Ed_Id_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.not_Ed_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.neg_Ed_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mul_Ed_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Ed_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.div_Ed_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.idiv_Ed_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.test_Ed_Id(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.not_Ed(blockStart, eip, prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.neg_Ed(blockStart, eip, prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mul_Ed(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Ed(blockStart, eip, prefices, input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.div_Ed(blockStart, eip, prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.idiv_Ed(blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x2f8] = ops[0xf8];

        ops[0x2f9] = ops[0xf9];

        ops[0x2fa] = ops[0xfa];

        ops[0x2fb] = ops[0xfb];

        ops[0x2fc] = ops[0xfc];

        ops[0x2fd] = ops[0xfd];

        ops[0x2fe] = ops[0xfe];

        ops[0x2ff] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_Ed_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_Ed_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.call_o32_Ed_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jmp_Ed_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jmp_Ep_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_Ed_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_Ed(blockStart, eip, prefices, input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_Ed(blockStart, eip, prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.call_o32_Ed(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jmp_Ed(blockStart, eip, prefices, input);
                        case 0x05:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_Ed(blockStart, eip, prefices, input);
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                }
                return null;
            }
        };
        ops[0x300] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.verr_Ew_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.verr_Ew(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                }
                return null;
            }
        };
        ops[0x301] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x05:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                    }
                }
                switch (modrm) {
                    case 0xc0:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xc1:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xc2:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xc3:
                    case 0xc4:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xc5:
                    case 0xc6:
                    case 0xc7:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xc8:
                    case 0xc9:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xca:
                    case 0xcb:
                    case 0xcc:
                    case 0xcd:
                    case 0xce:
                    case 0xcf:
                    case 0xd0:
                    case 0xd1:
                    case 0xd2:
                    case 0xd3:
                    case 0xd4:
                    case 0xd5:
                    case 0xd6:
                    case 0xd7:
                    case 0xd8:
                    case 0xd9:
                    case 0xda:
                    case 0xdb:
                    case 0xdc:
                    case 0xdd:
                    case 0xde:
                    case 0xdf:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xe0:
                    case 0xe1:
                    case 0xe2:
                    case 0xe3:
                    case 0xe4:
                    case 0xe5:
                    case 0xe6:
                    case 0xe7:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xe8:
                    case 0xe9:
                    case 0xea:
                    case 0xeb:
                    case 0xec:
                    case 0xed:
                    case 0xee:
                    case 0xef:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0xf0:
                    case 0xf1:
                    case 0xf2:
                    case 0xf3:
                    case 0xf4:
                    case 0xf5:
                    case 0xf6:
                    case 0xf7:
                    case 0xf8:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                                input);
                    case 0xf9:
                    case 0xfa:
                    case 0xfb:
                    case 0xfc:
                    case 0xfd:
                    case 0xfe:
                    case 0xff:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                }
                return null;
            }
        };
        ops[0x302] = ops[0x102];

        ops[0x303] = ops[0x103];

        ops[0x304] = ops[0x104];

        ops[0x305] = ops[0x105];

        ops[0x306] = ops[0x106];

        ops[0x307] = ops[0x107];

        ops[0x308] = ops[0x108];

        ops[0x309] = ops[0x109];

        ops[0x30a] = ops[0x10a];

        ops[0x30b] = ops[0x10b];

        ops[0x30c] = ops[0x10c];

        ops[0x30d] = ops[0x10d];

        ops[0x30e] = ops[0x10e];

        ops[0x30f] = ops[0x10f];

        ops[0x310] = ops[0x110];

        ops[0x311] = ops[0x111];

        ops[0x312] = ops[0x112];

        ops[0x313] = ops[0x113];

        ops[0x314] = ops[0x114];

        ops[0x315] = ops[0x115];

        ops[0x316] = ops[0x116];

        ops[0x317] = ops[0x117];

        ops[0x318] = ops[0x118];

        ops[0x319] = ops[0x119];

        ops[0x31a] = ops[0x11a];

        ops[0x31b] = ops[0x11b];

        ops[0x31c] = ops[0x11c];

        ops[0x31d] = ops[0x11d];

        ops[0x31e] = ops[0x11e];

        ops[0x31f] = ops[0x11f];

        ops[0x320] = ops[0x120];

        ops[0x321] = ops[0x121];

        ops[0x322] = ops[0x122];

        ops[0x323] = ops[0x123];

        ops[0x324] = ops[0x124];

        ops[0x325] = ops[0x125];

        ops[0x326] = null;
        ops[0x327] = ops[0x127];

        ops[0x328] = ops[0x128];

        ops[0x329] = ops[0x129];

        ops[0x32a] = ops[0x12a];

        ops[0x32b] = ops[0x12b];

        ops[0x32c] = ops[0x12c];

        ops[0x32d] = ops[0x12d];

        ops[0x32e] = null;
        ops[0x32f] = ops[0x12f];

        ops[0x330] = ops[0x130];

        ops[0x331] = ops[0x131];

        ops[0x332] = ops[0x132];

        ops[0x333] = ops[0x133];

        ops[0x334] = ops[0x134];

        ops[0x335] = ops[0x135];

        ops[0x336] = null;
        ops[0x337] = ops[0x137];

        ops[0x338] = ops[0x138];

        ops[0x339] = ops[0x139];

        ops[0x33a] = ops[0x13a];

        ops[0x33b] = ops[0x13b];

        ops[0x33c] = ops[0x13c];

        ops[0x33d] = ops[0x13d];

        ops[0x33e] = null;
        ops[0x33f] = ops[0x13f];

        ops[0x340] = ops[0x140];

        ops[0x341] = ops[0x141];

        ops[0x342] = ops[0x142];

        ops[0x343] = ops[0x143];

        ops[0x344] = ops[0x144];

        ops[0x345] = ops[0x145];

        ops[0x346] = ops[0x146];

        ops[0x347] = ops[0x147];

        ops[0x348] = ops[0x148];

        ops[0x349] = ops[0x149];

        ops[0x34a] = ops[0x14a];

        ops[0x34b] = ops[0x14b];

        ops[0x34c] = ops[0x14c];

        ops[0x34d] = ops[0x14d];

        ops[0x34e] = ops[0x14e];

        ops[0x34f] = ops[0x14f];

        ops[0x350] = null;
        ops[0x351] = ops[0x151];

        ops[0x352] = ops[0x152];

        ops[0x353] = ops[0x153];

        ops[0x354] = ops[0x154];

        ops[0x355] = ops[0x155];

        ops[0x356] = ops[0x156];

        ops[0x357] = ops[0x157];

        ops[0x358] = ops[0x158];

        ops[0x359] = ops[0x159];

        ops[0x35a] = ops[0x15a];

        ops[0x35b] = ops[0x15b];

        ops[0x35c] = ops[0x15c];

        ops[0x35d] = ops[0x15d];

        ops[0x35e] = ops[0x15e];

        ops[0x35f] = ops[0x15f];

        ops[0x360] = ops[0x160];

        ops[0x361] = ops[0x161];

        ops[0x362] = ops[0x162];

        ops[0x363] = ops[0x163];

        ops[0x364] = null;
        ops[0x365] = null;
        ops[0x366] = null;
        ops[0x367] = null;
        ops[0x368] = ops[0x168];

        ops[0x369] = ops[0x169];

        ops[0x36a] = ops[0x16a];

        ops[0x36b] = ops[0x16b];

        ops[0x36c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x36d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x36e] = ops[0x16e];

        ops[0x36f] = ops[0x16f];

        ops[0x370] = ops[0x170];

        ops[0x371] = ops[0x171];

        ops[0x372] = ops[0x172];

        ops[0x373] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x04:
                        case 0x05:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x04:
                        case 0x05:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x374] = ops[0x174];

        ops[0x375] = ops[0x175];

        ops[0x376] = ops[0x176];

        ops[0x377] = ops[0x177];

        ops[0x378] = ops[0x178];

        ops[0x379] = ops[0x179];

        ops[0x37a] = ops[0x17a];

        ops[0x37b] = ops[0x17b];

        ops[0x37c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x37d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x37e] = ops[0x17e];

        ops[0x37f] = ops[0x17f];

        ops[0x380] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jo_Jd(blockStart, eip, prefices, input);
            }
        };
        ops[0x381] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jno_Jd(blockStart, eip, prefices, input);
            }
        };
        ops[0x382] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jb_Jd(blockStart, eip, prefices, input);
            }
        };
        ops[0x383] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jae_Jd(blockStart, eip, prefices, input);
            }
        };
        ops[0x384] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.je_Jd(blockStart, eip, prefices, input);
            }
        };
        ops[0x385] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jne_Jd(blockStart, eip, prefices, input);
            }
        };
        ops[0x386] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jbe_Jd(blockStart, eip, prefices, input);
            }
        };
        ops[0x387] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ja_Jd(blockStart, eip, prefices, input);
            }
        };
        ops[0x388] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.js_Jd(blockStart, eip, prefices, input);
            }
        };
        ops[0x389] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jns_Jd(blockStart, eip, prefices, input);
            }
        };
        ops[0x38a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jp_Jd(blockStart, eip, prefices, input);
            }
        };
        ops[0x38b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jnp_Jd(blockStart, eip, prefices, input);
            }
        };
        ops[0x38c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jl_Jd(blockStart, eip, prefices, input);
            }
        };
        ops[0x38d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jge_Jd(blockStart, eip, prefices, input);
            }
        };
        ops[0x38e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jle_Jd(blockStart, eip, prefices, input);
            }
        };
        ops[0x38f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jg_Jd(blockStart, eip, prefices, input);
            }
        };
        ops[0x390] = ops[0x190];

        ops[0x391] = ops[0x191];

        ops[0x392] = ops[0x192];

        ops[0x393] = ops[0x193];

        ops[0x394] = ops[0x194];

        ops[0x395] = ops[0x195];

        ops[0x396] = ops[0x196];

        ops[0x397] = ops[0x197];

        ops[0x398] = ops[0x198];

        ops[0x399] = ops[0x199];

        ops[0x39a] = ops[0x19a];

        ops[0x39b] = ops[0x19b];

        ops[0x39c] = ops[0x19c];

        ops[0x39d] = ops[0x19d];

        ops[0x39e] = ops[0x19e];

        ops[0x39f] = ops[0x19f];

        ops[0x3a0] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x3a1] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x3a2] = ops[0x1a2];

        ops[0x3a3] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bt_Ed_Gd_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bt_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x3a4] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shld_Ed_Gd_Ib_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shld_Ed_Gd_Ib(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x3a5] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shld_Ed_Gd_CL_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shld_Ed_Gd_CL(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x3a6] = ops[0x1a6];

        ops[0x3a7] = ops[0x1a7];

        ops[0x3a8] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x3a9] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x3aa] = ops[0x1aa];

        ops[0x3ab] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bts_Ed_Gd_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bts_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x3ac] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shrd_Ed_Gd_Ib_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shrd_Ed_Gd_Ib(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x3ad] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shrd_Ed_Gd_CL_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shrd_Ed_Gd_CL(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x3ae] = ops[0x1ae];

        ops[0x3af] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Gd_Ed_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Gd_Ed(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x3b0] = ops[0x1b0];

        ops[0x3b1] = ops[0x1b1];

        ops[0x3b2] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lss_o32_Gd_M_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode/*(Disassembler.java line 189)*/(
                                    blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x3b3] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btr_Ed_Gd_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btr_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x3b4] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lfs_o32_Gd_M_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode/*(Disassembler.java line 189)*/(
                                    blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x3b5] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lgs_o32_Gd_M_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode/*(Disassembler.java line 189)*/(
                                    blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x3b6] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movzx_Gd_Eb_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movzx_Gd_Eb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x3b7] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movzx_Gd_Ew_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movzx_Gd_Ew(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x3b8] = ops[0x1b8];

        ops[0x3b9] = ops[0x1b9];

        ops[0x3ba] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bt_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bts_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btr_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btc_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bt_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bts_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btr_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btc_Ed_Ib(blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x3bb] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btc_Ed_Gd_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btc_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x3bc] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bsf_Gd_Ed_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bsf_Gd_Ed(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x3bd] = ops[0x1bd];

        ops[0x3be] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movsx_Gd_Eb_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movsx_Gd_Eb(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x3bf] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movsx_Gd_Ew_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movsx_Gd_Ew(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x3c0] = ops[0x1c0];

        ops[0x3c1] = ops[0x1c1];

        ops[0x3c2] = ops[0x1c2];

        ops[0x3c3] = ops[0x1c3];

        ops[0x3c4] = ops[0x1c4];

        ops[0x3c5] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x3c6] = ops[0x1c6];

        ops[0x3c7] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                    prefices, input);
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                }
                return null;
            }
        };
        ops[0x3c8] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o32_rAXr8(blockStart, eip, prefices, input);
            }
        };
        ops[0x3c9] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o32_rCXr9(blockStart, eip, prefices, input);
            }
        };
        ops[0x3ca] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o32_rDXr10(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x3cb] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o32_rBXr11(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x3cc] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o32_rSPr12(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x3cd] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o32_rBPr13(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x3ce] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o32_rSIr14(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x3cf] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o32_rDIr15(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x3d0] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x3d1] = ops[0x1d1];

        ops[0x3d2] = ops[0x1d2];

        ops[0x3d3] = ops[0x1d3];

        ops[0x3d4] = ops[0x1d4];

        ops[0x3d5] = ops[0x1d5];

        ops[0x3d6] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x3d7] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x3d8] = ops[0x1d8];

        ops[0x3d9] = ops[0x1d9];

        ops[0x3da] = ops[0x1da];

        ops[0x3db] = ops[0x1db];

        ops[0x3dc] = ops[0x1dc];

        ops[0x3dd] = ops[0x1dd];

        ops[0x3de] = ops[0x1de];

        ops[0x3df] = ops[0x1df];

        ops[0x3e0] = ops[0x1e0];

        ops[0x3e1] = ops[0x1e1];

        ops[0x3e2] = ops[0x1e2];

        ops[0x3e3] = ops[0x1e3];

        ops[0x3e4] = ops[0x1e4];

        ops[0x3e5] = ops[0x1e5];

        ops[0x3e6] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x3e7] = ops[0x1e7];

        ops[0x3e8] = ops[0x1e8];

        ops[0x3e9] = ops[0x1e9];

        ops[0x3ea] = ops[0x1ea];

        ops[0x3eb] = ops[0x1eb];

        ops[0x3ec] = ops[0x1ec];

        ops[0x3ed] = ops[0x1ed];

        ops[0x3ee] = ops[0x1ee];

        ops[0x3ef] = ops[0x1ef];

        ops[0x3f0] = null;
        ops[0x3f1] = ops[0x1f1];

        ops[0x3f2] = null;
        ops[0x3f3] = null;
        ops[0x3f4] = ops[0x1f4];

        ops[0x3f5] = ops[0x1f5];

        ops[0x3f6] = ops[0x1f6];

        ops[0x3f7] = ops[0x1f7];

        ops[0x3f8] = ops[0x1f8];

        ops[0x3f9] = ops[0x1f9];

        ops[0x3fa] = ops[0x1fa];

        ops[0x3fb] = ops[0x1fb];

        ops[0x3fc] = ops[0x1fc];

        ops[0x3fd] = ops[0x1fd];

        ops[0x3fe] = ops[0x1fe];

        ops[0x3ff] = ops[0x1ff];

        ops[0x400] = ops[0x0];

        ops[0x401] = ops[0x1];

        ops[0x402] = ops[0x2];

        ops[0x403] = ops[0x3];

        ops[0x404] = ops[0x4];

        ops[0x405] = ops[0x5];

        ops[0x406] = ops[0x6];

        ops[0x407] = ops[0x7];

        ops[0x408] = ops[0x8];

        ops[0x409] = ops[0x9];

        ops[0x40a] = ops[0xa];

        ops[0x40b] = ops[0xb];

        ops[0x40c] = ops[0xc];

        ops[0x40d] = ops[0xd];

        ops[0x40e] = ops[0xe];

        ops[0x40f] = null;
        ops[0x410] = ops[0x10];

        ops[0x411] = ops[0x11];

        ops[0x412] = ops[0x12];

        ops[0x413] = ops[0x13];

        ops[0x414] = ops[0x14];

        ops[0x415] = ops[0x15];

        ops[0x416] = ops[0x16];

        ops[0x417] = ops[0x17];

        ops[0x418] = ops[0x18];

        ops[0x419] = ops[0x19];

        ops[0x41a] = ops[0x1a];

        ops[0x41b] = ops[0x1b];

        ops[0x41c] = ops[0x1c];

        ops[0x41d] = ops[0x1d];

        ops[0x41e] = ops[0x1e];

        ops[0x41f] = ops[0x1f];

        ops[0x420] = ops[0x20];

        ops[0x421] = ops[0x21];

        ops[0x422] = ops[0x22];

        ops[0x423] = ops[0x23];

        ops[0x424] = ops[0x24];

        ops[0x425] = ops[0x25];

        ops[0x426] = null;
        ops[0x427] = ops[0x27];

        ops[0x428] = ops[0x28];

        ops[0x429] = ops[0x29];

        ops[0x42a] = ops[0x2a];

        ops[0x42b] = ops[0x2b];

        ops[0x42c] = ops[0x2c];

        ops[0x42d] = ops[0x2d];

        ops[0x42e] = null;
        ops[0x42f] = ops[0x2f];

        ops[0x430] = ops[0x30];

        ops[0x431] = ops[0x31];

        ops[0x432] = ops[0x32];

        ops[0x433] = ops[0x33];

        ops[0x434] = ops[0x34];

        ops[0x435] = ops[0x35];

        ops[0x436] = null;
        ops[0x437] = ops[0x37];

        ops[0x438] = ops[0x38];

        ops[0x439] = ops[0x39];

        ops[0x43a] = ops[0x3a];

        ops[0x43b] = ops[0x3b];

        ops[0x43c] = ops[0x3c];

        ops[0x43d] = ops[0x3d];

        ops[0x43e] = null;
        ops[0x43f] = ops[0x3f];

        ops[0x440] = ops[0x40];

        ops[0x441] = ops[0x41];

        ops[0x442] = ops[0x42];

        ops[0x443] = ops[0x43];

        ops[0x444] = ops[0x44];

        ops[0x445] = ops[0x45];

        ops[0x446] = ops[0x46];

        ops[0x447] = ops[0x47];

        ops[0x448] = ops[0x48];

        ops[0x449] = ops[0x49];

        ops[0x44a] = ops[0x4a];

        ops[0x44b] = ops[0x4b];

        ops[0x44c] = ops[0x4c];

        ops[0x44d] = ops[0x4d];

        ops[0x44e] = ops[0x4e];

        ops[0x44f] = ops[0x4f];

        ops[0x450] = ops[0x50];

        ops[0x451] = ops[0x51];

        ops[0x452] = ops[0x52];

        ops[0x453] = ops[0x53];

        ops[0x454] = ops[0x54];

        ops[0x455] = ops[0x55];

        ops[0x456] = ops[0x56];

        ops[0x457] = ops[0x57];

        ops[0x458] = ops[0x58];

        ops[0x459] = ops[0x59];

        ops[0x45a] = ops[0x5a];

        ops[0x45b] = ops[0x5b];

        ops[0x45c] = ops[0x5c];

        ops[0x45d] = ops[0x5d];

        ops[0x45e] = ops[0x5e];

        ops[0x45f] = ops[0x5f];

        ops[0x460] = ops[0x60];

        ops[0x461] = ops[0x61];

        ops[0x462] = ops[0x62];

        ops[0x463] = ops[0x63];

        ops[0x464] = null;
        ops[0x465] = null;
        ops[0x466] = null;
        ops[0x467] = null;
        ops[0x468] = ops[0x68];

        ops[0x469] = ops[0x69];

        ops[0x46a] = ops[0x6a];

        ops[0x46b] = ops[0x6b];

        ops[0x46c] = ops[0x6c];

        ops[0x46d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x46e] = ops[0x6e];

        ops[0x46f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x470] = ops[0x70];

        ops[0x471] = ops[0x71];

        ops[0x472] = ops[0x72];

        ops[0x473] = ops[0x73];

        ops[0x474] = ops[0x74];

        ops[0x475] = ops[0x75];

        ops[0x476] = ops[0x76];

        ops[0x477] = ops[0x77];

        ops[0x478] = ops[0x78];

        ops[0x479] = ops[0x79];

        ops[0x47a] = ops[0x7a];

        ops[0x47b] = ops[0x7b];

        ops[0x47c] = ops[0x7c];

        ops[0x47d] = ops[0x7d];

        ops[0x47e] = ops[0x7e];

        ops[0x47f] = ops[0x7f];

        ops[0x480] = ops[0x80];

        ops[0x481] = ops[0x81];

        ops[0x482] = ops[0x82];

        ops[0x483] = ops[0x83];

        ops[0x484] = ops[0x84];

        ops[0x485] = ops[0x85];

        ops[0x486] = ops[0x86];

        ops[0x487] = ops[0x87];

        ops[0x488] = ops[0x88];

        ops[0x489] = ops[0x89];

        ops[0x48a] = ops[0x8a];

        ops[0x48b] = ops[0x8b];

        ops[0x48c] = ops[0x8c];

        ops[0x48d] = ops[0x8d];

        ops[0x48e] = ops[0x8e];

        ops[0x48f] = ops[0x8f];

        ops[0x490] = ops[0x90];

        ops[0x491] = ops[0x91];

        ops[0x492] = ops[0x92];

        ops[0x493] = ops[0x93];

        ops[0x494] = ops[0x94];

        ops[0x495] = ops[0x95];

        ops[0x496] = ops[0x96];

        ops[0x497] = ops[0x97];

        ops[0x498] = ops[0x98];

        ops[0x499] = ops[0x99];

        ops[0x49a] = ops[0x9a];

        ops[0x49b] = ops[0x9b];

        ops[0x49c] = ops[0x9c];

        ops[0x49d] = ops[0x9d];

        ops[0x49e] = ops[0x9e];

        ops[0x49f] = ops[0x9f];

        ops[0x4a0] = ops[0xa0];

        ops[0x4a1] = ops[0xa1];

        ops[0x4a2] = ops[0xa2];

        ops[0x4a3] = ops[0xa3];

        ops[0x4a4] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_movsb_a32(blockStart, eip, prefices, input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_movsb_a32(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movsb_a32(blockStart, eip, prefices, input);
            }
        };
        ops[0x4a5] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_movsw_a32(blockStart, eip, prefices, input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_movsw_a32(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movsw_a32(blockStart, eip, prefices, input);
            }
        };
        ops[0x4a6] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.repne_cmpsb_a32(blockStart, eip, prefices,
                            input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_cmpsb_a32(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmpsb_a32(blockStart, eip, prefices, input);
            }
        };
        ops[0x4a7] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.repne_cmpsw_a32(blockStart, eip, prefices,
                            input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_cmpsw_a32(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmpsw_a32(blockStart, eip, prefices, input);
            }
        };
        ops[0x4a8] = ops[0xa8];

        ops[0x4a9] = ops[0xa9];

        ops[0x4aa] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_stosb_a32(blockStart, eip, prefices, input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_stosb_a32(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.stosb_a32(blockStart, eip, prefices, input);
            }
        };
        ops[0x4ab] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_stosw_a32(blockStart, eip, prefices, input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_stosw_a32(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.stosw_a32(blockStart, eip, prefices, input);
            }
        };
        ops[0x4ac] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_lodsb_a32(blockStart, eip, prefices, input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_lodsb_a32(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lodsb_a32(blockStart, eip, prefices, input);
            }
        };
        ops[0x4ad] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_lodsw_a32(blockStart, eip, prefices, input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_lodsw_a32(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lodsw_a32(blockStart, eip, prefices, input);
            }
        };
        ops[0x4ae] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.repne_scasb_a32(blockStart, eip, prefices,
                            input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_scasb_a32(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.scasb_a32(blockStart, eip, prefices, input);
            }
        };
        ops[0x4af] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.repne_scasw_a32(blockStart, eip, prefices,
                            input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_scasw_a32(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.scasw_a32(blockStart, eip, prefices, input);
            }
        };
        ops[0x4b0] = ops[0xb0];

        ops[0x4b1] = ops[0xb1];

        ops[0x4b2] = ops[0xb2];

        ops[0x4b3] = ops[0xb3];

        ops[0x4b4] = ops[0xb4];

        ops[0x4b5] = ops[0xb5];

        ops[0x4b6] = ops[0xb6];

        ops[0x4b7] = ops[0xb7];

        ops[0x4b8] = ops[0xb8];

        ops[0x4b9] = ops[0xb9];

        ops[0x4ba] = ops[0xba];

        ops[0x4bb] = ops[0xbb];

        ops[0x4bc] = ops[0xbc];

        ops[0x4bd] = ops[0xbd];

        ops[0x4be] = ops[0xbe];

        ops[0x4bf] = ops[0xbf];

        ops[0x4c0] = ops[0xc0];

        ops[0x4c1] = ops[0xc1];

        ops[0x4c2] = ops[0xc2];

        ops[0x4c3] = ops[0xc3];

        ops[0x4c4] = ops[0xc4];

        ops[0x4c5] = ops[0xc5];

        ops[0x4c6] = ops[0xc6];

        ops[0x4c7] = ops[0xc7];

        ops[0x4c8] = ops[0xc8];

        ops[0x4c9] = ops[0xc9];

        ops[0x4ca] = ops[0xca];

        ops[0x4cb] = ops[0xcb];

        ops[0x4cc] = ops[0xcc];

        ops[0x4cd] = ops[0xcd];

        ops[0x4ce] = ops[0xce];

        ops[0x4cf] = ops[0xcf];

        ops[0x4d0] = ops[0xd0];

        ops[0x4d1] = ops[0xd1];

        ops[0x4d2] = ops[0xd2];

        ops[0x4d3] = ops[0xd3];

        ops[0x4d4] = ops[0xd4];

        ops[0x4d5] = ops[0xd5];

        ops[0x4d6] = ops[0xd6];

        ops[0x4d7] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xlatb_a32(blockStart, eip, prefices, input);
            }
        };
        ops[0x4d8] = ops[0xd8];

        ops[0x4d9] = ops[0xd9];

        ops[0x4da] = ops[0xda];

        ops[0x4db] = ops[0xdb];

        ops[0x4dc] = ops[0xdc];

        ops[0x4dd] = ops[0xdd];

        ops[0x4de] = ops[0xde];

        ops[0x4df] = ops[0xdf];

        ops[0x4e0] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x4e1] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x4e2] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.loop_a32_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0x4e3] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jecxz_Jb(blockStart, eip, prefices, input);
            }
        };
        ops[0x4e4] = ops[0xe4];

        ops[0x4e5] = ops[0xe5];

        ops[0x4e6] = ops[0xe6];

        ops[0x4e7] = ops[0xe7];

        ops[0x4e8] = ops[0xe8];

        ops[0x4e9] = ops[0xe9];

        ops[0x4ea] = ops[0xea];

        ops[0x4eb] = ops[0xeb];

        ops[0x4ec] = ops[0xec];

        ops[0x4ed] = ops[0xed];

        ops[0x4ee] = ops[0xee];

        ops[0x4ef] = ops[0xef];

        ops[0x4f0] = null;
        ops[0x4f1] = ops[0xf1];

        ops[0x4f2] = null;
        ops[0x4f3] = null;
        ops[0x4f4] = ops[0xf4];

        ops[0x4f5] = ops[0xf5];

        ops[0x4f6] = ops[0xf6];

        ops[0x4f7] = ops[0xf7];

        ops[0x4f8] = ops[0xf8];

        ops[0x4f9] = ops[0xf9];

        ops[0x4fa] = ops[0xfa];

        ops[0x4fb] = ops[0xfb];

        ops[0x4fc] = ops[0xfc];

        ops[0x4fd] = ops[0xfd];

        ops[0x4fe] = ops[0xfe];

        ops[0x4ff] = ops[0xff];

        ops[0x500] = ops[0x100];

        ops[0x501] = ops[0x101];

        ops[0x502] = ops[0x102];

        ops[0x503] = ops[0x103];

        ops[0x504] = ops[0x104];

        ops[0x505] = ops[0x105];

        ops[0x506] = ops[0x106];

        ops[0x507] = ops[0x107];

        ops[0x508] = ops[0x108];

        ops[0x509] = ops[0x109];

        ops[0x50a] = ops[0x10a];

        ops[0x50b] = ops[0x10b];

        ops[0x50c] = ops[0x10c];

        ops[0x50d] = ops[0x10d];

        ops[0x50e] = ops[0x10e];

        ops[0x50f] = ops[0x10f];

        ops[0x510] = ops[0x110];

        ops[0x511] = ops[0x111];

        ops[0x512] = ops[0x112];

        ops[0x513] = ops[0x113];

        ops[0x514] = ops[0x114];

        ops[0x515] = ops[0x115];

        ops[0x516] = ops[0x116];

        ops[0x517] = ops[0x117];

        ops[0x518] = ops[0x118];

        ops[0x519] = ops[0x119];

        ops[0x51a] = ops[0x11a];

        ops[0x51b] = ops[0x11b];

        ops[0x51c] = ops[0x11c];

        ops[0x51d] = ops[0x11d];

        ops[0x51e] = ops[0x11e];

        ops[0x51f] = ops[0x11f];

        ops[0x520] = ops[0x120];

        ops[0x521] = ops[0x121];

        ops[0x522] = ops[0x122];

        ops[0x523] = ops[0x123];

        ops[0x524] = ops[0x124];

        ops[0x525] = ops[0x125];

        ops[0x526] = null;
        ops[0x527] = ops[0x127];

        ops[0x528] = ops[0x128];

        ops[0x529] = ops[0x129];

        ops[0x52a] = ops[0x12a];

        ops[0x52b] = ops[0x12b];

        ops[0x52c] = ops[0x12c];

        ops[0x52d] = ops[0x12d];

        ops[0x52e] = null;
        ops[0x52f] = ops[0x12f];

        ops[0x530] = ops[0x130];

        ops[0x531] = ops[0x131];

        ops[0x532] = ops[0x132];

        ops[0x533] = ops[0x133];

        ops[0x534] = ops[0x134];

        ops[0x535] = ops[0x135];

        ops[0x536] = null;
        ops[0x537] = ops[0x137];

        ops[0x538] = ops[0x138];

        ops[0x539] = ops[0x139];

        ops[0x53a] = ops[0x13a];

        ops[0x53b] = ops[0x13b];

        ops[0x53c] = ops[0x13c];

        ops[0x53d] = ops[0x13d];

        ops[0x53e] = null;
        ops[0x53f] = ops[0x13f];

        ops[0x540] = ops[0x140];

        ops[0x541] = ops[0x141];

        ops[0x542] = ops[0x142];

        ops[0x543] = ops[0x143];

        ops[0x544] = ops[0x144];

        ops[0x545] = ops[0x145];

        ops[0x546] = ops[0x146];

        ops[0x547] = ops[0x147];

        ops[0x548] = ops[0x148];

        ops[0x549] = ops[0x149];

        ops[0x54a] = ops[0x14a];

        ops[0x54b] = ops[0x14b];

        ops[0x54c] = ops[0x14c];

        ops[0x54d] = ops[0x14d];

        ops[0x54e] = ops[0x14e];

        ops[0x54f] = ops[0x14f];

        ops[0x550] = null;
        ops[0x551] = ops[0x151];

        ops[0x552] = ops[0x152];

        ops[0x553] = ops[0x153];

        ops[0x554] = ops[0x154];

        ops[0x555] = ops[0x155];

        ops[0x556] = ops[0x156];

        ops[0x557] = ops[0x157];

        ops[0x558] = ops[0x158];

        ops[0x559] = ops[0x159];

        ops[0x55a] = ops[0x15a];

        ops[0x55b] = ops[0x15b];

        ops[0x55c] = ops[0x15c];

        ops[0x55d] = ops[0x15d];

        ops[0x55e] = ops[0x15e];

        ops[0x55f] = ops[0x15f];

        ops[0x560] = ops[0x160];

        ops[0x561] = ops[0x161];

        ops[0x562] = ops[0x162];

        ops[0x563] = ops[0x163];

        ops[0x564] = null;
        ops[0x565] = null;
        ops[0x566] = null;
        ops[0x567] = null;
        ops[0x568] = ops[0x168];

        ops[0x569] = ops[0x169];

        ops[0x56a] = ops[0x16a];

        ops[0x56b] = ops[0x16b];

        ops[0x56c] = ops[0x16c];

        ops[0x56d] = ops[0x16d];

        ops[0x56e] = ops[0x16e];

        ops[0x56f] = ops[0x16f];

        ops[0x570] = ops[0x170];

        ops[0x571] = ops[0x171];

        ops[0x572] = ops[0x172];

        ops[0x573] = ops[0x173];

        ops[0x574] = ops[0x174];

        ops[0x575] = ops[0x175];

        ops[0x576] = ops[0x176];

        ops[0x577] = ops[0x177];

        ops[0x578] = ops[0x178];

        ops[0x579] = ops[0x179];

        ops[0x57a] = ops[0x17a];

        ops[0x57b] = ops[0x17b];

        ops[0x57c] = ops[0x17c];

        ops[0x57d] = ops[0x17d];

        ops[0x57e] = ops[0x17e];

        ops[0x57f] = ops[0x17f];

        ops[0x580] = ops[0x180];

        ops[0x581] = ops[0x181];

        ops[0x582] = ops[0x182];

        ops[0x583] = ops[0x183];

        ops[0x584] = ops[0x184];

        ops[0x585] = ops[0x185];

        ops[0x586] = ops[0x186];

        ops[0x587] = ops[0x187];

        ops[0x588] = ops[0x188];

        ops[0x589] = ops[0x189];

        ops[0x58a] = ops[0x18a];

        ops[0x58b] = ops[0x18b];

        ops[0x58c] = ops[0x18c];

        ops[0x58d] = ops[0x18d];

        ops[0x58e] = ops[0x18e];

        ops[0x58f] = ops[0x18f];

        ops[0x590] = ops[0x190];

        ops[0x591] = ops[0x191];

        ops[0x592] = ops[0x192];

        ops[0x593] = ops[0x193];

        ops[0x594] = ops[0x194];

        ops[0x595] = ops[0x195];

        ops[0x596] = ops[0x196];

        ops[0x597] = ops[0x197];

        ops[0x598] = ops[0x198];

        ops[0x599] = ops[0x199];

        ops[0x59a] = ops[0x19a];

        ops[0x59b] = ops[0x19b];

        ops[0x59c] = ops[0x19c];

        ops[0x59d] = ops[0x19d];

        ops[0x59e] = ops[0x19e];

        ops[0x59f] = ops[0x19f];

        ops[0x5a0] = ops[0x1a0];

        ops[0x5a1] = ops[0x1a1];

        ops[0x5a2] = ops[0x1a2];

        ops[0x5a3] = ops[0x1a3];

        ops[0x5a4] = ops[0x1a4];

        ops[0x5a5] = ops[0x1a5];

        ops[0x5a6] = ops[0x1a6];

        ops[0x5a7] = ops[0x1a7];

        ops[0x5a8] = ops[0x1a8];

        ops[0x5a9] = ops[0x1a9];

        ops[0x5aa] = ops[0x1aa];

        ops[0x5ab] = ops[0x1ab];

        ops[0x5ac] = ops[0x1ac];

        ops[0x5ad] = ops[0x1ad];

        ops[0x5ae] = ops[0x1ae];

        ops[0x5af] = ops[0x1af];

        ops[0x5b0] = ops[0x1b0];

        ops[0x5b1] = ops[0x1b1];

        ops[0x5b2] = ops[0x1b2];

        ops[0x5b3] = ops[0x1b3];

        ops[0x5b4] = ops[0x1b4];

        ops[0x5b5] = ops[0x1b5];

        ops[0x5b6] = ops[0x1b6];

        ops[0x5b7] = ops[0x1b7];

        ops[0x5b8] = ops[0x1b8];

        ops[0x5b9] = ops[0x1b9];

        ops[0x5ba] = ops[0x1ba];

        ops[0x5bb] = ops[0x1bb];

        ops[0x5bc] = ops[0x1bc];

        ops[0x5bd] = ops[0x1bd];

        ops[0x5be] = ops[0x1be];

        ops[0x5bf] = ops[0x1bf];

        ops[0x5c0] = ops[0x1c0];

        ops[0x5c1] = ops[0x1c1];

        ops[0x5c2] = ops[0x1c2];

        ops[0x5c3] = ops[0x1c3];

        ops[0x5c4] = ops[0x1c4];

        ops[0x5c5] = ops[0x1c5];

        ops[0x5c6] = ops[0x1c6];

        ops[0x5c7] = ops[0x1c7];

        ops[0x5c8] = ops[0x1c8];

        ops[0x5c9] = ops[0x1c9];

        ops[0x5ca] = ops[0x1ca];

        ops[0x5cb] = ops[0x1cb];

        ops[0x5cc] = ops[0x1cc];

        ops[0x5cd] = ops[0x1cd];

        ops[0x5ce] = ops[0x1ce];

        ops[0x5cf] = ops[0x1cf];

        ops[0x5d0] = ops[0x1d0];

        ops[0x5d1] = ops[0x1d1];

        ops[0x5d2] = ops[0x1d2];

        ops[0x5d3] = ops[0x1d3];

        ops[0x5d4] = ops[0x1d4];

        ops[0x5d5] = ops[0x1d5];

        ops[0x5d6] = ops[0x1d6];

        ops[0x5d7] = ops[0x1d7];

        ops[0x5d8] = ops[0x1d8];

        ops[0x5d9] = ops[0x1d9];

        ops[0x5da] = ops[0x1da];

        ops[0x5db] = ops[0x1db];

        ops[0x5dc] = ops[0x1dc];

        ops[0x5dd] = ops[0x1dd];

        ops[0x5de] = ops[0x1de];

        ops[0x5df] = ops[0x1df];

        ops[0x5e0] = ops[0x1e0];

        ops[0x5e1] = ops[0x1e1];

        ops[0x5e2] = ops[0x1e2];

        ops[0x5e3] = ops[0x1e3];

        ops[0x5e4] = ops[0x1e4];

        ops[0x5e5] = ops[0x1e5];

        ops[0x5e6] = ops[0x1e6];

        ops[0x5e7] = ops[0x1e7];

        ops[0x5e8] = ops[0x1e8];

        ops[0x5e9] = ops[0x1e9];

        ops[0x5ea] = ops[0x1ea];

        ops[0x5eb] = ops[0x1eb];

        ops[0x5ec] = ops[0x1ec];

        ops[0x5ed] = ops[0x1ed];

        ops[0x5ee] = ops[0x1ee];

        ops[0x5ef] = ops[0x1ef];

        ops[0x5f0] = null;
        ops[0x5f1] = ops[0x1f1];

        ops[0x5f2] = null;
        ops[0x5f3] = null;
        ops[0x5f4] = ops[0x1f4];

        ops[0x5f5] = ops[0x1f5];

        ops[0x5f6] = ops[0x1f6];

        ops[0x5f7] = ops[0x1f7];

        ops[0x5f8] = ops[0x1f8];

        ops[0x5f9] = ops[0x1f9];

        ops[0x5fa] = ops[0x1fa];

        ops[0x5fb] = ops[0x1fb];

        ops[0x5fc] = ops[0x1fc];

        ops[0x5fd] = ops[0x1fd];

        ops[0x5fe] = ops[0x1fe];

        ops[0x5ff] = ops[0x1ff];

        ops[0x600] = ops[0x0];

        ops[0x601] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Ed_Gd_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x602] = ops[0x2];

        ops[0x603] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Gd_Ed_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Gd_Ed(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x604] = ops[0x4];

        ops[0x605] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_o32_rAX_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x606] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x607] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x608] = ops[0x8];

        ops[0x609] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Ed_Gd_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x60a] = ops[0xa];

        ops[0x60b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Gd_Ed_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Gd_Ed(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x60c] = ops[0xc];

        ops[0x60d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_o32_rAX_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x60e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o32_CS(blockStart, eip, prefices, input);
            }
        };
        ops[0x60f] = null;
        ops[0x610] = ops[0x10];

        ops[0x611] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Ed_Gd_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x612] = ops[0x12];

        ops[0x613] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Gd_Ed_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Gd_Ed(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x614] = ops[0x14];

        ops[0x615] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x616] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x617] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x618] = ops[0x18];

        ops[0x619] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Ed_Gd_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x61a] = ops[0x1a];

        ops[0x61b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Gd_Ed_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Gd_Ed(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x61c] = ops[0x1c];

        ops[0x61d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_o32_rAX_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x61e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x61f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x620] = ops[0x20];

        ops[0x621] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Ed_Gd_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x622] = ops[0x22];

        ops[0x623] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Gd_Ed_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Gd_Ed(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x624] = ops[0x24];

        ops[0x625] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_o32_rAX_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x626] = null;
        ops[0x627] = ops[0x27];

        ops[0x628] = ops[0x28];

        ops[0x629] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Ed_Gd_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x62a] = ops[0x2a];

        ops[0x62b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Gd_Ed_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Gd_Ed(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x62c] = ops[0x2c];

        ops[0x62d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_o32_rAX_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x62e] = null;
        ops[0x62f] = ops[0x2f];

        ops[0x630] = ops[0x30];

        ops[0x631] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Ed_Gd_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x632] = ops[0x32];

        ops[0x633] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Gd_Ed_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Gd_Ed(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x634] = ops[0x34];

        ops[0x635] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_o32_rAX_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x636] = null;
        ops[0x637] = ops[0x37];

        ops[0x638] = ops[0x38];

        ops[0x639] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Ed_Gd_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x63a] = ops[0x3a];

        ops[0x63b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Gd_Ed_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Gd_Ed(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x63c] = ops[0x3c];

        ops[0x63d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_o32_rAX_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x63e] = null;
        ops[0x63f] = ops[0x3f];

        ops[0x640] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o32_eAX(blockStart, eip, prefices, input);
            }
        };
        ops[0x641] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o32_eCX(blockStart, eip, prefices, input);
            }
        };
        ops[0x642] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o32_eDX(blockStart, eip, prefices, input);
            }
        };
        ops[0x643] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o32_eBX(blockStart, eip, prefices, input);
            }
        };
        ops[0x644] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o32_eSP(blockStart, eip, prefices, input);
            }
        };
        ops[0x645] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o32_eBP(blockStart, eip, prefices, input);
            }
        };
        ops[0x646] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o32_eSI(blockStart, eip, prefices, input);
            }
        };
        ops[0x647] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_o32_eDI(blockStart, eip, prefices, input);
            }
        };
        ops[0x648] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o32_eAX(blockStart, eip, prefices, input);
            }
        };
        ops[0x649] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o32_eCX(blockStart, eip, prefices, input);
            }
        };
        ops[0x64a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o32_eDX(blockStart, eip, prefices, input);
            }
        };
        ops[0x64b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o32_eBX(blockStart, eip, prefices, input);
            }
        };
        ops[0x64c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o32_eSP(blockStart, eip, prefices, input);
            }
        };
        ops[0x64d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o32_eBP(blockStart, eip, prefices, input);
            }
        };
        ops[0x64e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o32_eSI(blockStart, eip, prefices, input);
            }
        };
        ops[0x64f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_o32_eDI(blockStart, eip, prefices, input);
            }
        };
        ops[0x650] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o32_rAXr8(blockStart, eip, prefices, input);
            }
        };
        ops[0x651] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o32_rCXr9(blockStart, eip, prefices, input);
            }
        };
        ops[0x652] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o32_rDXr10(blockStart, eip, prefices, input);
            }
        };
        ops[0x653] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o32_rBXr11(blockStart, eip, prefices, input);
            }
        };
        ops[0x654] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o32_rSPr12(blockStart, eip, prefices, input);
            }
        };
        ops[0x655] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o32_rBPr13(blockStart, eip, prefices, input);
            }
        };
        ops[0x656] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o32_rSIr14(blockStart, eip, prefices, input);
            }
        };
        ops[0x657] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o32_rDIr15(blockStart, eip, prefices, input);
            }
        };
        ops[0x658] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o32_rAXr8(blockStart, eip, prefices, input);
            }
        };
        ops[0x659] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o32_rCXr9(blockStart, eip, prefices, input);
            }
        };
        ops[0x65a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o32_rDXr10(blockStart, eip, prefices, input);
            }
        };
        ops[0x65b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o32_rBXr11(blockStart, eip, prefices, input);
            }
        };
        ops[0x65c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o32_rSPr12(blockStart, eip, prefices, input);
            }
        };
        ops[0x65d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o32_rBPr13(blockStart, eip, prefices, input);
            }
        };
        ops[0x65e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o32_rSIr14(blockStart, eip, prefices, input);
            }
        };
        ops[0x65f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_o32_rDIr15(blockStart, eip, prefices, input);
            }
        };
        ops[0x660] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pushad(blockStart, eip, prefices, input);
            }
        };
        ops[0x661] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.popad(blockStart, eip, prefices, input);
            }
        };
        ops[0x662] = ops[0x62];

        ops[0x663] = ops[0x63];

        ops[0x664] = null;
        ops[0x665] = null;
        ops[0x666] = null;
        ops[0x667] = null;
        ops[0x668] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o32_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x669] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Gd_Ed_Id_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Gd_Ed_Id(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x66a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_o32_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0x66b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Gd_Ed_Ib_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Gd_Ed_Ib(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x66c] = ops[0x6c];

        ops[0x66d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x66e] = ops[0x6e];

        ops[0x66f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.outsd_a32(blockStart, eip, prefices, input);
            }
        };
        ops[0x670] = ops[0x70];

        ops[0x671] = ops[0x71];

        ops[0x672] = ops[0x72];

        ops[0x673] = ops[0x73];

        ops[0x674] = ops[0x74];

        ops[0x675] = ops[0x75];

        ops[0x676] = ops[0x76];

        ops[0x677] = ops[0x77];

        ops[0x678] = ops[0x78];

        ops[0x679] = ops[0x79];

        ops[0x67a] = ops[0x7a];

        ops[0x67b] = ops[0x7b];

        ops[0x67c] = ops[0x7c];

        ops[0x67d] = ops[0x7d];

        ops[0x67e] = ops[0x7e];

        ops[0x67f] = ops[0x7f];

        ops[0x680] = ops[0x80];

        ops[0x681] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Ed_Id_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Ed_Id_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Ed_Id_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Ed_Id_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Ed_Id_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Ed_Id_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Ed_Id_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Ed_Id_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Ed_Id(blockStart, eip, prefices, input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Ed_Id(blockStart, eip, prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Ed_Id(blockStart, eip, prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Ed_Id(blockStart, eip, prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Ed_Id(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Ed_Id(blockStart, eip, prefices, input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Ed_Id(blockStart, eip, prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Ed_Id(blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x682] = ops[0x82];

        ops[0x683] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Ed_Ib_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.add_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x01:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.or_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x02:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.adc_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x03:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sbb_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x04:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.and_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x05:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sub_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x06:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xor_Ed_Ib(blockStart, eip, prefices, input);
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmp_Ed_Ib(blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x684] = ops[0x84];

        ops[0x685] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.test_Ed_Gd_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.test_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x686] = ops[0x86];

        ops[0x687] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_Ed_Gd_mem(blockStart, eip, prefices,
                            input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x688] = ops[0x88];

        ops[0x689] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Ed_Gd_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Ed_Gd(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x68a] = ops[0x8a];

        ops[0x68b] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Gd_Ed_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Gd_Ed(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x68c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (parameters.getInput().isPresent() && Modrm.isMem(parameters.getInput().get().peek())) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Ed_S_mem(blockStart, eip, prefices, input);
                } else {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Ed_S(blockStart, eip, prefices, input);
                }
            }
        };
        ops[0x68d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lea_Gd_M_mem(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode/*(Disassembler.java line 189)*/(
                                    blockStart, eip, prefices, input);
                    }
                }
                return null;
            }
        };
        ops[0x68e] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x68f] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                int modrm = input.peek() & 0xFF;
                int reg = (modrm >> 3) & 7;
                if (modrm < 0xC0) {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_Ed_mem(blockStart, eip, prefices,
                                    input);
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                } else {
                    switch (reg) {
                        case 0x00:
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pop_Ed(blockStart, eip, prefices, input);
                        case 0x01:
                        case 0x02:
                        case 0x03:
                        case 0x04:
                        case 0x05:
                        case 0x06:
                        case 0x07:
                            input.read8();
                            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                    input);
                    }
                }
                return null;
            }
        };
        ops[0x690] = ops[0x90];

        ops[0x691] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_o32_rCXr9_rAX(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x692] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_o32_rDXr10_rAX(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x693] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_o32_rBXr11_rAX(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x694] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_o32_rSPr12_rAX(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x695] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_o32_rBPr13_rAX(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x696] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_o32_rSIr14_rAX(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x697] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.xchg_o32_rDIr15_rAX(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x698] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cwde(blockStart, eip, prefices, input);
            }
        };
        ops[0x699] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cdq(blockStart, eip, prefices, input);
            }
        };
        ops[0x69a] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                        input);
            }
        };
        ops[0x69b] = ops[0x9b];

        ops[0x69c] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.pushfd(blockStart, eip, prefices, input);
            }
        };
        ops[0x69d] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.popfd(blockStart, eip, prefices, input);
            }
        };
        ops[0x69e] = ops[0x9e];

        ops[0x69f] = ops[0x9f];

        ops[0x6a0] = ops[0xa0];

        ops[0x6a1] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rAX_Od_mem(blockStart, eip, prefices, input);
            }
        };
        ops[0x6a2] = ops[0xa2];

        ops[0x6a3] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Od_rAX_mem(blockStart, eip, prefices, input);
            }
        };
        ops[0x6a4] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_movsb_a32(blockStart, eip, prefices, input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_movsb_a32(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movsb_a32(blockStart, eip, prefices, input);
            }
        };
        ops[0x6a5] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_movsd_a32(blockStart, eip, prefices, input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_movsd_a32(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movsd_a32(blockStart, eip, prefices, input);
            }
        };
        ops[0x6a6] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.repne_cmpsb_a32(blockStart, eip, prefices,
                            input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_cmpsb_a32(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmpsb_a32(blockStart, eip, prefices, input);
            }
        };
        ops[0x6a7] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                if (Prefices.isRepne(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.repne_cmpsd_a32(blockStart, eip, prefices,
                            input);
                }
                if (Prefices.isRep(prefices)) {
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_cmpsd_a32(blockStart, eip, prefices, input);
                }
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.cmpsd_a32(blockStart, eip, prefices, input);
            }
        };
        ops[0x6a8] = ops[0xa8];

        ops[0x6a9] = new OpcodeDecoder() {
            public Executable decodeOpcode(ExecutableParameters parameters) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.test_o32_rAX_Id(blockStart, eip, prefices, input);
            }
        };
        ops[0x6aa] = (OpcodeDecoder) (blockStart, eip, prefices, input) -> {
            if (Prefices.isRepne(prefices)) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_stosb_a32(blockStart, eip, prefices, input);
            }
            if (Prefices.isRep(prefices)) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_stosb_a32(blockStart, eip, prefices, input);
            }
            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.stosb_a32(blockStart, eip, prefices, input);
        };
        ops[0x6ab] = (blockStart, eip, prefices, input) -> {
            if (Prefices.isRepne(prefices)) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_stosd_a32(blockStart, eip, prefices, input);
            }
            if (Prefices.isRep(prefices)) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_stosd_a32(blockStart, eip, prefices, input);
            }
            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.stosd_a32(blockStart, eip, prefices, input);
        };
        ops[0x6ac] = (blockStart, eip, prefices, input) -> {
            if (Prefices.isRepne(prefices)) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_lodsb_a32(blockStart, eip, prefices, input);
            }
            if (Prefices.isRep(prefices)) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_lodsb_a32(blockStart, eip, prefices, input);
            }
            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lodsb_a32(blockStart, eip, prefices, input);
        };
        ops[0x6ad] = (blockStart, eip, prefices, input) -> {
            if (Prefices.isRepne(prefices)) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_lodsd_a32(blockStart, eip, prefices, input);
            }
            if (Prefices.isRep(prefices)) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_lodsd_a32(blockStart, eip, prefices, input);
            }
            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lodsd_a32(blockStart, eip, prefices, input);
        };
        ops[0x6ae] = (blockStart, eip, prefices, input) -> {
            if (Prefices.isRepne(prefices)) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.repne_scasb_a32(blockStart, eip, prefices,
                        input);
            }
            if (Prefices.isRep(prefices)) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_scasb_a32(blockStart, eip, prefices, input);
            }
            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.scasb_a32(blockStart, eip, prefices, input);
        };
        ops[0x6af] = (blockStart, eip, prefices, input) -> {
            if (Prefices.isRepne(prefices)) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.repne_scasd_a32(blockStart, eip, prefices,
                        input);
            }
            if (Prefices.isRep(prefices)) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rep_scasd_a32(blockStart, eip, prefices, input);
            }
            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.scasd_a32(blockStart, eip, prefices, input);
        };
        ops[0x6b0] = ops[0xb0];

        ops[0x6b1] = ops[0xb1];

        ops[0x6b2] = ops[0xb2];

        ops[0x6b3] = ops[0xb3];

        ops[0x6b4] = ops[0xb4];

        ops[0x6b5] = ops[0xb5];

        ops[0x6b6] = ops[0xb6];

        ops[0x6b7] = ops[0xb7];

        ops[0x6b8] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rAXr8_Id(blockStart, eip, prefices, input);
        ops[0x6b9] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rCXr9_Id(blockStart, eip, prefices, input);
        ops[0x6ba] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rDXr10_Id(blockStart, eip, prefices, input);
        ops[0x6bb] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rBXr11_Id(blockStart, eip, prefices, input);
        ops[0x6bc] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rSPr12_Id(blockStart, eip, prefices, input);
        ops[0x6bd] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rBPr13_Id(blockStart, eip, prefices, input);
        ops[0x6be] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rSIr14_Id(blockStart, eip, prefices, input);
        ops[0x6bf] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_rDIr15_Id(blockStart, eip, prefices, input);
        ops[0x6c0] = ops[0xc0];

        ops[0x6c1] = (blockStart, eip, prefices, input) -> {
            int modrm = input.peek() & 0xFF;
            int reg = (modrm >> 3) & 7;
            if (modrm < 0xC0) {
                switch (reg) {
                    case 0x00:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Ed_Ib_mem(blockStart, eip, prefices,
                                input);
                    case 0x01:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Ed_Ib_mem(blockStart, eip, prefices,
                                input);
                    case 0x02:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Ed_Ib_mem(blockStart, eip, prefices,
                                input);
                    case 0x03:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                prefices, input);
                    case 0x04:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_Ib_mem(blockStart, eip, prefices,
                                input);
                    case 0x05:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Ed_Ib_mem(blockStart, eip, prefices,
                                input);
                    case 0x06:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_Ib_mem(blockStart, eip, prefices,
                                input);
                    case 0x07:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Ed_Ib_mem(blockStart, eip, prefices,
                                input);
                }
            } else {
                switch (reg) {
                    case 0x00:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Ed_Ib(blockStart, eip, prefices, input);
                    case 0x01:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Ed_Ib(blockStart, eip, prefices, input);
                    case 0x02:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Ed_Ib(blockStart, eip, prefices, input);
                    case 0x03:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                prefices, input);
                    case 0x04:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_Ib(blockStart, eip, prefices, input);
                    case 0x05:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Ed_Ib(blockStart, eip, prefices, input);
                    case 0x06:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_Ib(blockStart, eip, prefices, input);
                    case 0x07:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Ed_Ib(blockStart, eip, prefices, input);
                }
            }
            return null;
        };
        ops[0x6c2] = ops[0xc2];

        ops[0x6c3] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.ret_o32(blockStart, eip, prefices, input);
        ops[0x6c4] = (blockStart, eip, prefices, input) -> {
            int modrm = input.peek() & 0xFF;
            int reg = (modrm >> 3) & 7;
            if (modrm < 0xC0) {
                switch (reg) {
                    case 0x00:
                    case 0x01:
                    case 0x02:
                    case 0x03:
                    case 0x04:
                    case 0x05:
                    case 0x06:
                    case 0x07:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.les_o32_Gd_M_mem(blockStart, eip, prefices,
                                input);
                }
            } else {
                switch (reg) {
                    case 0x00:
                    case 0x01:
                    case 0x02:
                    case 0x03:
                    case 0x04:
                    case 0x05:
                    case 0x06:
                    case 0x07:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode/*(Disassembler.java line 189)*/(
                                blockStart, eip, prefices, input);
                }
            }
            return null;
        };
        ops[0x6c5] = (blockStart, eip, prefices, input) -> {
            int modrm = input.peek() & 0xFF;
            int reg = (modrm >> 3) & 7;
            if (modrm < 0xC0) {
                switch (reg) {
                    case 0x00:
                    case 0x01:
                    case 0x02:
                    case 0x03:
                    case 0x04:
                    case 0x05:
                    case 0x06:
                    case 0x07:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lds_o32_Gd_M_mem(blockStart, eip, prefices,
                                input);
                }
            } else {
                switch (reg) {
                    case 0x00:
                    case 0x01:
                    case 0x02:
                    case 0x03:
                    case 0x04:
                    case 0x05:
                    case 0x06:
                    case 0x07:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode/*(Disassembler.java line 189)*/(
                                blockStart, eip, prefices, input);
                }
            }
            return null;
        };
        ops[0x6c6] = ops[0xc6];

        ops[0x6c7] = (blockStart, eip, prefices, input) -> {
            int modrm = input.peek() & 0xFF;
            int reg = (modrm >> 3) & 7;
            if (modrm < 0xC0) {
                switch (reg) {
                    case 0x00:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Ed_Id_mem(blockStart, eip, prefices,
                                input);
                    case 0x01:
                    case 0x02:
                    case 0x03:
                    case 0x04:
                    case 0x05:
                    case 0x06:
                    case 0x07:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                }
            } else {
                switch (reg) {
                    case 0x00:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mov_Ed_Id(blockStart, eip, prefices, input);
                    case 0x01:
                    case 0x02:
                    case 0x03:
                    case 0x04:
                    case 0x05:
                    case 0x06:
                    case 0x07:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                }
            }
            return null;
        };
        ops[0x6c8] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                input);
        ops[0x6c9] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                input);
        ops[0x6ca] = ops[0xca];

        ops[0x6cb] = ops[0xcb];

        ops[0x6cc] = ops[0xcc];

        ops[0x6cd] = ops[0xcd];

        ops[0x6ce] = ops[0xce];

        ops[0x6cf] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                input);
        ops[0x6d0] = ops[0xd0];

        ops[0x6d1] = (blockStart, eip, prefices, input) -> {
            int modrm = input.peek() & 0xFF;
            int reg = (modrm >> 3) & 7;
            if (modrm < 0xC0) {
                switch (reg) {
                    case 0x00:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Ed_I1_mem(blockStart, eip, prefices,
                                input);
                    case 0x01:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Ed_I1_mem(blockStart, eip, prefices,
                                input);
                    case 0x02:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Ed_I1_mem(blockStart, eip, prefices,
                                input);
                    case 0x03:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcr_Ed_I1_mem(blockStart, eip, prefices,
                                input);
                    case 0x04:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_I1_mem(blockStart, eip, prefices,
                                input);
                    case 0x05:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Ed_I1_mem(blockStart, eip, prefices,
                                input);
                    case 0x06:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_I1_mem(blockStart, eip, prefices,
                                input);
                    case 0x07:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Ed_I1_mem(blockStart, eip, prefices,
                                input);
                }
            } else {
                switch (reg) {
                    case 0x00:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Ed_I1(blockStart, eip, prefices, input);
                    case 0x01:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Ed_I1(blockStart, eip, prefices, input);
                    case 0x02:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Ed_I1(blockStart, eip, prefices, input);
                    case 0x03:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcr_Ed_I1(blockStart, eip, prefices, input);
                    case 0x04:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_I1(blockStart, eip, prefices, input);
                    case 0x05:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Ed_I1(blockStart, eip, prefices, input);
                    case 0x06:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_I1(blockStart, eip, prefices, input);
                    case 0x07:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Ed_I1(blockStart, eip, prefices, input);
                }
            }
            return null;
        };
        ops[0x6d2] = ops[0xd2];

        ops[0x6d3] = (blockStart, eip, prefices, input) -> {
            int modrm = input.peek() & 0xFF;
            int reg = (modrm >> 3) & 7;
            if (modrm < 0xC0) {
                switch (reg) {
                    case 0x00:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Ed_CL_mem(blockStart, eip, prefices,
                                input);
                    case 0x01:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Ed_CL_mem(blockStart, eip, prefices,
                                input);
                    case 0x02:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Ed_CL_mem(blockStart, eip, prefices,
                                input);
                    case 0x03:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcr_Ed_CL_mem(blockStart, eip, prefices,
                                input);
                    case 0x04:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_CL_mem(blockStart, eip, prefices,
                                input);
                    case 0x05:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Ed_CL_mem(blockStart, eip, prefices,
                                input);
                    case 0x06:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_CL_mem(blockStart, eip, prefices,
                                input);
                    case 0x07:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Ed_CL_mem(blockStart, eip, prefices,
                                input);
                }
            } else {
                switch (reg) {
                    case 0x00:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rol_Ed_CL(blockStart, eip, prefices, input);
                    case 0x01:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ror_Ed_CL(blockStart, eip, prefices, input);
                    case 0x02:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcl_Ed_CL(blockStart, eip, prefices, input);
                    case 0x03:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.rcr_Ed_CL(blockStart, eip, prefices, input);
                    case 0x04:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_CL(blockStart, eip, prefices, input);
                    case 0x05:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shr_Ed_CL(blockStart, eip, prefices, input);
                    case 0x06:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shl_Ed_CL(blockStart, eip, prefices, input);
                    case 0x07:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.sar_Ed_CL(blockStart, eip, prefices, input);
                }
            }
            return null;
        };
        ops[0x6d4] = ops[0xd4];

        ops[0x6d5] = ops[0xd5];

        ops[0x6d6] = ops[0xd6];

        ops[0x6d7] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.xlatb_a32(blockStart, eip, prefices, input);
        ops[0x6d8] = ops[0xd8];

        ops[0x6d9] = (blockStart, eip, prefices, input) -> {
            int modrm = input.peek() & 0xFF;
            int reg = (modrm >> 3) & 7;
            if (modrm < 0xC0) {
                switch (reg) {
                    case 0x00:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_Md_mem(blockStart, eip, prefices,
                                input);
                    case 0x01:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0x02:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_Md_mem(blockStart, eip, prefices,
                                input);
                    case 0x03:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_Md_mem(blockStart, eip, prefices,
                                input);
                    case 0x04:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldenv_o32_M_mem(blockStart, eip, prefices,
                                input);
                    case 0x05:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldcw_Mw_mem(blockStart, eip, prefices,
                                input);
                    case 0x06:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fnstenv_o32_M_mem(blockStart, eip, prefices,
                                input);
                    case 0x07:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fnstcw_Mw_mem(blockStart, eip, prefices,
                                input);
                }
            }
            switch (modrm) {
                case 0xc0:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST0(blockStart, eip, prefices, input);
                case 0xc1:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST1(blockStart, eip, prefices, input);
                case 0xc2:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST2(blockStart, eip, prefices, input);
                case 0xc3:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST3(blockStart, eip, prefices, input);
                case 0xc4:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST4(blockStart, eip, prefices, input);
                case 0xc5:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST5(blockStart, eip, prefices, input);
                case 0xc6:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST6(blockStart, eip, prefices, input);
                case 0xc7:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_ST0_ST7(blockStart, eip, prefices, input);
                case 0xc8:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST0(blockStart, eip, prefices,
                            input);
                case 0xc9:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST1(blockStart, eip, prefices,
                            input);
                case 0xca:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST2(blockStart, eip, prefices,
                            input);
                case 0xcb:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST3(blockStart, eip, prefices,
                            input);
                case 0xcc:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST4(blockStart, eip, prefices,
                            input);
                case 0xcd:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST5(blockStart, eip, prefices,
                            input);
                case 0xce:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST6(blockStart, eip, prefices,
                            input);
                case 0xcf:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxch_ST0_ST7(blockStart, eip, prefices,
                            input);
                case 0xd0:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                case 0xd1:
                case 0xd2:
                case 0xd3:
                case 0xd4:
                case 0xd5:
                case 0xd6:
                case 0xd7:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                            input);
                case 0xd8:
                case 0xd9:
                case 0xda:
                case 0xdb:
                case 0xdc:
                case 0xdd:
                case 0xde:
                case 0xdf:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                case 0xe0:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fchs(blockStart, eip, prefices, input);
                case 0xe1:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fabs(blockStart, eip, prefices, input);
                case 0xe2:
                case 0xe3:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                            input);
                case 0xe4:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ftst(blockStart, eip, prefices, input);
                case 0xe5:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fxam(blockStart, eip, prefices, input);
                case 0xe6:
                case 0xe7:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                            input);
                case 0xe8:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld1(blockStart, eip, prefices, input);
                case 0xe9:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldl2t(blockStart, eip, prefices, input);
                case 0xea:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldl2e(blockStart, eip, prefices, input);
                case 0xeb:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldpi(blockStart, eip, prefices, input);
                case 0xec:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldlg2(blockStart, eip, prefices, input);
                case 0xed:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldln2(blockStart, eip, prefices, input);
                case 0xee:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fldz(blockStart, eip, prefices, input);
                case 0xef:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                            input);
                case 0xf0:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.f2xm1(blockStart, eip, prefices, input);
                case 0xf1:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fyl2x(blockStart, eip, prefices, input);
                case 0xf2:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fptan(blockStart, eip, prefices, input);
                case 0xf3:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fpatan(blockStart, eip, prefices, input);
                case 0xf4:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                case 0xf5:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fprem1(blockStart, eip, prefices, input);
                case 0xf6:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                case 0xf7:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fincstp(blockStart, eip, prefices, input);
                case 0xf8:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fprem(blockStart, eip, prefices, input);
                case 0xf9:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fyl2xp1(blockStart, eip, prefices, input);
                case 0xfa:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsqrt(blockStart, eip, prefices, input);
                case 0xfb:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                case 0xfc:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.frndint(blockStart, eip, prefices, input);
                case 0xfd:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fscale(blockStart, eip, prefices, input);
                case 0xfe:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fsin(blockStart, eip, prefices, input);
                case 0xff:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fcos(blockStart, eip, prefices, input);
            }
            return null;
        };
        ops[0x6da] = ops[0xda];

        ops[0x6db] = ops[0xdb];

        ops[0x6dc] = ops[0xdc];

        ops[0x6dd] = (blockStart, eip, prefices, input) -> {
            int modrm = input.peek() & 0xFF;
            int reg = (modrm >> 3) & 7;
            if (modrm < 0xC0) {
                switch (reg) {
                    case 0x00:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fld_Mq_mem(blockStart, eip, prefices,
                                input);
                    case 0x01:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                prefices, input);
                    case 0x02:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_Mq_mem(blockStart, eip, prefices,
                                input);
                    case 0x03:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_Mq_mem(blockStart, eip, prefices,
                                input);
                    case 0x04:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.frstor_o32_M_mem(blockStart, eip, prefices,
                                input);
                    case 0x05:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0x06:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fnsave_o32_M_mem(blockStart, eip, prefices,
                                input);
                    case 0x07:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fnstsw_Mw_mem(blockStart, eip, prefices,
                                input);
                }
            }
            switch (modrm) {
                case 0xc0:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ffree_ST0(blockStart, eip, prefices, input);
                case 0xc1:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.ffree_ST1(blockStart, eip, prefices, input);
                case 0xc2:
                case 0xc3:
                case 0xc4:
                case 0xc5:
                case 0xc6:
                case 0xc7:
                case 0xc8:
                case 0xc9:
                case 0xca:
                case 0xcb:
                case 0xcc:
                case 0xcd:
                case 0xce:
                case 0xcf:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                case 0xd0:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST0(blockStart, eip, prefices, input);
                case 0xd1:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST1(blockStart, eip, prefices, input);
                case 0xd2:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST2(blockStart, eip, prefices, input);
                case 0xd3:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST3(blockStart, eip, prefices, input);
                case 0xd4:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST4(blockStart, eip, prefices, input);
                case 0xd5:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST5(blockStart, eip, prefices, input);
                case 0xd6:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST6(blockStart, eip, prefices, input);
                case 0xd7:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fst_ST7(blockStart, eip, prefices, input);
                case 0xd8:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST0(blockStart, eip, prefices, input);
                case 0xd9:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST1(blockStart, eip, prefices, input);
                case 0xda:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST2(blockStart, eip, prefices, input);
                case 0xdb:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST3(blockStart, eip, prefices, input);
                case 0xdc:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST4(blockStart, eip, prefices, input);
                case 0xdd:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST5(blockStart, eip, prefices, input);
                case 0xde:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST6(blockStart, eip, prefices, input);
                case 0xdf:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fstp_ST7(blockStart, eip, prefices, input);
                case 0xe0:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST0(blockStart, eip, prefices, input);
                case 0xe1:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST1(blockStart, eip, prefices, input);
                case 0xe2:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST2(blockStart, eip, prefices, input);
                case 0xe3:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST3(blockStart, eip, prefices, input);
                case 0xe4:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST4(blockStart, eip, prefices, input);
                case 0xe5:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST5(blockStart, eip, prefices, input);
                case 0xe6:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST6(blockStart, eip, prefices, input);
                case 0xe7:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucom_ST7(blockStart, eip, prefices, input);
                case 0xe8:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST0(blockStart, eip, prefices, input);
                case 0xe9:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST1(blockStart, eip, prefices, input);
                case 0xea:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST2(blockStart, eip, prefices, input);
                case 0xeb:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST3(blockStart, eip, prefices, input);
                case 0xec:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST4(blockStart, eip, prefices, input);
                case 0xed:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST5(blockStart, eip, prefices, input);
                case 0xee:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST6(blockStart, eip, prefices, input);
                case 0xef:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.fucomp_ST7(blockStart, eip, prefices, input);
                case 0xf0:
                case 0xf1:
                case 0xf2:
                case 0xf3:
                case 0xf4:
                case 0xf5:
                case 0xf6:
                case 0xf7:
                case 0xf8:
                case 0xf9:
                case 0xfa:
                case 0xfb:
                case 0xfc:
                case 0xfd:
                case 0xfe:
                case 0xff:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                            input);
            }
            return null;
        };
        ops[0x6de] = ops[0xde];

        ops[0x6df] = ops[0xdf];

        ops[0x6e0] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                input);
        ops[0x6e1] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                input);
        ops[0x6e2] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.loop_a32_Jb(blockStart, eip, prefices, input);
        ops[0x6e3] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.jecxz_Jb(blockStart, eip, prefices, input);
        ops[0x6e4] = ops[0xe4];

        ops[0x6e5] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                input);
        ops[0x6e6] = ops[0xe6];

        ops[0x6e7] = ops[0xe7];

        ops[0x6e8] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.call_Jd(blockStart, eip, prefices, input);
        ops[0x6e9] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.jmp_Jd(blockStart, eip, prefices, input);
        ops[0x6ea] = ops[0xea];

        ops[0x6eb] = ops[0xeb];

        ops[0x6ec] = ops[0xec];

        ops[0x6ed] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.in_o32_eAX_DX(blockStart, eip, prefices, input);
        ops[0x6ee] = ops[0xee];

        ops[0x6ef] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.out_o32_DX_eAX(blockStart, eip, prefices, input);
        ops[0x6f0] = null;
        ops[0x6f1] = ops[0xf1];

        ops[0x6f2] = null;
        ops[0x6f3] = null;
        ops[0x6f4] = ops[0xf4];

        ops[0x6f5] = ops[0xf5];

        ops[0x6f6] = ops[0xf6];

        ops[0x6f7] = (blockStart, eip, prefices, input) -> {
            int modrm = input.peek() & 0xFF;
            int reg = (modrm >> 3) & 7;
            if (modrm < 0xC0) {
                switch (reg) {
                    case 0x00:
                    case 0x01:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.test_Ed_Id_mem(blockStart, eip, prefices,
                                input);
                    case 0x02:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.not_Ed_mem(blockStart, eip, prefices,
                                input);
                    case 0x03:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.neg_Ed_mem(blockStart, eip, prefices,
                                input);
                    case 0x04:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mul_Ed_mem(blockStart, eip, prefices,
                                input);
                    case 0x05:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Ed_mem(blockStart, eip, prefices,
                                input);
                    case 0x06:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.div_Ed_mem(blockStart, eip, prefices,
                                input);
                    case 0x07:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.idiv_Ed_mem(blockStart, eip, prefices,
                                input);
                }
            } else {
                switch (reg) {
                    case 0x00:
                    case 0x01:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.test_Ed_Id(blockStart, eip, prefices,
                                input);
                    case 0x02:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.not_Ed(blockStart, eip, prefices, input);
                    case 0x03:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.neg_Ed(blockStart, eip, prefices, input);
                    case 0x04:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.mul_Ed(blockStart, eip, prefices, input);
                    case 0x05:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Ed(blockStart, eip, prefices, input);
                    case 0x06:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.div_Ed(blockStart, eip, prefices, input);
                    case 0x07:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.idiv_Ed(blockStart, eip, prefices, input);
                }
            }
            return null;
        };
        ops[0x6f8] = ops[0xf8];

        ops[0x6f9] = ops[0xf9];

        ops[0x6fa] = ops[0xfa];

        ops[0x6fb] = ops[0xfb];

        ops[0x6fc] = ops[0xfc];

        ops[0x6fd] = ops[0xfd];

        ops[0x6fe] = ops[0xfe];

        ops[0x6ff] = (blockStart, eip, prefices, input) -> {
            int modrm = input.peek() & 0xFF;
            int reg = (modrm >> 3) & 7;
            if (modrm < 0xC0) {
                switch (reg) {
                    case 0x00:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_Ed_mem(blockStart, eip, prefices,
                                input);
                    case 0x01:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_Ed_mem(blockStart, eip, prefices,
                                input);
                    case 0x02:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.call_o32_Ed_mem(blockStart, eip, prefices,
                                input);
                    case 0x03:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                prefices, input);
                    case 0x04:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jmp_Ed_mem(blockStart, eip, prefices,
                                input);
                    case 0x05:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jmp_Ep_mem(blockStart, eip, prefices,
                                input);
                    case 0x06:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_Ed_mem(blockStart, eip, prefices,
                                input);
                    case 0x07:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                }
            } else {
                switch (reg) {
                    case 0x00:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.inc_Ed(blockStart, eip, prefices, input);
                    case 0x01:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.dec_Ed(blockStart, eip, prefices, input);
                    case 0x02:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.call_o32_Ed(blockStart, eip, prefices,
                                input);
                    case 0x03:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                prefices, input);
                    case 0x04:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.jmp_Ed(blockStart, eip, prefices, input);
                    case 0x05:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0x06:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.push_Ed(blockStart, eip, prefices, input);
                    case 0x07:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                }
            }
            return null;
        };
        ops[0x700] = (blockStart, eip, prefices, input) -> {
            int modrm = input.peek() & 0xFF;
            int reg = (modrm >> 3) & 7;
            if (modrm < 0xC0) {
                switch (reg) {
                    case 0x00:
                    case 0x01:
                    case 0x02:
                    case 0x03:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                prefices, input);
                    case 0x04:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.verr_Ew_mem(blockStart, eip, prefices,
                                input);
                    case 0x05:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                prefices, input);
                    case 0x06:
                    case 0x07:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                }
            } else {
                switch (reg) {
                    case 0x00:
                    case 0x01:
                    case 0x02:
                    case 0x03:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                prefices, input);
                    case 0x04:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.verr_Ew(blockStart, eip, prefices, input);
                    case 0x05:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                prefices, input);
                    case 0x06:
                    case 0x07:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                }
            }
            return null;
        };
        ops[0x701] = (blockStart, eip, prefices, input) -> {
            int modrm = input.peek() & 0xFF;
            int reg = (modrm >> 3) & 7;
            if (modrm < 0xC0) {
                switch (reg) {
                    case 0x00:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                prefices, input);
                    case 0x01:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                prefices, input);
                    case 0x02:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                prefices, input);
                    case 0x03:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                prefices, input);
                    case 0x04:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                prefices, input);
                    case 0x05:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0x06:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                prefices, input);
                    case 0x07:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                prefices, input);
                }
            }
            switch (modrm) {
                case 0xc0:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                            input);
                case 0xc1:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                case 0xc2:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                            input);
                case 0xc3:
                case 0xc4:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                case 0xc5:
                case 0xc6:
                case 0xc7:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                            input);
                case 0xc8:
                case 0xc9:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                case 0xca:
                case 0xcb:
                case 0xcc:
                case 0xcd:
                case 0xce:
                case 0xcf:
                case 0xd0:
                case 0xd1:
                case 0xd2:
                case 0xd3:
                case 0xd4:
                case 0xd5:
                case 0xd6:
                case 0xd7:
                case 0xd8:
                case 0xd9:
                case 0xda:
                case 0xdb:
                case 0xdc:
                case 0xdd:
                case 0xde:
                case 0xdf:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                            input);
                case 0xe0:
                case 0xe1:
                case 0xe2:
                case 0xe3:
                case 0xe4:
                case 0xe5:
                case 0xe6:
                case 0xe7:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                case 0xe8:
                case 0xe9:
                case 0xea:
                case 0xeb:
                case 0xec:
                case 0xed:
                case 0xee:
                case 0xef:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                            input);
                case 0xf0:
                case 0xf1:
                case 0xf2:
                case 0xf3:
                case 0xf4:
                case 0xf5:
                case 0xf6:
                case 0xf7:
                case 0xf8:
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                            input);
                case 0xf9:
                case 0xfa:
                case 0xfb:
                case 0xfc:
                case 0xfd:
                case 0xfe:
                case 0xff:
                    input.read8();
                    return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                            input);
            }
            return null;
        };
        ops[0x702] = ops[0x102];

        ops[0x703] = ops[0x103];

        ops[0x704] = ops[0x104];

        ops[0x705] = ops[0x105];

        ops[0x706] = ops[0x106];

        ops[0x707] = ops[0x107];

        ops[0x708] = ops[0x108];

        ops[0x709] = ops[0x109];

        ops[0x70a] = ops[0x10a];

        ops[0x70b] = ops[0x10b];

        ops[0x70c] = ops[0x10c];

        ops[0x70d] = ops[0x10d];

        ops[0x70e] = ops[0x10e];

        ops[0x70f] = ops[0x10f];

        ops[0x710] = ops[0x110];

        ops[0x711] = ops[0x111];

        ops[0x712] = ops[0x112];

        ops[0x713] = ops[0x113];

        ops[0x714] = ops[0x114];

        ops[0x715] = ops[0x115];

        ops[0x716] = ops[0x116];

        ops[0x717] = ops[0x117];

        ops[0x718] = ops[0x118];

        ops[0x719] = ops[0x119];

        ops[0x71a] = ops[0x11a];

        ops[0x71b] = ops[0x11b];

        ops[0x71c] = ops[0x11c];

        ops[0x71d] = ops[0x11d];

        ops[0x71e] = ops[0x11e];

        ops[0x71f] = ops[0x11f];

        ops[0x720] = ops[0x120];

        ops[0x721] = ops[0x121];

        ops[0x722] = ops[0x122];

        ops[0x723] = ops[0x123];

        ops[0x724] = ops[0x124];

        ops[0x725] = ops[0x125];

        ops[0x726] = null;
        ops[0x727] = ops[0x127];

        ops[0x728] = ops[0x128];

        ops[0x729] = ops[0x129];

        ops[0x72a] = ops[0x12a];

        ops[0x72b] = ops[0x12b];

        ops[0x72c] = ops[0x12c];

        ops[0x72d] = ops[0x12d];

        ops[0x72e] = null;
        ops[0x72f] = ops[0x12f];

        ops[0x730] = ops[0x130];

        ops[0x731] = ops[0x131];

        ops[0x732] = ops[0x132];

        ops[0x733] = ops[0x133];

        ops[0x734] = ops[0x134];

        ops[0x735] = ops[0x135];

        ops[0x736] = null;
        ops[0x737] = ops[0x137];

        ops[0x738] = ops[0x138];

        ops[0x739] = ops[0x139];

        ops[0x73a] = ops[0x13a];

        ops[0x73b] = ops[0x13b];

        ops[0x73c] = ops[0x13c];

        ops[0x73d] = ops[0x13d];

        ops[0x73e] = null;
        ops[0x73f] = ops[0x13f];

        ops[0x740] = ops[0x140];

        ops[0x741] = ops[0x141];

        ops[0x742] = ops[0x142];

        ops[0x743] = ops[0x143];

        ops[0x744] = ops[0x144];

        ops[0x745] = ops[0x145];

        ops[0x746] = ops[0x146];

        ops[0x747] = ops[0x147];

        ops[0x748] = ops[0x148];

        ops[0x749] = ops[0x149];

        ops[0x74a] = ops[0x14a];

        ops[0x74b] = ops[0x14b];

        ops[0x74c] = ops[0x14c];

        ops[0x74d] = ops[0x14d];

        ops[0x74e] = ops[0x14e];

        ops[0x74f] = ops[0x14f];

        ops[0x750] = null;
        ops[0x751] = ops[0x151];

        ops[0x752] = ops[0x152];

        ops[0x753] = ops[0x153];

        ops[0x754] = ops[0x154];

        ops[0x755] = ops[0x155];

        ops[0x756] = ops[0x156];

        ops[0x757] = ops[0x157];

        ops[0x758] = ops[0x158];

        ops[0x759] = ops[0x159];

        ops[0x75a] = ops[0x15a];

        ops[0x75b] = ops[0x15b];

        ops[0x75c] = ops[0x15c];

        ops[0x75d] = ops[0x15d];

        ops[0x75e] = ops[0x15e];

        ops[0x75f] = ops[0x15f];

        ops[0x760] = ops[0x160];

        ops[0x761] = ops[0x161];

        ops[0x762] = ops[0x162];

        ops[0x763] = ops[0x163];

        ops[0x764] = null;
        ops[0x765] = null;
        ops[0x766] = null;
        ops[0x767] = null;
        ops[0x768] = ops[0x168];

        ops[0x769] = ops[0x169];

        ops[0x76a] = ops[0x16a];

        ops[0x76b] = ops[0x16b];

        ops[0x76c] = (blockStart, eip, prefices, input) -> {
            if (Prefices.isRepne(prefices)) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
            if (Prefices.isRep(prefices)) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                    input);
        };
        ops[0x76d] = (blockStart, eip, prefices, input) -> {
            if (Prefices.isRepne(prefices)) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
            if (Prefices.isRep(prefices)) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                    input);
        };
        ops[0x76e] = ops[0x16e];

        ops[0x76f] = ops[0x16f];

        ops[0x770] = ops[0x170];

        ops[0x771] = ops[0x171];

        ops[0x772] = ops[0x172];

        ops[0x773] = (blockStart, eip, prefices, input) -> {
            int modrm = input.peek() & 0xFF;
            int reg = (modrm >> 3) & 7;
            if (modrm < 0xC0) {
                switch (reg) {
                    case 0x00:
                    case 0x01:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0x02:
                    case 0x03:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                prefices, input);
                    case 0x04:
                    case 0x05:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0x06:
                    case 0x07:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                prefices, input);
                }
            } else {
                switch (reg) {
                    case 0x00:
                    case 0x01:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0x02:
                    case 0x03:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                prefices, input);
                    case 0x04:
                    case 0x05:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0x06:
                    case 0x07:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                prefices, input);
                }
            }
            return null;
        };
        ops[0x774] = ops[0x174];

        ops[0x775] = ops[0x175];

        ops[0x776] = ops[0x176];

        ops[0x777] = ops[0x177];

        ops[0x778] = ops[0x178];

        ops[0x779] = ops[0x179];

        ops[0x77a] = ops[0x17a];

        ops[0x77b] = ops[0x17b];

        ops[0x77c] = (blockStart, eip, prefices, input) -> {
            if (Prefices.isRep(prefices)) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                    input);
        };
        ops[0x77d] = (blockStart, eip, prefices, input) -> {
            if (Prefices.isRep(prefices)) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                    input);
        };
        ops[0x77e] = ops[0x17e];

        ops[0x77f] = ops[0x17f];

        ops[0x780] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.jo_Jd(blockStart, eip, prefices, input);
        ops[0x781] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.jno_Jd(blockStart, eip, prefices, input);
        ops[0x782] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.jb_Jd(blockStart, eip, prefices, input);
        ops[0x783] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.jae_Jd(blockStart, eip, prefices, input);
        ops[0x784] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.je_Jd(blockStart, eip, prefices, input);
        ops[0x785] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.jne_Jd(blockStart, eip, prefices, input);
        ops[0x786] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.jbe_Jd(blockStart, eip, prefices, input);
        ops[0x787] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.ja_Jd(blockStart, eip, prefices, input);
        ops[0x788] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.js_Jd(blockStart, eip, prefices, input);
        ops[0x789] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.jns_Jd(blockStart, eip, prefices, input);
        ops[0x78a] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.jp_Jd(blockStart, eip, prefices, input);
        ops[0x78b] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.jnp_Jd(blockStart, eip, prefices, input);
        ops[0x78c] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.jl_Jd(blockStart, eip, prefices, input);
        ops[0x78d] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.jge_Jd(blockStart, eip, prefices, input);
        ops[0x78e] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.jle_Jd(blockStart, eip, prefices, input);
        ops[0x78f] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.jg_Jd(blockStart, eip, prefices, input);
        ops[0x790] = ops[0x190];

        ops[0x791] = ops[0x191];

        ops[0x792] = ops[0x192];

        ops[0x793] = ops[0x193];

        ops[0x794] = ops[0x194];

        ops[0x795] = ops[0x195];

        ops[0x796] = ops[0x196];

        ops[0x797] = ops[0x197];

        ops[0x798] = ops[0x198];

        ops[0x799] = ops[0x199];

        ops[0x79a] = ops[0x19a];

        ops[0x79b] = ops[0x19b];

        ops[0x79c] = ops[0x19c];

        ops[0x79d] = ops[0x19d];

        ops[0x79e] = ops[0x19e];

        ops[0x79f] = ops[0x19f];

        ops[0x7a0] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                input);
        ops[0x7a1] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                input);
        ops[0x7a2] = ops[0x1a2];

        ops[0x7a3] = (blockStart, eip, prefices, input) -> {
            if (parameters.getSource().isPresent() && Modrm.isMem(parameters.getSource().get().peek())) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bt_Ed_Gd_mem(blockStart, eip, prefices, input);
            } else {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bt_Ed_Gd(blockStart, eip, prefices, input);
            }
        };
        ops[0x7a4] = (blockStart, eip, prefices, input) -> {
            if (parameters.getSource().isPresent() && Modrm.isMem(parameters.getSource().get().peek())) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shld_Ed_Gd_Ib_mem(blockStart, eip, prefices,
                        input);
            } else {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shld_Ed_Gd_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0x7a5] = (blockStart, eip, prefices, input) -> {
            if (parameters.getSource().isPresent() && Modrm.isMem(parameters.getSource().get().peek())) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shld_Ed_Gd_CL_mem(blockStart, eip, prefices,
                        input);
            } else {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shld_Ed_Gd_CL(blockStart, eip, prefices, input);
            }
        };
        ops[0x7a6] = ops[0x1a6];

        ops[0x7a7] = ops[0x1a7];

        ops[0x7a8] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                input);
        ops[0x7a9] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                input);
        ops[0x7aa] = ops[0x1aa];

        ops[0x7ab] = (blockStart, eip, prefices, input) -> {
            if (parameters.getSource().isPresent() && Modrm.isMem(parameters.getSource().get().peek())) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bts_Ed_Gd_mem(blockStart, eip, prefices, input);
            } else {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bts_Ed_Gd(blockStart, eip, prefices, input);
            }
        };
        ops[0x7ac] = (blockStart, eip, prefices, input) -> {
            if (parameters.getSource().isPresent() && Modrm.isMem(parameters.getSource().get().peek())) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shrd_Ed_Gd_Ib_mem(blockStart, eip, prefices,
                        input);
            } else {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shrd_Ed_Gd_Ib(blockStart, eip, prefices, input);
            }
        };
        ops[0x7ad] = (blockStart, eip, prefices, input) -> {
            if (parameters.getSource().isPresent() && Modrm.isMem(parameters.getSource().get().peek())) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shrd_Ed_Gd_CL_mem(blockStart, eip, prefices,
                        input);
            } else {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.shrd_Ed_Gd_CL(blockStart, eip, prefices, input);
            }
        };
        ops[0x7ae] = ops[0x1ae];

        ops[0x7af] = (blockStart, eip, prefices, input) -> {
            if (parameters.getSource().isPresent() && Modrm.isMem(parameters.getSource().get().peek())) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Gd_Ed_mem(blockStart, eip, prefices,
                        input);
            } else {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.imul_Gd_Ed(blockStart, eip, prefices, input);
            }
        };
        ops[0x7b0] = ops[0x1b0];

        ops[0x7b1] = ops[0x1b1];

        ops[0x7b2] = (blockStart, eip, prefices, input) -> {
            int modrm = input.peek() & 0xFF;
            int reg = (modrm >> 3) & 7;
            if (modrm < 0xC0) {
                switch (reg) {
                    case 0x00:
                    case 0x01:
                    case 0x02:
                    case 0x03:
                    case 0x04:
                    case 0x05:
                    case 0x06:
                    case 0x07:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lss_o32_Gd_M_mem(blockStart, eip, prefices,
                                input);
                }
            } else {
                switch (reg) {
                    case 0x00:
                    case 0x01:
                    case 0x02:
                    case 0x03:
                    case 0x04:
                    case 0x05:
                    case 0x06:
                    case 0x07:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode/*(Disassembler.java line 189)*/(
                                blockStart, eip, prefices, input);
                }
            }
            return null;
        };
        ops[0x7b3] = (blockStart, eip, prefices, input) -> {
            if (parameters.getSource().isPresent() && Modrm.isMem(parameters.getSource().get().peek())) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btr_Ed_Gd_mem(blockStart, eip, prefices, input);
            } else {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btr_Ed_Gd(blockStart, eip, prefices, input);
            }
        };
        ops[0x7b4] = (blockStart, eip, prefices, input) -> {
            int modrm = input.peek() & 0xFF;
            int reg = (modrm >> 3) & 7;
            if (modrm < 0xC0) {
                switch (reg) {
                    case 0x00:
                    case 0x01:
                    case 0x02:
                    case 0x03:
                    case 0x04:
                    case 0x05:
                    case 0x06:
                    case 0x07:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lfs_o32_Gd_M_mem(blockStart, eip, prefices,
                                input);
                }
            } else {
                switch (reg) {
                    case 0x00:
                    case 0x01:
                    case 0x02:
                    case 0x03:
                    case 0x04:
                    case 0x05:
                    case 0x06:
                    case 0x07:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode/*(Disassembler.java line 189)*/(
                                blockStart, eip, prefices, input);
                }
            }
            return null;
        };
        ops[0x7b5] = (blockStart, eip, prefices, input) -> {
            int modrm = input.peek() & 0xFF;
            int reg = (modrm >> 3) & 7;
            if (modrm < 0xC0) {
                switch (reg) {
                    case 0x00:
                    case 0x01:
                    case 0x02:
                    case 0x03:
                    case 0x04:
                    case 0x05:
                    case 0x06:
                    case 0x07:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.lgs_o32_Gd_M_mem(blockStart, eip, prefices,
                                input);
                }
            } else {
                switch (reg) {
                    case 0x00:
                    case 0x01:
                    case 0x02:
                    case 0x03:
                    case 0x04:
                    case 0x05:
                    case 0x06:
                    case 0x07:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode/*(Disassembler.java line 189)*/(
                                blockStart, eip, prefices, input);
                }
            }
            return null;
        };
        ops[0x7b6] = (blockStart, eip, prefices, input) -> {
            if (parameters.getSource().isPresent() && Modrm.isMem(parameters.getSource().get().peek())) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movzx_Gd_Eb_mem(blockStart, eip, prefices,
                        input);
            } else {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movzx_Gd_Eb(blockStart, eip, prefices, input);
            }
        };
        ops[0x7b7] = (blockStart, eip, prefices, input) -> {
            if (parameters.getSource().isPresent() && Modrm.isMem(parameters.getSource().get().peek())) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movzx_Gd_Ew_mem(blockStart, eip, prefices,
                        input);
            } else {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movzx_Gd_Ew(blockStart, eip, prefices, input);
            }
        };
        ops[0x7b8] = ops[0x1b8];

        ops[0x7b9] = ops[0x1b9];

        ops[0x7ba] = (blockStart, eip, prefices, input) -> {
            int modrm = input.peek() & 0xFF;
            int reg = (modrm >> 3) & 7;
            if (modrm < 0xC0) {
                switch (reg) {
                    case 0x00:
                    case 0x01:
                    case 0x02:
                    case 0x03:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0x04:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bt_Ed_Ib_mem(blockStart, eip, prefices,
                                input);
                    case 0x05:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bts_Ed_Ib_mem(blockStart, eip, prefices,
                                input);
                    case 0x06:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btr_Ed_Ib_mem(blockStart, eip, prefices,
                                input);
                    case 0x07:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btc_Ed_Ib_mem(blockStart, eip, prefices,
                                input);
                }
            } else {
                switch (reg) {
                    case 0x00:
                    case 0x01:
                    case 0x02:
                    case 0x03:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                    case 0x04:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bt_Ed_Ib(blockStart, eip, prefices, input);
                    case 0x05:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bts_Ed_Ib(blockStart, eip, prefices, input);
                    case 0x06:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btr_Ed_Ib(blockStart, eip, prefices, input);
                    case 0x07:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btc_Ed_Ib(blockStart, eip, prefices, input);
                }
            }
            return null;
        };
        ops[0x7bb] = (blockStart, eip, prefices, input) -> {
            if (parameters.getSource().isPresent() && Modrm.isMem(parameters.getSource().get().peek())) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btc_Ed_Gd_mem(blockStart, eip, prefices, input);
            } else {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.btc_Ed_Gd(blockStart, eip, prefices, input);
            }
        };
        ops[0x7bc] = (blockStart, eip, prefices, input) -> {
            if (parameters.getSource().isPresent() && Modrm.isMem(parameters.getSource().get().peek())) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bsf_Gd_Ed_mem(blockStart, eip, prefices, input);
            } else {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.bsf_Gd_Ed(blockStart, eip, prefices, input);
            }
        };
        ops[0x7bd] = ops[0x1bd];

        ops[0x7be] = (blockStart, eip, prefices, input) -> {
            if (parameters.getSource().isPresent() && Modrm.isMem(parameters.getSource().get().peek())) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movsx_Gd_Eb_mem(blockStart, eip, prefices,
                        input);
            } else {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movsx_Gd_Eb(blockStart, eip, prefices, input);
            }
        };
        ops[0x7bf] = (blockStart, eip, prefices, input) -> {
            if (parameters.getSource().isPresent() && Modrm.isMem(parameters.getSource().get().peek())) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movsx_Gd_Ew_mem(blockStart, eip, prefices,
                        input);
            } else {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.movsx_Gd_Ew(blockStart, eip, prefices, input);
            }
        };
        ops[0x7c0] = ops[0x1c0];

        ops[0x7c1] = ops[0x1c1];

        ops[0x7c2] = ops[0x1c2];

        ops[0x7c3] = ops[0x1c3];

        ops[0x7c4] = ops[0x1c4];

        ops[0x7c5] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                input);
        ops[0x7c6] = ops[0x1c6];

        ops[0x7c7] = (blockStart, eip, prefices, input) -> {
            int modrm = input.peek() & 0xFF;
            int reg = (modrm >> 3) & 7;
            if (modrm < 0xC0) {
                switch (reg) {
                    case 0x00:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                prefices, input);
                    case 0x01:
                    case 0x02:
                    case 0x03:
                    case 0x04:
                    case 0x05:
                    case 0x06:
                    case 0x07:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                }
            } else {
                switch (reg) {
                    case 0x00:
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip,
                                prefices, input);
                    case 0x01:
                    case 0x02:
                    case 0x03:
                    case 0x04:
                    case 0x05:
                    case 0x06:
                    case 0x07:
                        input.read8();
                        return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices,
                                input);
                }
            }
            return null;
        };
        ops[0x7c8] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o32_rAXr8(blockStart, eip, prefices, input);
        ops[0x7c9] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o32_rCXr9(blockStart, eip, prefices, input);
        ops[0x7ca] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o32_rDXr10(blockStart, eip, prefices,
                input);
        ops[0x7cb] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o32_rBXr11(blockStart, eip, prefices,
                input);
        ops[0x7cc] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o32_rSPr12(blockStart, eip, prefices,
                input);
        ops[0x7cd] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o32_rBPr13(blockStart, eip, prefices,
                input);
        ops[0x7ce] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o32_rSIr14(blockStart, eip, prefices,
                input);
        ops[0x7cf] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.bswap_o32_rDIr15(blockStart, eip, prefices,
                input);
        ops[0x7d0] = (blockStart, eip, prefices, input) -> {
            if (Prefices.isRep(prefices)) {
                return new com.github.smeny.jpc.emulator.execution.opcodes.vm.InvalidOpcode(blockStart, eip, prefices, input);
            }
            return new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                    input);
        };
        ops[0x7d1] = ops[0x1d1];

        ops[0x7d2] = ops[0x1d2];

        ops[0x7d3] = ops[0x1d3];

        ops[0x7d4] = ops[0x1d4];

        ops[0x7d5] = ops[0x1d5];

        ops[0x7d6] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                input);
        ops[0x7d7] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                input);
        ops[0x7d8] = ops[0x1d8];

        ops[0x7d9] = ops[0x1d9];

        ops[0x7da] = ops[0x1da];

        ops[0x7db] = ops[0x1db];

        ops[0x7dc] = ops[0x1dc];

        ops[0x7dd] = ops[0x1dd];

        ops[0x7de] = ops[0x1de];

        ops[0x7df] = ops[0x1df];

        ops[0x7e0] = ops[0x1e0];

        ops[0x7e1] = ops[0x1e1];

        ops[0x7e2] = ops[0x1e2];

        ops[0x7e3] = ops[0x1e3];

        ops[0x7e4] = ops[0x1e4];

        ops[0x7e5] = ops[0x1e5];

        ops[0x7e6] = (blockStart, eip, prefices, input) -> new com.github.smeny.jpc.emulator.execution.opcodes.vm.UnimplementedOpcode(blockStart, eip, prefices,
                input);
        ops[0x7e7] = ops[0x1e7];

        ops[0x7e8] = ops[0x1e8];

        ops[0x7e9] = ops[0x1e9];

        ops[0x7ea] = ops[0x1ea];

        ops[0x7eb] = ops[0x1eb];

        ops[0x7ec] = ops[0x1ec];

        ops[0x7ed] = ops[0x1ed];

        ops[0x7ee] = ops[0x1ee];

        ops[0x7ef] = ops[0x1ef];

        ops[0x7f0] = null;
        ops[0x7f1] = ops[0x1f1];

        ops[0x7f2] = null;
        ops[0x7f3] = null;
        ops[0x7f4] = ops[0x1f4];

        ops[0x7f5] = ops[0x1f5];

        ops[0x7f6] = ops[0x1f6];

        ops[0x7f7] = ops[0x1f7];

        ops[0x7f8] = ops[0x1f8];

        ops[0x7f9] = ops[0x1f9];

        ops[0x7fa] = ops[0x1fa];

        ops[0x7fb] = ops[0x1fb];

        ops[0x7fc] = ops[0x1fc];

        ops[0x7fd] = ops[0x1fd];

        ops[0x7fe] = ops[0x1fe];

        ops[0x7ff] = ops[0x1ff];

    }
}
