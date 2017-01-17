package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String fileName = in.readLine();
        List<Integer> listOfNumbers = readNumbersFromFile(fileName);
        removeOdd(listOfNumbers);
        combSort(listOfNumbers);

        for (Integer number : listOfNumbers)
        {
            System.out.println(number);
        }
    }

    private static void combSort(List<Integer> list)
    {
        Integer[] array = list.toArray(new Integer[list.size()]);
        combSort(array);
        list.clear();
        Collections.addAll(list, array);
    }

    static List<Integer> readNumbersFromFile(String fileName)
    {
        if (null == fileName || fileName.isEmpty())
            return null;

        List<Integer> result = new ArrayList<Integer>();
        try
        {
            BufferedReader fin = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            String line;
            while ((line = fin.readLine()) != null)
            {
                result.add(Integer.parseInt(line));
            }
            fin.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }

        return result;
    }

    static void removeOdd(List<Integer> array)
    {
        for (int i = 0; i < array.size(); i++)
        {
            if (isOdd(array.get(i)))
            {
                array.remove(i--);
            }
        }
    }

    public static void combSort(int[] arr)
    {
        float reFact = 1.247f;

        float dist = arr.length / reFact;
        int ival = Math.round(dist);
        /*int ival = (int) (arr.length / reFact);
        if (ival < 1)
            ival = 1;*/

        boolean isSorted = false;
        int rest = arr.length;
        while (!isSorted)
        {
            if (ival == 1)
                isSorted = true;
            for (int i = 0; i + ival < rest; i++)
            {
                //System.out.println("dist=" + dist);
                if (arr[i] > arr[i + ival])
                {
                    int t = arr[i];
                    arr[i] = arr[i + ival];
                    arr[i + ival] = t;
                    isSorted = false;
                }
            }
            if (ival > 1)
            {
                dist /= reFact;
                ival = Math.round(dist);
                /*ival /= reFact;
                if (ival < 1)
                    ival = 1;*/
            } else
                rest--;
        }
    }

    public static void combSort(Integer[] arr)
    {
        float reFact = 1.247f;

        float dist = arr.length / reFact;
        int ival = Math.round(dist);
        /*int ival = (int) (arr.length / reFact);
        if (ival < 1)
            ival = 1;*/

        boolean isSorted = false;
        int rest = arr.length;
        while (!isSorted)
        {
            if (ival == 1)
                isSorted = true;
            for (int i = 0; i + ival < rest; i++)
            {
                //System.out.println("dist=" + dist);
                if (arr[i] > arr[i + ival])
                {
                    int t = arr[i];
                    arr[i] = arr[i + ival];
                    arr[i + ival] = t;
                    isSorted = false;
                }
            }
            if (ival > 1)
            {
                dist /= reFact;
                ival = Math.round(dist);
                /*ival /= reFact;
                if (ival < 1)
                    ival = 1;*/
            } else
                rest--;
        }
    }

    static boolean isOdd(int a)
    {
        return 0 != a % 2;
    }
}
