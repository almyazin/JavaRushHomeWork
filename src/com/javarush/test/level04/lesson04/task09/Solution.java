package com.javarush.test.level04.lesson04.task09;

/* Светофор
Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение трех минут горит зеленый сигнал,
затем в течение одной минуты — желтый, а потом в течение одной минуты — красный, затем опять зеленый горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зеленый" - если горит зеленый цвет, "желтый" - если горит желтый цвет, "красный" - если горит красный цвет.
Пример для числа 2.5:
зеленый
Пример для числа 3:
желтый
Пример для числа 4:
красный
Пример для числа 5:
зеленый
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(in.readLine());

        int it = (int) t;
        int lb = 0, rb = 0;

        while (rb <= 60)
        {
            lb = rb;
            rb = lb + 3;
            if ((t >= lb) && (t < rb))
            {
                System.out.println("зеленый");
                break;
            }
            lb = rb;
            rb += 1;
            if ((t >= lb) && (t < rb))
            {
                System.out.println("желтый");
                break;
            }
            lb = rb;
            rb += 1;
            if ((t >= lb) && (t < rb))
            {
                System.out.println("красный");
                break;
            }
        }
    }
}