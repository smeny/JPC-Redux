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

package com.github.smeny.jpc.emulator.execution.opcodes.pm;

import com.github.smeny.jpc.emulator.execution.Executable;
import com.github.smeny.jpc.emulator.execution.UCodes;
import com.github.smeny.jpc.emulator.execution.decoder.Modrm;
import com.github.smeny.jpc.emulator.execution.decoder.PeekableInputStream;
import com.github.smeny.jpc.emulator.execution.decoder.Pointer;
import com.github.smeny.jpc.emulator.processor.Processor;

import static com.github.smeny.jpc.emulator.processor.Processor.Reg;

public class shr_Ew_Gb_mem extends Executable {
  final Pointer op1;
  final int op2Index;

  public shr_Ew_Gb_mem(int blockStart, int eip, int prefices, PeekableInputStream input) {
    super(blockStart, eip);
    int modrm = input.readU8();
    op1 = Modrm.getPointer(prefices, modrm, input);
    op2Index = Modrm.Gb(modrm);
  }

  public Branch execute(Processor cpu) {
    Reg op2 = cpu.regs[op2Index];
    if ((0x1f & op2.get8()) != 0) {
      cpu.flagOp1 = 0xFFFF & op1.get16(cpu);
      cpu.flagOp2 = 0x1f & op2.get8();
      cpu.flagResult = (short) (cpu.flagOp1 >>> cpu.flagOp2);
      op1.set16(cpu, (short) cpu.flagResult);
      cpu.flagIns = UCodes.SHR16;
      cpu.flagStatus = OSZAPC;
    }
    return Branch.None;
  }

  public boolean isBranch() {
    return false;
  }

  public String toString() {
    return this.getClass().getName();
  }
}