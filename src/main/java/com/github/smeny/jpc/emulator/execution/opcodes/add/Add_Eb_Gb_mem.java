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

public class Add_Eb_Gb_mem extends Executable {
    private final Pointer op1;
    private final int op2Index;

    public Add_Eb_Gb_mem(ExecutableParameters parameters) {
        super(parameters);
        int modrm = getModRM(parameters);
        op1 = Modrm.getPointer(parameters, modrm);
        op2Index = Modrm.Gb(modrm);
    }

    public Branch execute(Processor cpu) {
        Reg op2 = cpu.regs[op2Index];
        cpu.flagOp1 = op1.get8(cpu);
        cpu.flagOp2 = op2.get8();
        cpu.flagResult = (byte) (cpu.flagOp1 + cpu.flagOp2);
        op1.set8(cpu, (byte) cpu.flagResult);
        cpu.flagIns = UCodes.ADD8;
        cpu.flagStatus = OSZAPC;
        return Branch.None;
    }

}