package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);

        //напишите тут ваш код
        Cat tomCat = new Cat("Tom", "Gray", 2);
        Dog dogSpike = new Dog("Spike", 4, 40);
        Dog dogTyle = new Dog("Tyke", 0, 3);
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //добавьте тут ваши классы
    public static class Cat
    {
        String name;
        String color;
        int age;

        public Cat(String name, String color, int age)
        {
            this.name = name;
            this.color = color;
            this.age = age;
        }
    }

    public static class Dog
    {
        String name;
        int age;
        int agression_level;

        public Dog(String name, int age, int agression_level)
        {
            this.name = name;
            this.age = age;
            this.agression_level = agression_level;
        }
    }
}
