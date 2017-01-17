package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        //напишите тут ваш код
        int[] nums;
        int n = 0;

        do
        {
            System.out.print("Enter an integer number > 0: ");
            try
            {
                n = Integer.parseInt(reader.readLine());
            }
            catch (NumberFormatException e)
            {
                System.out.println("Entered value is not an integer number");
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        while (n <= 0);

        nums = new int[n];
        boolean isCorrect = false;

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++)
        {
            isCorrect = false;
            while (!isCorrect)
            {
                try
                {
                    nums[i] = Integer.parseInt(reader.readLine());
                    isCorrect = true;
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Entered value is not a number");
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            if (i == 0)
                maximum = nums[i];
            else if (nums[i] > maximum)
                maximum = nums[i];
        }

        /*n = Integer.parseInt(reader.readLine());
        nums = new int[n];
        for (int i = 0; i < n; i++)
        {
            nums[i] = Integer.parseInt(reader.readLine());
            if (i == 0)
                maximum = nums[i];
            else if (nums[i] > maximum)
                maximum = nums[i];
        }*/

        System.out.println(maximum);
    }
}
