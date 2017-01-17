package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(in.readLine());
        int n2 = Integer.parseInt(in.readLine());
        int n3 = Integer.parseInt(in.readLine());

        System.out.println((n1 >= n2 && n1 <= n3) || (n1 >= n3 && n1 <= n2) ? n1 : (n2 >= n1 && n2 <= n3) || (n2 >= n3 && n2 <= n1) ? n2 : n3);
    }
}
