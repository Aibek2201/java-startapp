package com.homework.banksystem;

import com.homework.banksystem.entity.Account;
import com.homework.banksystem.entity.Bill;
import com.homework.banksystem.entity.Person;

public class Main {
    public static void main(String[] args) {

        Person loriPerson = new Person("Lori", "+77015689546", "Jon");
        Bill loriBill = new Bill(10000);
        Account loriAccount = new Account(loriPerson, loriBill);

        Person martinPerson = new Person("Martin", "+77472659584", "Doe");
        Bill martinBill = new Bill(8000);
        Account martinAccount = new Account(martinPerson, martinBill);

    }
}