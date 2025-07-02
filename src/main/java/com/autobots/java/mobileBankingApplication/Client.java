package com.autobots.java.mobileBankingApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Client {

    private String name;
    private final UUID clientId = UUID.randomUUID();
    private String pinCode;
    private List<BankAccount> listOfBankAccountNumbers;

    public Client(String name, String pinCode) {
        this.name = name;
        this.pinCode = pinCode;
    }

    // Проверка пинкода
    boolean authenticate(String inputPin) {
        return inputPin.matches("\\d{4}") && inputPin.equals(pinCode);
    }

    // Добавление аккаунта
    void addAccount(BankAccount account) {
        listOfBankAccountNumbers = new ArrayList<>();
        listOfBankAccountNumbers.add(account);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getClientId() {
        return clientId;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public List<BankAccount> getListOfBankAccountNumbers() {
        return listOfBankAccountNumbers;
    }

    public void setListOfBankAccountNumbers(List<BankAccount> listOfBankAccountNumbers) {
        this.listOfBankAccountNumbers = listOfBankAccountNumbers;
    }
}
