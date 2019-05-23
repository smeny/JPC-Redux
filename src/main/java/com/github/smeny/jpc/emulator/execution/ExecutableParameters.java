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
    private final int prefices;
    private final PeekableInputStream input;
    private final Executable parentExecutable;

    private ExecutableParameters(Builder builder) {
        this.blockStart = builder.blockStart;
        this.eip = builder.eip;
        this.operatingMode = builder.operatingMode;
        this.instruction = builder.instruction;
        this.prefices = builder.prefices;
        this.input = builder.input;
        this.parentExecutable = builder.parentExecutable;
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

    public int getPrefices() {
        return prefices;
    }

    public Optional<PeekableInputStream> getInput() {
        return Optional.ofNullable(input);
    }

    public Optional<Executable> getParentExecutable() {
        return Optional.ofNullable(parentExecutable);
    }

    public OperatingMode getOperatingMode() {
        return operatingMode;
    }

    public static class Builder {
        // Required parameters
        private final int blockStart;
        private final int eip;

        // Optional parameters
        private Instruction instruction;
        private int prefices;
        private PeekableInputStream input;
        private Executable parentExecutable;
        private OperatingMode operatingMode;

        public Builder(int blockStart, int eip) {
            this.blockStart = blockStart;
            this.eip = eip;
        }

        public Builder(int blockStart, Instruction instruction) {
            // FIXME: Casting long to int, to be checked for overflow
            this(blockStart, (int) instruction.eip);
            this.instruction = instruction;
        }

        public Builder prefices(int prefices) {
            this.prefices = prefices;
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

        public ExecutableParameters build() {
            return new ExecutableParameters(this);
        }
    }
}
