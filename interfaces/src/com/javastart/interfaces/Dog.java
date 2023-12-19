package com.javastart.interfaces;

public class Dog implements Animal{
    private String name;

    private int age;

    public String getAnimalType() {
        return "Dog";
    }

    @Override
    public void say() {
        System.out.println("Woof");
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
