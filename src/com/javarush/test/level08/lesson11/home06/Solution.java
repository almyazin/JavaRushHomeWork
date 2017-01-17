package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human grandPa = new Human("Дедушка Свин", true, 57);
        Human grandMa = new Human("Бабушка Свинья", false, 55);
        Human grandPaMa = new Human("Дед", true, 60);
        Human grandMaMa = new Human("Ба", false, 59);
        Human pa = new Human("Папа Свин", true, 37);
        Human ma = new Human("Мама Свинка", false, 35);
        Human peppa = new Human("Свинка Пеппа", false, 5);
        Human gorge = new Human("Джордж", true, 3);
        Human na = new Human("unborn", true, 0);

        grandPa.children.add(pa);
        grandMa.children.add(pa);
        grandPaMa.children.add(ma);
        grandMaMa.children.add(ma);
        pa.children.add(peppa);
        pa.children.add(gorge);
        pa.children.add(na);
        ma.children.add(peppa);
        ma.children.add(gorge);
        ma.children.add(na);

        System.out.println(grandPa);
        System.out.println(grandMa);
        System.out.println(grandPaMa);
        System.out.println(grandMaMa);
        System.out.println(pa);
        System.out.println(ma);
        System.out.println(peppa);
        System.out.println(gorge);
        System.out.println(na);
    }

    public static class Human
    {
        //напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
