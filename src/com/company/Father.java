package com.company;

// Создать иерархию из 3х классов (2й уровень иерархии)

public class Father extends Grandfather {
    private String profession;

    public Father(String name, int age, Residence residence, NickNames nickNames, String profession) {
        super(name, age, residence, nickNames);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    // Task e: Добавить перегруженные методы (2-3 шт.) в класс 2-го уровня иерархии

    void makeMoney(String currency, int amount) {
        System.out.println(currency + ": " + amount);
    }

    //Task e: один из них сделать неперезаписываемым

    final void makeMoney(String currency) {
        System.out.println(currency);
    }

    public String getInfo() {
        return "Name: " + getName() +
                "\nAge: " + getAge() +
                "\nPlace of residence: " + getResidence().getAddress() +
                "\nNickname: " + getNickNames();

    }
}
