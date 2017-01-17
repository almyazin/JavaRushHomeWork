package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> multOf3 = new ArrayList<>();
        ArrayList<Integer> multOf2 = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++)
        {
            list.add(Integer.parseInt(in.readLine()));
        }

        boolean isMult;
        for (int e : list)
        {
            isMult = false;
            if (e % 2 == 0)
            {
                multOf2.add(e);
                isMult = true;
            }
            if (e % 3 == 0)
            {
                multOf3.add(e);
                isMult = true;
            }
            if (!isMult)
                other.add(e);
        }
        printList(multOf3);
        printList(multOf2);
        printList(other);
    }

    public static void printList(List<Integer> list)
    {
        //напишите тут ваш код
        for (int e : list)
        {
            System.out.println(e);
        }
    }
}
