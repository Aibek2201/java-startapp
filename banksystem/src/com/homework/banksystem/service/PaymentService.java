package com.homework.banksystem.service;

import com.homework.banksystem.entity.Account;
import com.homework.banksystem.entity.Bill;

public class PaymentService {

    public void pay(Account account, int amount){
        Bill bill = account.getBill();
        if (bill.getAmount() < amount){
            System.out.println("Платеж невозможен, недостаточно средств");
        } else {
            int currentBillAmount = bill.getAmount();
            System.out.println("Платеж обрабатывается, текущее состояние счета: " + currentBillAmount  + " для клиента " + account.getAccountHolder().getName());
            bill.setAmount(currentBillAmount - amount);
            System.out.println("Платеж выполнен, новое состояние счета: " + bill.getAmount());
        }
    }
}
