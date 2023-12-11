package com.homework.banksystem;

import com.homework.banksystem.entity.Account;
import com.homework.banksystem.entity.Bill;
import com.homework.banksystem.entity.Person;
import com.homework.banksystem.service.DepositService;
import com.homework.banksystem.service.PaymentService;
import com.homework.banksystem.service.TransferService;

public class Main {
    public static void main(String[] args) {

        Person loriPerson = new Person("Lori", "+77015689546", "Jon");
        Bill loriBill = new Bill(10000);
        Account loriAccount = new Account(loriPerson, loriBill);

        Person martinPerson = new Person("Martin", "+77472659584", "Doe");
        Bill martinBill = new Bill(8000);
        Account martinAccount = new Account(martinPerson, martinBill);

        PaymentService paymentService = new PaymentService();
        paymentService.pay(loriAccount, 1000);
        paymentService.pay(martinAccount, 1500);

        DepositService depositService = new DepositService();
        depositService.deposit(loriAccount, 3000);
        depositService.deposit(martinAccount, 5000);
        System.out.println("\n");
        TransferService transferService = new TransferService();
        transferService.transfer(loriAccount, martinAccount, 15000);
    }
}