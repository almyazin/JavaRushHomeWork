package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("qwe", "dfg");
        map.put("qwee", "bgfgfh");
        map.put("zxc", "bvnvbn");
        map.put("wer", "qwe");
        map.put("sdf", "qwe");
        map.put("xcv", "hgjty");
        map.put("ert", "nmjlk");
        map.put("dfg", "qwe");
        map.put("cvb", "fuytu");
        map.put("rty", "gtyuii");
        return (HashMap<String, String>) map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<>(map);
        for (Iterator<String> names = copy.values().iterator(); names.hasNext();)
        {
            String name = names.next();
            int sameNamesCout = 0;
            for (String n : map.values())
                if (name.equals(n))
                    sameNamesCout++;
            if (sameNamesCout > 1)
                removeItemFromMapByValue(map, name);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String, String> entry : map.entrySet())
        {
            System.out.println(entry);
        }
    }
}
