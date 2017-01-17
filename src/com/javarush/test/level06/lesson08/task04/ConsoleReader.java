package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        return in.readLine();
    }

    public static int readInt() throws Exception
    {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int n = 0;
        boolean isInt = false;
        do
        {
            s = in.readLine();
            try
            {
                n = Integer.parseInt(s);
                isInt = true;
            }
            catch (NumberFormatException e)
            {
                e.printStackTrace();
            }
        }
        while (!isInt);

        return n;
    }

    public static double readDouble() throws Exception
    {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        double n = 0;
        boolean isDouble = false;
        do
        {
            s = in.readLine();
            try
            {
                n = Double.parseDouble(s);
                isDouble = true;
            }
            catch (NumberFormatException e)
            {
                e.printStackTrace();
            }
        }
        while (!isDouble);

        return n;
    }

    public static boolean readBoolean() throws Exception
    {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        return Boolean.parseBoolean(in.readLine());
    }
}
