package com.autobots.java.mobileBankingApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class BankAccount {

    private final UUID accountNumber = UUID.randomUUID();
    protected double balance;
    private Currency currency;
    private Client owner;
    private List<Transaction> transactions = new ArrayList<>();

    public BankAccount(double balance, Currency currency, Client owner) {
        this.balance = balance;
        this.currency = currency;
        this.owner = owner;
    }


    public abstract void deposit(double amount);
    public abstract boolean withdraw(double amount);

    // Сохранение транзакции
    void addTransaction(String type, double amount) {
        transactions.add(new Transaction(type, amount));
    }

    public UUID getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Client getOwner() {
        return owner;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
