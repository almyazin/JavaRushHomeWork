package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by Mr.Evil on 03.01.2017.
 */
public class Plane implements Flyable
{
    private int passangersAmaount;

    @Override
    public void fly()
    {

    }

    public Plane(int passangersAmount)
    {
        this.passangersAmaount = passangersAmount;
    }
}
