package com.javastart.interfaces;

public class Cat implements Animal{

    private String name;

    private int age;

    public void say() {
        System.out.println("Meow");
    }

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
}
