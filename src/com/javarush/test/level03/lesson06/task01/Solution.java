package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        String m = "Мама";
        String w = "Мыла";
        String f = "Раму";

        System.out.println(m + w + f);
        System.out.println(m + f + w);
        System.out.println(w + m + f);
        System.out.println(w + f + m);
        System.out.println(f + m + w);
        System.out.println(f + w + m);
    }
}