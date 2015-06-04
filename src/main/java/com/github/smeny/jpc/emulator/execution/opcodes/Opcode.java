/*
    JPC: An x86 PC Hardware Emulator for a pure Java Virtual Machine

    Copyright (C) 2015 Stephane Meny

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
*/

package com.github.smeny.jpc.emulator.execution.opcodes;

import com.github.smeny.jpc.emulator.execution.Executable;
import com.github.smeny.jpc.emulator.execution.ExecutableParameters;

import java.util.EnumMap;
import java.util.function.Function;

public enum Opcode {
  AAA,
  AAD,
  AAM,
  AAS,
  EIP_UPDATE;

  private static EnumMap<Opcode, Function<ExecutableParameters, ? extends Executable>> opcodeExecutions;

  static {
    opcodeExecutions = new EnumMap<>(Opcode.class);
    opcodeExecutions.put(AAA, AsciiAdjustAlAfterAddition::new);
    opcodeExecutions.put(AAD, AsciiAdjustAxBeforeDivision::new);
    opcodeExecutions.put(AAM, AsciiAdjustAxAfterMultiplication::new);
    opcodeExecutions.put(AAS, AsciiAdjustAlAfterSubtraction::new);
    opcodeExecutions.put(EIP_UPDATE, EipUpdate::new);
  }


}
