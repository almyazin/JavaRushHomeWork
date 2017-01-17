package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("qwe", new Date("4 JULY 1980"));
        map.put("asd", new Date("22 JUNE 2014"));
        map.put("zxc", new Date("23 JANUARY 2006"));
        map.put("wer", new Date("29 JANUARY 1963"));
        map.put("sdf", new Date("12 MARCH 1981"));
        map.put("xcv", new Date("13 MAY 2015"));
        map.put("ert", new Date("29 FEBRUARY 2016"));
        map.put("dfg", new Date("1 SEPTEMBER 1970"));
        map.put("cvb", new Date("1 APRIL 2000"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        for (Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator(); iterator.hasNext();)
        {
            Map.Entry<String, Date> entry = iterator.next();
            if (entry.getValue().getMonth() >= 5 && entry.getValue().getMonth() <= 7)
                iterator.remove();
        }
    }

    public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        for (Map.Entry<String, Date> entry : map.entrySet())
        {
            System.out.println(entry);
        }
    }
}
