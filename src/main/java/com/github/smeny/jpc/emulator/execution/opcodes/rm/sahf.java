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

package com.github.smeny.jpc.emulator.execution.opcodes.rm;

import com.github.smeny.jpc.emulator.execution.Executable;
import com.github.smeny.jpc.emulator.execution.decoder.PeekableInputStream;
import com.github.smeny.jpc.emulator.processor.Processor;

public class sahf extends Executable {

  public sahf(int blockStart, int eip, int prefices, PeekableInputStream input) {
    super(blockStart, eip);
  }

  public Branch execute(Processor cpu) {
    byte fx = (byte) (cpu.r_ah.get8());
    cpu.flagStatus &= OF;
    cpu.sf = (fx & (1 << 7)) != 0;
    cpu.zf = (fx & (1 << 6)) != 0;
    cpu.af = (fx & (1 << 4)) != 0;
    cpu.pf = (fx & (1 << 2)) != 0;
    cpu.cf = (fx & 1) != 0;
    return Branch.None;
  }

  public boolean isBranch() {
    return false;
  }

  public String toString() {
    return this.getClass().getName();
  }
}