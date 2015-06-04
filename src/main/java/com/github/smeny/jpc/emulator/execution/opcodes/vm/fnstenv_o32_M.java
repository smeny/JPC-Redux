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

import com.github.smeny.jpc.emulator.execution.*;
import com.github.smeny.jpc.emulator.execution.decoder.*;
import com.github.smeny.jpc.emulator.processor.*;
import com.github.smeny.jpc.emulator.processor.fpu64.*;
import static com.github.smeny.jpc.emulator.processor.Processor.*;

public class fnstenv_o32_M extends Executable
{
    final Pointer op1;

    public fnstenv_o32_M(int blockStart, int eip, int prefices, PeekableInputStream input)
    {
        super(blockStart, eip);
        int modrm = input.readU8();
        op1 = Modrm.getPointer(prefices, modrm, input);
    }

    public Branch execute(Processor cpu)
    {
        System.out.println("Warning: Using incomplete opcode: FNSTENV_28");
        int addr = op1.get(cpu);
        cpu.linearMemory.setDoubleWord(addr, 0xffff & cpu.fpu.getControl());
        cpu.linearMemory.setDoubleWord(addr + 4, 0xffff & cpu.fpu.getStatus());
        cpu.linearMemory.setDoubleWord(addr + 8, 0xffff & cpu.fpu.getTagWord());
        cpu.linearMemory.setDoubleWord(addr + 12, (short) 0 /* cpu.fpu.getIP()  offset*/);
        cpu.linearMemory.setDoubleWord(addr + 16, (short) 0 /* (selector & 0xFFFF)*/);
        cpu.linearMemory.setDoubleWord(addr + 20, (short) 0 /* operand pntr offset*/);
        cpu.linearMemory.setDoubleWord(addr + 24, (short) 0 /* operand pntr selector & 0xFFFF*/);
        return Branch.None;
    }

    public boolean isBranch()
    {
        return false;
    }

    public String toString()
    {
        return this.getClass().getName();
    }
}