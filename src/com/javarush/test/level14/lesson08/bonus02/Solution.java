package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        int n1 = Integer.parseInt(s);
        s = in.readLine();
        int n2 = Integer.parseInt(s);

        System.out.println(findGGD(n1, n2));

    }

    private static int findGGD(int x, int y)
    {
        for (int i = (x < y) ? x : y; i > 0; i--)
        {
            if (0 == x % i && 0 == y % i)
                return i;
        }

        return 1;
    }
}
