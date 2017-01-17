package com.javarush.test.level07.lesson06.task01;

import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> lst = new ArrayList<>();
        lst.add("qwe");
        lst.add("asd");
        lst.add("zxc");
        lst.add("ert");
        lst.add("fgh");

        System.out.println(lst.size());
        for (int i = 0; i < lst.size(); i++)
        {
            System.out.println(lst.get(i));

        }
    }
}
