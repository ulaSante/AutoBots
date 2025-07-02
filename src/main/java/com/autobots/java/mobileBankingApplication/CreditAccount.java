package com.autobots.java.mobileBankingApplication;

public class CreditAccount extends BankAccount {
    public CreditAccount(double balance, Currency currency, Client owner) {
        super(balance, currency, owner);
    }

    private final double CREDIT_LIMIT = -1000;

    @Override
    public void deposit(double amount) {
        balance += amount;
        addTransaction("DEPOSIT", amount);
    }

    @Override
    public boolean withdraw(double amount) {
        if ((balance - amount) >= CREDIT_LIMIT)  {
            balance -= amount;
            addTransaction("WITHDRAW", amount);
            return true;
        } else {
            throw new IllegalArgumentException("You have exceeded your credit limit (maximum -1000)");
        }
    }

    public double getCREDIT_LIMIT() {
        return CREDIT_LIMIT;
    }
}
