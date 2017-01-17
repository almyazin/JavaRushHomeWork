package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<>();
        Random rnd = new Random();
        for (int i = 0; i < 20; i++)
            set.add(rnd.nextInt(100));
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
        for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();)
        {
            if (iterator.next() > 10)
                iterator.remove();
        }
        return set;
    }

    public static void main(String[] args)
    {
        HashSet<Integer> set = createSet();
        set = removeAllNumbersMoreThan10(set);
        for (int e : set)
        {
            System.out.println(e);
        }
    }
}
