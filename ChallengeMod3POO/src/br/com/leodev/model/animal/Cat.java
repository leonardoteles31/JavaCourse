package br.com.leodev.model.animal;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    public void arranharMoveis() {
        System.out.println("tsssss");
    }
}
