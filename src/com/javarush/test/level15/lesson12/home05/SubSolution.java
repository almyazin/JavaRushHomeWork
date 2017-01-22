package com.javarush.test.level15.lesson12.home05;

import java.util.Objects;

/**
 * Created by Mr.Evil on 02.01.2017.
 */
public class SubSolution extends Solution
{
    SubSolution()
    {
    }

    SubSolution(int x)
    {
        super(x);
    }

    SubSolution(String s)
    {
        super(s);
    }

    private SubSolution(double n) {}
    private SubSolution(char c) {}
    private SubSolution(byte b) {}

    protected SubSolution(boolean b)
    {
        super(b);
    }

    protected SubSolution(long l)
    {
        super(l);
    }

    protected SubSolution(float f)
    {
        super(f);
    }

    public SubSolution(Objects o)
    {
        super(o);
    }

    public SubSolution(Integer i)
    {
        super(i);
    }

    public SubSolution(Double d)
    {
        super(d);
    }
}
