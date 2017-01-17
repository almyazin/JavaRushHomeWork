package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(in.readLine());
        int n2 = Integer.parseInt(in.readLine());
        int n3 = Integer.parseInt(in.readLine());

        int min, max, mid;

        if (n1 > n2)
        {
            max = n1;
            min = n2;
        }
        else
        {
            max = n2;
            min = n1;
        }
        if (n3 > max)
        {
            mid = max;
            max = n3;
        }
        else
        {
            if (n3 < min)
            {
                mid = min;
                min = n3;
            }
            else
            {
                mid = n3;
            }
        }
        System.out.printf("%d %d %d", max, mid, min);
    }
}
