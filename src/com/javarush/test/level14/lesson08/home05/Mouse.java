package com.javarush.test.level14.lesson08.home05;

/**
 * Created by amyazin on 12/23/2016.
 */
public class Mouse implements CompItem
{
    @Override
    public String getName()
    {
        return this.getClass().getSimpleName();
    }
}
