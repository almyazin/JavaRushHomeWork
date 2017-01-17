package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/


import java.util.Calendar;
import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        /*Calendar calendar = Calendar.getInstance();

        System.out.printf("%02d %02d %d", calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.MONTH), calendar.get(Calendar.YEAR));*/
        Date date = new Date();
        System.out.printf("%02d %02d %d", date.getDate(), date.getMonth() + 1, date.getYear() + 1900);
    }
}
