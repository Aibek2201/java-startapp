package com.javastart.interfaces;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------");

        Animal manu = new Cat();
        Animal ponchik = new Dog();

        manu.say();
        ponchik.say();
    }
}