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

package com.github.smeny.jpc.emulator.execution.opcodes.vm;

import com.github.smeny.jpc.emulator.execution.Executable;
import com.github.smeny.jpc.emulator.execution.decoder.Modrm;
import com.github.smeny.jpc.emulator.execution.decoder.PeekableInputStream;
import com.github.smeny.jpc.emulator.execution.decoder.Pointer;
import com.github.smeny.jpc.emulator.processor.Processor;

public class jmp_Ed_mem extends Executable {
  final Pointer op1;
  final int blockLength;
  final int instructionLength;

  public jmp_Ed_mem(int blockStart, int eip, int prefices, PeekableInputStream input) {
    super(blockStart, eip);
    int modrm = input.readU8();
    op1 = Modrm.getPointer(prefices, modrm, input);
    instructionLength = (int) input.getAddress() - eip;
    blockLength = eip - blockStart + instructionLength;
  }

  public Branch execute(Processor cpu) {
    cpu.eip = op1.get32(cpu);
    return Branch.Jmp_Unknown;
  }

  public boolean isBranch() {
    return true;
  }

  public String toString() {
    return this.getClass().getName();
  }
}