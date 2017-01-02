package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

import java.util.Objects;

public class Solution {
    Solution() {}
    Solution(int x) {}
    Solution(String s) {}

    private Solution(double n) {}
    private Solution(char c) {}
    private Solution(byte b) {}

    protected Solution(boolean b) {}
    protected Solution(long l) {}
    protected Solution(float f) {}

    public Solution(Objects o) {}
    public Solution(Integer i) {}
    public Solution(Double d) {}
}

