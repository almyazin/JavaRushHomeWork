package com.javarush.test.level00.lesson02.task01;

import java.util.*;

/* Быть программистом - круто!
Напиши программу, которая выводит на экран надпись: «Я думаю, быть программистом - это круто».
Пример вывода на экран:
Я думаю, быть программистом - это круто
*/
public class Solution
{
    public static void main(String[] args) {
        Collection<Integer> l = new ArrayList<Integer>();
        Set<Integer> s = new HashSet<>();

        //for (int i=0; i < 10; ++i) {
            l.add(new Integer(4));
            l.add(new Integer(5));
            l.add(new Integer(6));
        //}

        s.add(1);
        s.add(2);
        s.add(3);

        Iterator<Integer> iter = s.iterator();
        while (iter.hasNext())
        {

        }

        System.out.println(s);
    }
}
