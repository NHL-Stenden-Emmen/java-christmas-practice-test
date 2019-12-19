package com.nhlstenden.exception;

public class ChristmasBallToBigException extends Exception
{
    public ChristmasBallToBigException()
    {
        super("The Christmas Ball you are trying to make is to big. The max size is 30cm.");
    }
}
