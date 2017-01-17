package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //напишите тут ваш код
    public enum Sex {MALE, FEMALE}

    String name;
    int age;
    Sex sex;

    public Friend(String name)
    {
        this.name = name;
    }

    public Friend(String name, int age, Sex sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Friend(String name, int age)
    {

        this.name = name;
        this.age = age;
    }
}