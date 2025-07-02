package com.autobots.java.mobileBankingApplication;

public class BankService {

    public boolean transfer(BankAccount from, BankAccount to, double amount) {
        if (!from.withdraw(amount)) {
            throw new IllegalArgumentException("Insufficient funds for transfer.");
        }

        double convertedAmount = ExchangeRate.convert(amount, from.getCurrency(), to.getCurrency());
        to.deposit(convertedAmount);

        from.addTransaction("Transfer to " + to.getAccountNumber(), amount);
        to.addTransaction("Received from " + from.getAccountNumber(), amount);
        return true;
    }
}
