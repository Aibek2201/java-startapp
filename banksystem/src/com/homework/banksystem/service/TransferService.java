package com.homework.banksystem.service;

import com.homework.banksystem.entity.Account;

public class TransferService {
    public void transfer(Account accountFrom, Account accountTo, int amount) {
        int billFromAmount = accountFrom.getBill().getAmount();
        int billToAmount = accountTo.getBill().getAmount();
        if (billFromAmount < amount) {
            System.out.println("Недостаточно средств на счету");
        } else {
            System.out.println("Происходит перевод с аккаунта " + accountFrom.getAccountHolder().getName() + " на аккаунт " +
                    accountTo.getAccountHolder().getName());
            accountFrom.getBill().setAmount(billFromAmount - amount);
            accountTo.getBill().setAmount(billToAmount + amount);
            System.out.println("Перевод успешно выполнен!");
        }

    }
}
