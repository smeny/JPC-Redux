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

import com.github.smeny.jpc.emulator.execution.*;
import com.github.smeny.jpc.emulator.execution.decoder.*;
import com.github.smeny.jpc.emulator.processor.*;
import com.github.smeny.jpc.emulator.processor.fpu64.*;
import static com.github.smeny.jpc.emulator.processor.Processor.*;

public class fbstp_Mt_mem extends Executable
{
    final Pointer op1;

    public fbstp_Mt_mem(int blockStart, int eip, int prefices, PeekableInputStream input)
    {
        super(blockStart, eip);
        int modrm = input.readU8();
        op1 = Modrm.getPointer(prefices, modrm, input);
    }

    public Branch execute(Processor cpu)
    {
        byte[] data = new byte[10];
        long n = (long)Math.abs(cpu.fpu.ST(0));
        long decade = 1;
        for (int i = 0; i < 9; i++) 
        {
            int val = (int) ((n % (decade * 10)) / decade);
            byte b = (byte) val;
            decade *= 10;
            val = (int) ((n % (decade * 10)) / decade);
            b |= (val << 4);
            data[i] = b;
       }
       data[9] =  (cpu.fpu.ST(0) < 0) ? (byte)0x80 : (byte)0x00;
       op1.setF80(cpu,  data);
       cpu.fpu.pop();
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