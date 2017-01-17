package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "zerg1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "zerg2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "zerg3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "zerg4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "zerg5";
        Zerg zerg6 = new Zerg();
        zerg6.name = "zerg6";
        Zerg zerg7 = new Zerg();
        zerg7.name = "zerg7";
        Zerg zerg8 = new Zerg();
        zerg8.name = "zerg8";
        Zerg zerg9 = new Zerg();
        zerg9.name = "zerg9";
        Zerg zerg10 = new Zerg();
        zerg10.name = "zerg10";

        Protos prot1 = new Protos();
        Protos prot2 = new Protos();
        Protos prot3 = new Protos();
        Protos prot4 = new Protos();
        Protos prot5 = new Protos();
        prot1.name = "prot1";
        prot2.name = "prot2";
        prot3.name = "prot3";
        prot4.name = "prot4";
        prot5.name = "prot5";

        Terran ter1 = new Terran();
        Terran ter2 = new Terran();
        Terran ter3 = new Terran();
        Terran ter4 = new Terran();
        Terran ter5 = new Terran();
        Terran ter6 = new Terran();
        Terran ter7 = new Terran();
        Terran ter8 = new Terran();
        Terran ter9 = new Terran();
        Terran ter10 = new Terran();
        Terran ter11 = new Terran();
        Terran ter12 = new Terran();
        ter1.name = "ter1";
        ter2.name = "ter2";
        ter3.name = "ter3";
        ter4.name = "ter4";
        ter5.name = "ter5";
        ter6.name = "ter6";
        ter7.name = "ter7";
        ter8.name = "ter8";
        ter9.name = "ter9";
        ter10.name = "ter10";
        ter11.name = "ter11";
        ter12.name = "ter12";

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}