package com.javarush.test.level15.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/* Факториал
Написать метод, который вычисляет факториал - произведение всех чисел от 1 до введенного числа включая его.
Пример: 4! = factorial(4) = 1*2*3*4 = 24
1. Ввести с консоли число меньше либо равно 150.
2. Реализовать функцию  factorial.
3. Если введенное число меньше 0, то вывести 0.
0! = 1
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        if (input < 0)
            System.out.println(0);
        else if (input <= 150)
            System.out.println(factorial(input));
    }

    public static String factorial(int n) {


        //return String.format("%.0f", fact(n));
        //return String.format("%d", fact(n));
        return fact(BigDecimal.valueOf(n)).toPlainString();
    }

    /*private static long fact(long n)
    {
        if (0 == n)
            return 1;
        if (n > 1)
            return n * fact(n - 1);
        else
            return n;
    }*/

    /*private static double fact(double n)
    {
        if (0 == n)
            return 1;
        if (n > 1)
            return n * fact(n - 1);
        else
            return n;
    }*/

    private static BigDecimal fact(BigDecimal n)
    {
        if (n.compareTo(BigDecimal.valueOf(0)) == 0)
            return BigDecimal.valueOf(1);
        if (n.compareTo(BigDecimal.valueOf(1)) == 1)
            return n.multiply(fact(n.subtract(BigDecimal.ONE)));
        else
            return n;
    }
}
