package com.javarush.test.level08.lesson11.home09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws ParseException
    {
        System.out.println(isDateOdd("JANUARY 1 2020"));
        System.out.println(isDateOdd("May 27 2016"));
    }

    public static boolean isDateOdd(String date) throws ParseException
    {
        int numOfDays = 0;
        Date dDate = new Date(date);
        int year = dDate.getYear();
        int month = dDate.getMonth();
        int day = dDate.getDate();

        boolean isLeapYear = (year % 100 == 0) ? (year % 400 == 0) : (year % 4 == 0);

        for (int i = 0; i < month; i++)
        {
            switch (i)
            {
                case 0:
                case 2:
                case 4:
                case 6:
                case 7:
                case 9:
                case 11:
                    numOfDays += 31;
                    break;
                case 1:
                    numOfDays += isLeapYear ? 29 : 28;
                    break;
                default:
                    numOfDays += 30;
            }
        }

        numOfDays += day;

        System.out.println(numOfDays);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(new SimpleDateFormat("MMMM d yyyy").parse(date));

        int numOfDays2 = gregorianCalendar.get(Calendar.DAY_OF_YEAR);

        System.out.println(numOfDays2);

        return numOfDays % 2 != 0;
    }
}
