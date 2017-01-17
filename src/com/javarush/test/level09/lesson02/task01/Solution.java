package com.javarush.test.level09.lesson02.task01;

/* Каждый метод должен возвращать свой StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static StackTraceElement[] method1()
    {
        for (StackTraceElement e: method2())
            System.out.println(e.getMethodName() + ": " + (e.isNativeMethod() ? "native" : "not native"));
        System.out.println();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method2()
    {
        for (StackTraceElement e: method3())
            System.out.println(e.getMethodName() + ": " + (e.isNativeMethod() ? "native" : "not native"));
        System.out.println();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method3()
    {
        for (StackTraceElement e: method4())
            System.out.println(e.getMethodName() + ": " + (e.isNativeMethod() ? "native" : "not native"));
        System.out.println();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method4()
    {
        for (StackTraceElement e: method5())
            System.out.println(e.getMethodName() + ": " + (e.isNativeMethod() ? "native" : "not native"));
        System.out.println();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method5()
    {
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }
}
