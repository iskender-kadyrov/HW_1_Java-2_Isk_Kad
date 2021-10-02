package com.company;

// Создать иерархию из 3х классов (3й уровень иерархии), последний 3й класс сделать ненаследуемым

public final class Son extends Father{
    private String study;

    public Son(String name, int age, Residence residence, NickNames nickNames, String profession, String study) {
        super(name, age, residence, nickNames, profession);
        this.study = study;
    }

    public Son(String name, int age, Residence residence, NickNames nickNames, String profession) {
        super(name, age, residence, nickNames, profession);
    }


    public String getStudy() {
        return study;
    }

    // Task f: В классе 3-го уровня перезаписать один из методов родителя

    @Override
    void makeMoney(String currency, int amount) {
        super.makeMoney(currency, amount);
    }


    public String getInfo(){
        if (study != null) {
            return "Name: " + getName() +
                    "\nAge: " + getAge() +
                    "\nPlace of residence: " + getResidence().getAddress() +
                    "\nNickname: " + getNickNames() +
                    "\nPlace of study: " + study;

        } else {
            return "Name: " + getName() +
                    "\nAge" + getAge() +
                    "\nPlace of residence: " + getResidence().getAddress() +
                    "\nNickname: " + getNickNames();
        }

    }
}
