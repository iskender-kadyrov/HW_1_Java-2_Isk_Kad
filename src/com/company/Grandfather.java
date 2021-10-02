package com.company;

// Создать иерархию из 3х классов (1й уровень иерархии)

public class Grandfather {
    private String name;
    private int age;
    private Residence residence;
    private NickNames nickNames;

    public Grandfather(String name, int age, Residence residence, NickNames nickNames) {
        this.name = name;
        this.age = age;
        this.residence = residence;
        this.nickNames = nickNames;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Residence getResidence() {
        return residence;
    }

    public NickNames getNickNames() {
        return nickNames;
    }

    public String getInfo(){
        return "Name: " + name +
                "\nAge: " + age +
                "\nPlace of residence: " + residence.getAddress() +
                "\nNickname: " + nickNames;

    }
}
