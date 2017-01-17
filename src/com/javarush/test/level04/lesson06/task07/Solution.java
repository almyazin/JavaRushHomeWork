package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
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

        if (n1 == n2)
            System.out.println(3);
        else if (n1 == n3)
            System.out.println(2);
        else
            System.out.println(1);
    }
}
