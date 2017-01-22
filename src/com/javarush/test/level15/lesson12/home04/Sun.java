package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Mr.Evil on 02.01.2017.
 */
public class Sun implements Planet
{
    private static Sun instance = null;

    private Sun()
    {

    }

    public static Sun getInstance()
    {
        if (instance == null)
        {
            instance = new Sun();
        }

        return instance;
    }
}
