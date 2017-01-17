package com.javarush.test.level03.lesson04.task04;

/* Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10. Результат - 1 число.
Подсказка: будет три миллиона с хвостиком.
*/

public class Solution
{
    private static int factorial(int f, int x)
    {
        if (x != 0)
        {
            return factorial(f * x, --x);
        }
        return f;
    }

    private static int factorial(int num) {
        return (num == 0) ? 1 : num * factorial(num - 1);
    }

    public static void main(String[] args)
    {
        //напишите тут ваш код
        int f = 1;

        for(int i = 1; i <= 10; i++)
            f *= i;

        System.out.println(f);
        System.out.println(factorial(1, 10));
        System.out.println(factorial(10));
    }
}