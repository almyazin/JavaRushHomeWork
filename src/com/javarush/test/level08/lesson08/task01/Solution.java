package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //напишите тут ваш код
        Set<String> set = new HashSet<>();
        set.add("Лфыв");
        set.add("Лфывфыв");
        set.add("Лфывцйу");
        set.add("Лфывыавв");
        set.add("Лфывукец");
        set.add("Лфывпр");
        set.add("Лфыве");
        set.add("Лфывдп");
        set.add("Лфывук");
        set.add("Лфывтп");
        set.add("Лфывив");
        set.add("Лфывукеа");
        set.add("Лфывд");
        set.add("Лфывывацео");
        set.add("Лфыввапеооот");
        set.add("Лфывукекекеке");
        set.add("Лфыввапвапапвпва");
        set.add("Лфыввапвпвапвапвапвап");
        set.add("Лфыввапппвапвпукеукеукеук");
        set.add("Лфывфывфывфывфывфывфывфывфывфы");

        return (HashSet<String>) set;
    }
}
