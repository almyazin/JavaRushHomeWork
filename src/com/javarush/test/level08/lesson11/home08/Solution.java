package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Random;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random rnd = new Random();
        int[] array = new int[20000];
        for (int i = 0; i < array.length; i++)
        {
            //array[i] = Integer.parseInt(reader.readLine());
            array[i] = rnd.nextInt();
        }

        Date start = new Date();
        sort(array.clone());
        Date end = new Date();
        System.out.println(end.getTime() - start.getTime());
        start = new Date();
        sort2(array.clone());
        end = new Date();
        System.out.println(end.getTime() - start.getTime());

        start = new Date();
        bubbleSort(array);
        end = new Date();
        System.out.println(end.getTime() - start.getTime());


        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array)
    {
        //напишите тут ваш код
        boolean isDone = false;
        int x;
        while (!isDone)
        {
            isDone = true;
            for (int i = 0; i < array.length - 1; i++)
            {
                if (array[i] < array[i + 1])
                {
                    x = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = x;
                    isDone = false;
                }
            }
        }
    }

    public static void sort2(int[] array)
    {
        //напишите тут ваш код
        for (int i = 0; i < array.length; i++)
        {
            int max = array[i];
            int maxId = i;
            for (int j = i; j < array.length; j++)
            {
                if (array[j] > max)
                {
                    max = array[j];
                    maxId = j;
                }
            }
            if (maxId != i)
            {
                int n = array[i];
                array[i] = max;
                array[maxId] = n;
            }
        }
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }
}
