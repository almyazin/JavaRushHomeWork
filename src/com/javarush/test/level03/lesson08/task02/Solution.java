package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //System.out.print("Enter name: ");
        String name = in.readLine();
        //System.out.print("Enter payment value: ");
        String sPay = in.readLine();
        int nPay = Integer.parseInt(sPay);
        //System.out.print("Enter age: ");
        String sAge = in.readLine();
        int nAge = Integer.parseInt(sAge);
        System.out.printf("%s получает %d через %d лет.", name, nPay, nAge);
    }
}