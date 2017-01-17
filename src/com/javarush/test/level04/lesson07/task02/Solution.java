package com.javarush.test.level04.lesson07.task02;

/* Строка - описание
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
«четное однозначное число» - если число четное и имеет одну цифру,
«нечетное однозначное число» - если число нечетное и имеет одну цифру,
«четное двузначное число» - если число четное и имеет две цифры,
«нечетное двузначное число» - если число нечетное и имеет две цифры,
«четное трехзначное число» - если число четное и имеет три цифры,
«нечетное трехзначное число» - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
Пример для числа 100:
четное трехзначное число
Пример для числа 51:
нечетное двузначное число
*/

import java.io.*;

public class Solution
{
    private enum DigitsCount{однозначное, двузначное, трехзначное}

    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(in.readLine());

        /*StringBuilder desc = new StringBuilder();
        if (x % 2 == 0)
            desc.append("четное");
        else
            desc.append("нечетное");
        if (x < 10)
            desc.append(" однозначное");
        else if (x < 100)
            desc.append(" двузначное");
        else
            desc.append("трехзначное");
        desc.append(" число");

        System.out.println(desc);*/

        if ((x >= 1) && (x <= 999))
        {
            int d = 1;
            int i = 10;
            while (x / i > 0) { d++; i *= 10; }
            StringBuilder desc = new StringBuilder();
            if (x % 2 == 0) desc.append("четное");
            else
                desc.append("нечетное");

            desc.append(" ");
            desc.append(DigitsCount.values()[d - 1]);
            desc.append(" число");

            System.out.println(desc);
        }
    }
}
