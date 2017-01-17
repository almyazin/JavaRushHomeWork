package com.javarush.test.level04.lesson07.task01;

/* Строка - описание
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» - если число отрицательное и четное,
«отрицательное нечетное число» - если число отрицательное и нечетное,
«нулевое число» - если число равно 0,
«положительное четное число» - если число положительное и четное,
«положительное нечетное число» - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        StringBuilder desc = new StringBuilder();
        if (n == 0)
            desc.append("нулевое");
        else
        {
            if (n < 0)
                desc.append("отрицательное");
            else
                desc.append("положительное");
            desc.append(" ");
            if (n % 2 == 0)
                desc.append("четное");
            else
                desc.append("нечетное");
        }
        desc.append(" число");

        System.out.println(desc);
    }
}

