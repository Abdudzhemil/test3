package com.company;

public class MainAnimal {
    public static void main(String[] args) {
        Animal an = new Animal();
        an.eat();
        an.sleep();
        Dog dog = new Dog();
        dog.sleep();
        dog.bark();
    }
}
