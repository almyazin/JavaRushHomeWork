package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();

        int maxLength = 0;

        for (int i = 0; i < 5; i++)
        {
            strings.add(in.readLine());
            if (strings.get(i).length() > maxLength)
                maxLength = strings.get(i).length();
        }

        for (int i = 0; i < strings.size(); i++)
        {
            if (strings.get(i).length() == maxLength)
                System.out.println(strings.get(i));
        }
    }
}