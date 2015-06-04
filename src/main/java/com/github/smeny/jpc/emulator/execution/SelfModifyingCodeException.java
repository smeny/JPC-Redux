package com.github.smeny.jpc.emulator.execution;

public class SelfModifyingCodeException extends RuntimeException
{
    public SelfModifyingCodeException(String message)
    {
        super(message);
    }
}
