package com.company;

public class Main {

    public static void main(String[] args) {

        // task g: В главном классе (Main) Создать объект класса 2-го уровня (objectA) также распечатать все свойства объектов
        Residence residence = new Residence("10 Downing street");
        Father peter = new Father("Peter", 42, residence, NickNames.LOSER, "Chemist");
        System.out.println(peter.getInfo());
        // вызвать перегруженные методы через каждый из экземпляров ваших объектов
        peter.makeMoney("USD", 30000);

        System.out.println("--------------------------------------------------");

        // и 2 объекта класса 3-го уровня (objectB, objectC)

        Son son1 = new Son("Stewie", 1, residence, NickNames.WINNER, "Unemployed");
        Son son2 = new Son("Chris", 14, residence, NickNames.FAILURE, "Unemployed", "School");
        System.out.println(son1.getInfo());
        // вызвать перегруженные методы через каждый из экземпляров ваших объектов
        son1.makeMoney("USD");

        System.out.println("--------------------------------------------------");

        System.out.println(son2.getInfo());
    }
}
