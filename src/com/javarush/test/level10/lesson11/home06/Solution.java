package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        public String name;
        public String sex;
        public String race;
        public int age;
        public int height;
        public int weight;

        public Human(String name, String sex, String race, int age, int height, int weight)
        {
            this.name = name;
            this.sex = sex;
            this.race = race;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, String sex, String race, int age, int height)
        {
            this.name = name;
            this.sex = sex;
            this.race = race;
            this.age = age;
            this.height = height;
            weight = 70;
        }

        public Human(String name, String sex, String race, int age)
        {
            this.name = name;
            this.sex = sex;
            this.race = race;
            this.age = age;
            height = 85;
            weight = 70;
        }

        public Human(String name, String sex, String race)
        {
            this.name = name;
            this.sex = sex;
            this.race = race;
            age = 30;
            height = 85;
            weight = 70;
        }

        public Human(String name, String sex)
        {
            this.name = name;
            this.sex = sex;
            race = "Mongoloid";
            age = 30;
            height = 85;
            weight = 70;
        }

        public Human(String name)
        {
            this.name = name;
            sex = "Male";
            race = "Mongoloid";
            age = 30;
            height = 85;
            weight = 70;
        }

        public Human()
        {
            name = "Uvasia";
            sex = "Male";
            race = "Mongoloid";
            age = 30;
            height = 85;
            weight = 70;
        }

        public Human(String name, int age)
        {
            this.name = name;
            this.age = age;
            sex = "Male";
            race = "Mongoloid";
            height = 85;
            weight = 70;
        }

        public Human(String name, int age, int height)
        {
            this.name = name;
            this.age = age;
            this.height = height;
            sex = "Male";
            race = "Mongoloid";
            weight = 70;
        }

        public Human(String name, int age, int height, int weight)
        {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
            sex = "Male";
            race = "Mongoloid";
        }
    }
}
