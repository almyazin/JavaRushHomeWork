package com.javarush.test.level14.lesson08.bonus01;

import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            Integer.parseInt("n");
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            File f = new File((String) null);
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            FileInputStream fi = new FileInputStream("xxx");
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            OutputStreamWriter o = new OutputStreamWriter((OutputStream) new Object());
            o.write("");
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            FileOutputStream os = new FileOutputStream("f1");
            os.close();
            os.write('a');
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            int[] ar = new int[10];
            ar[10] = 1;
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            String s = "abc";
            s.charAt(3);
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new IllegalArgumentException("IllegalArgumentException");
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new SQLException("SQLException");
        } catch (Exception e)
        {
            exceptions.add(e);
        }

    }
}
