package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human grandPa = new Human("Дедушка Свин", true, 57, null, null);
        Human grandMa = new Human("Бабушка Свинья", false, 55, null, null);
        Human grandPaMa = new Human("Дед", true, 60, null, null);
        Human grandMaMa = new Human("Ба", false, 59, null, null);
        Human pa = new Human("Папа Свин", true, 37, grandPa, grandMa);
        Human ma = new Human("Мама Свинка", false, 35, grandPaMa, grandMaMa);
        Human peppa = new Human("Свинка Пеппа", false, 5, pa, ma);
        Human gorge = new Human("Свинка Пеппа", false, 3, pa, ma);
        Human na = new Human("unborn", true, 0, pa, ma);
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
        public Human father;
        public Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            if (father != null)
                this.father = father;
            if (mother != null)
                this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
