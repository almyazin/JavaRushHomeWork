package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    private static int max (int a, int b)
    {
        if (a > b)
            return a;
        else
            return b;
    }
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(in.readLine());
        int n2 = Integer.parseInt(in.readLine());
        int n3 = Integer.parseInt(in.readLine());
        int n4 = Integer.parseInt(in.readLine());

        if (max(n1, n2) > max(n3, n4))
            System.out.println(max(n1, n2));
        else
            System.out.println(max(n3, n4));
    }
}
