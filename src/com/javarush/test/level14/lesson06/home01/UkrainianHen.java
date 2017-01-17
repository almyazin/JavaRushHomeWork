package com.javarush.test.level14.lesson06.home01;

/**
 * Created by amyazin on 12/21/2016.
 */
public class UkrainianHen extends Hen
{

    @Override
    public int getCountOfEggsPerMonth()
    {
        return 2;
    }

    @Override
    public String getDescription()
    {
        return String.format("%s Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(), Country.UKRAINE, getCountOfEggsPerMonth());
    }
}
