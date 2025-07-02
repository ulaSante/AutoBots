package com.autobots.java.mobileBankingApplication;

public class BankProApp {
    public static void main(String[] args) {

        Client ulugbek = new Client("Ulugbek", "1111");
        BankAccount ulugbekDeposit =  new DepositAccount(0, Currency.KGS, ulugbek);
        BankAccount ulugbekCredit = new CreditAccount(1000, Currency.USD, ulugbek);
        BankService bankService = new BankService();
        bankService.transfer(ulugbekCredit, ulugbekDeposit, 100);

        System.out.println(ulugbekDeposit.getBalance());



        // проверка на кол-во чисел, должно быть 4
        System.out.println(ulugbek.authenticate("1111"));
    }
}
