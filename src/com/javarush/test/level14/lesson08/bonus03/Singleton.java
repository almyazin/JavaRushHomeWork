package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by amyazin on 12/28/2016.
 */
public class Singleton
{
    private static Singleton instance = null;

    private Singleton()
    {

    }

    public static Singleton getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}
