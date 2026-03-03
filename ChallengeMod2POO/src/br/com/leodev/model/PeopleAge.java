package br.com.leodev.model;

public class PeopleAge {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void isAdult() {
        if (this.age >= 18) {
            System.out.println(this.name + " is adult.");
        } else {
            System.out.println(this.name + " is not adult.");
        }
    }
}
