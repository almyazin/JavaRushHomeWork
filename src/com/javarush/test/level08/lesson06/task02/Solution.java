package com.javarush.test.level08.lesson06.task02;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Провести 10 тысяч вставок, удалений
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Date begin, end;

        // ArrayList
        ArrayList arrayList = new ArrayList();
        begin = new Date();
        insert10000(arrayList);
        end = new Date();
        System.out.println("Length of insert arrayList: " + (end.getTime() - begin.getTime()));
        begin = new Date();
        get10000(arrayList);
        end = new Date();
        System.out.println("Length of get arrayList: " + (end.getTime() - begin.getTime()));
        begin = new Date();
        set10000(arrayList);
        end = new Date();
        System.out.println("Length of set arrayList: " + (end.getTime() - begin.getTime()));
        begin = new Date();
        remove10000(arrayList);
        end = new Date();
        System.out.println("Length of remove arrayList: " + (end.getTime() - begin.getTime()));

        // LinkedList
        LinkedList linkedList = new LinkedList();
        begin = new Date();
        insert10000(linkedList);
        end = new Date();
        System.out.println("Length of insert linkedList: " + (end.getTime() - begin.getTime()));
        begin = new Date();
        get10000(linkedList);
        end = new Date();
        System.out.println("Length of get linkedList: " + (end.getTime() - begin.getTime()));
        begin = new Date();
        set10000(linkedList);
        end = new Date();
        System.out.println("Length of set linkedList: " + (end.getTime() - begin.getTime()));
        begin = new Date();
        remove10000(linkedList);
        end = new Date();
        System.out.println("Length of remove linkedList: " + (end.getTime() - begin.getTime()));
    }

    public static void insert10000(List list)
    {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++)
            list.add(0, new Object());
    }

    public static void get10000(List list)
    {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++)
        {
            list.get(i);
        }

    }

    public static void set10000(List list)
    {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++)
        {
            list.set(i, new Object());
        }
    }

    public static void remove10000(List list)
    {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++)
        {
            list.remove(0);
        }
    }
}
