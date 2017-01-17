package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(in.readLine());
        int n2 = Integer.parseInt(in.readLine());
        int n3 = Integer.parseInt(in.readLine());

        int npos = 0, nneg = 0;

        if (n1 > 0)
            npos++;
        else if (n1 < 0)
            nneg++;
        if (n2 > 0)
            npos++;
        else if (n2 < 0)
            nneg++;
        if (n3 > 0)
            npos++;
        else if (n3 < 0)
            nneg++;

        System.out.printf("количество отрицательных чисел: %d\nколичество положительных чисел: %d\n", nneg, npos);
    }
}
