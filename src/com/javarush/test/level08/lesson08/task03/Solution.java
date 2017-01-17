package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("qwe", "dfg");
        map.put("qwe", "bgfgfh");
        map.put("zxc", "bvnvbn");
        map.put("wer", "ctyr");
        map.put("sdf", "nj");
        map.put("xcv", "hgjty");
        map.put("ert", "nmjlk");
        map.put("dfg", "ytuynvn");
        map.put("cvb", "fuytu");
        map.put("rty", "gtyuii");
        return (HashMap<String, String>) map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int count = 0;
        for (String fn : map.values())
            if (fn.equalsIgnoreCase(name))
                count++;
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int count = 0;
        for (String ln : map.keySet())
            if (ln.equalsIgnoreCase(lastName))
                count++;
        return count;
    }

    public static void main(String[] args)
    {
        Map<String, String> map = createMap();
        System.out.println(map.size());
    }
}
