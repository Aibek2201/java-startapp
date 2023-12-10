package com.homework.banksystem.entity;

public class Person {

    private String name;

    private String phoneNumber;

    private String surname;

    public Person(String name, String phoneNumber, String surname) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
