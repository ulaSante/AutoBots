package com.autobots.java.mobileBankingApplication;

public class DepositAccount extends BankAccount {
    public DepositAccount(double balance, Currency currency, Client owner) {
        super(balance, currency, owner);
    }


    @Override
    public void deposit(double amount) {
        balance += amount;
        addTransaction("DEPOSIT", amount);
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            addTransaction("WITHDRAW", amount);
            return true;
        } else {
            throw new IllegalArgumentException("Insufficient funds to withdraw the amount from the account.");
        }
    }
}
