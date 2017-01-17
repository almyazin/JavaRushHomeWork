package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        LinkedHashMap<Character, Integer> alphabet = new LinkedHashMap<>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.put(abcArray[i], 0);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        //напишите тут ваш код
        for (Map.Entry<Character, Integer> abcItem : alphabet.entrySet())
        {
            for (String s : list)
            {
                int index = -1;
                while ((index = s.indexOf(abcItem.getKey(), ++index)) != -1)
                {
                    abcItem.setValue(abcItem.getValue() + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> abcItem : alphabet.entrySet())
        {
            System.out.println(String.format("%c %d", abcItem.getKey(), abcItem.getValue()));
        }
    }

}
