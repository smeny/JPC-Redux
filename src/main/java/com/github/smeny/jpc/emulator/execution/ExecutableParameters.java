/*
    JPC: An x86 PC Hardware Emulator for a pure Java Virtual Machine

    Copyright (C) 2015 Stephane Meny

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along
    with this program; if not, write to the Free Software Foundation, Inc.,
    51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.github.smeny.jpc.emulator.execution;

import com.github.smeny.jpc.emulator.execution.decoder.Instruction;
import com.github.smeny.jpc.emulator.execution.decoder.PeekableInputStream;

import java.util.Optional;

public class ExecutableParameters {
    private final int blockStart;
    private final int eip;

    private final OperatingMode operatingMode;
    private final Instruction instruction;
    private final Integer prefixes;
    // input will be pointing at the modrm byte or the first byte after it
    private final PeekableInputStream input;
    private final Executable parentExecutable;
    private final Boolean operand32Bits;
    private final Boolean address32Bits;


    private ExecutableParameters(Builder builder) {
        this.blockStart = builder.blockStart;
        this.eip = builder.eip;
        this.operatingMode = builder.operatingMode;
        this.instruction = builder.instruction;
        this.prefixes = builder.prefixes;
        this.input = builder.input;
        this.parentExecutable = builder.parentExecutable;
        this.operand32Bits = builder.operand32Bits;
        this.address32Bits = builder.address32Bits;
    }

    public int getBlockStart() {
        return blockStart;
    }

    public int getEip() {
        return eip;
    }

    public Optional<Instruction> getInstruction() {
        return Optional.ofNullable(instruction);
    }

    public Optional<Integer> getPrefixes() {
        return Optional.ofNullable(prefixes);
    }

    public Optional<PeekableInputStream> getInput() {
        return Optional.ofNullable(input);
    }

    public Optional<Executable> getParentExecutable() {
        return Optional.ofNullable(parentExecutable);
    }

    public Optional<OperatingMode> getOperatingMode() {
        return  Optional.ofNullable(operatingMode);
    }

    public Optional<Boolean> getOperand32Bits() {
        return Optional.ofNullable(operand32Bits);
    }

    public Optional<Boolean> getAddress32Bits() {
        return Optional.ofNullable(address32Bits);
    }

    public static class Builder {
        // Required parameters
        private final int blockStart;
        private final int eip;

        // Optional parameters
        private Instruction instruction;
        private Integer prefixes;
        private PeekableInputStream input;
        private Executable parentExecutable;
        private OperatingMode operatingMode;
        private Boolean operand32Bits;
        private Boolean address32Bits;

        public Builder(int blockStart, int eip) {
            this.blockStart = blockStart;
            this.eip = eip;
        }

        public Builder(int blockStart, Instruction instruction) {
            // FIXME: Casting long to int, to be checked for overflow
            this(blockStart, (int) instruction.eip);
            this.instruction = instruction;
        }

        public Builder prefixes(Integer prefixes) {
            this.prefixes = prefixes;
            return this;
        }

        public Builder operatingMode(OperatingMode operatingMode) {
            this.operatingMode = operatingMode;
            return this;
        }

        public Builder input(PeekableInputStream input) {
            this.input = input;
            return this;
        }

        public Builder parentExecutable(Executable parentExecutable) {
            this.parentExecutable = parentExecutable;
            return this;
        }

        public Builder operand32Bits(Boolean operand32Bits) {
            this.operand32Bits = operand32Bits;
            return this;
        }

        public Builder address32Bits(Boolean address32Bits) {
            this.address32Bits = address32Bits;
            return this;
        }

        public ExecutableParameters build() {
            return new ExecutableParameters(this);
        }
    }
}
