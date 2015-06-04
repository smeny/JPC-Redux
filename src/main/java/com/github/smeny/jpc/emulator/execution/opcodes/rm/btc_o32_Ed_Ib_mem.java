package com.github.smeny.jpc.emulator.execution.opcodes.rm;

import com.github.smeny.jpc.emulator.execution.*;
import com.github.smeny.jpc.emulator.execution.decoder.*;
import com.github.smeny.jpc.emulator.processor.*;
import com.github.smeny.jpc.emulator.processor.fpu64.*;
import static com.github.smeny.jpc.emulator.processor.Processor.*;

public class btc_o32_Ed_Ib_mem extends Executable
{
    final Pointer op1;
    final int immb;

    public btc_o32_Ed_Ib_mem(int blockStart, Instruction parent)
    {
        super(blockStart, parent);
        op1 = new Pointer(parent.operand[0], parent.adr_mode);
        immb = (byte)parent.operand[1].lval;
    }

    public Branch execute(Processor cpu)
    {
        int bit = 1 << immb;
        int offset = ((immb & ~(32-1))/8);
        cpu.cf = (0 != (op1.get32(cpu,  offset) & bit));
        cpu.flagStatus &= NCF;
        op1.set32(cpu,  offset, (op1.get32(cpu,  offset)^bit));
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