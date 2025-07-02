package com.autobots.java.mobileBankingApplication;

import java.time.LocalDateTime;

public class Transaction {
    private String type;
    private double amount;
    private LocalDateTime timesTamp;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.timesTamp = LocalDateTime.now();
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimesTamp() {
        return timesTamp;
    }
}
