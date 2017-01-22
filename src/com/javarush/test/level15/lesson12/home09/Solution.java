package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

//import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    static class Pair<K, V>{
        private K key;
        private V value;

        public K getKey()
        {
            return key;
        }

        public V getValue()
        {
            return value;
        }

        public Pair(K key, V val)
        {
            this.key = key;
            this.value = val;
        }
    }
    public static void main(String[] args) {
        List<Pair<String, String>> paramsList = getParameters(readUrl());
        boolean objExists = false;
        String objVal = null;

        for (Pair<String, String> param : paramsList)
        {
            System.out.print(param.getKey() + " ");
            if ("obj".equals(param.getKey()))
            {
                objExists = true;
                objVal = param.getValue();
            }
        }

        if (objExists)
        {
            System.out.println();
            try
            {
                double val = Double.parseDouble(objVal);
                alert(val);
            }
            catch (NumberFormatException e)
            {
                alert(objVal);
            }
        }
    }

    private static String readUrl() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            return in.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return "";
        }
    }

    private static List<Pair<String, String>> getParameters(String url)
    {
        String urlParams = url.substring(url.indexOf('?') + 1);

        List<Pair<String, String>> paramsList = new ArrayList<>();

        for (String pair : urlParams.split("&"))
        {
            String[] arg = pair.split("=");
            paramsList.add(new Pair<String, String>(arg[0],
                    (arg.length > 1) ? join(arg, 1, arg.length - 1) : ""));
        }
        return paramsList;
    }

    private static String join(String[] arr, int from, int to)
    {
        if (from > to)
            throw new IllegalArgumentException();
        if (from < 0 || from > arr.length || to >= arr.length)
            throw new ArrayIndexOutOfBoundsException();

        StringBuilder sb = new StringBuilder();

        for (int i = from; i <= to; i++)
        {
            sb.append(arr[i]);
        }

        return sb.toString();
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
