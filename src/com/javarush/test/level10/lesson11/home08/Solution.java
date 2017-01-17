package com.javarush.test.level10.lesson11.home08;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String>[] arr = new ArrayList[3];
        ArrayList list1 = new ArrayList<String>();
        list1.add("qwe");
        list1.add("asd");
        list1.add("rty");
        ArrayList list2 = new ArrayList<String>();
        list2.add("qaz");
        list2.add("wsx");
        list2.add("rty");
        ArrayList list3 = new ArrayList<String>();
        list3.add("qaz");
        list3.add("wsx");
        list3.add("rty");

        arr[0] = list1;
        arr[1] = list2;
        arr[2] = list3;

        return arr;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}