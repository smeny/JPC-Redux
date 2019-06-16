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

package com.github.smeny.jpc.emulator.execution.opcodes.add;

import com.github.smeny.jpc.emulator.execution.Executable;
import com.github.smeny.jpc.emulator.execution.ExecutableParameters;
import com.github.smeny.jpc.emulator.execution.UCodes;
import com.github.smeny.jpc.emulator.execution.decoder.Modrm;
import com.github.smeny.jpc.emulator.execution.decoder.Pointer;
import com.github.smeny.jpc.emulator.processor.Processor;

import static com.github.smeny.jpc.emulator.processor.Processor.Reg;

public class Add_Gb_Eb_mem extends Executable {
    private final int op1Index;
    private final Pointer op2;

    public Add_Gb_Eb_mem(ExecutableParameters parameters) {
        super(parameters);
        int modrm = getModRM(parameters);
        op1Index = Modrm.Gb(modrm);
        op2 = Modrm.getPointer(parameters, modrm);
    }

    public Branch execute(Processor cpu) {
        Reg op1 = cpu.regs[op1Index];
        cpu.flagOp1 = op1.get8();
        cpu.flagOp2 = op2.get8(cpu);
        cpu.flagResult = (byte) (cpu.flagOp1 + cpu.flagOp2);
        op1.set8((byte) cpu.flagResult);
        cpu.flagIns = UCodes.ADD8;
        cpu.flagStatus = OSZAPC;
        return Branch.None;
    }

}
