package com.autobots.java.bankApplication;

public class BankDemo {
    public static void main(String[] args) throws Exception {

        MBank aliiaMbank = new MBank(123456789111L, 445566778);
        aliiaMbank.deposit(200000);

        OptimaBank ulugbekOptima = new OptimaBank(123456789222L, 554466778);
        Bank.transferFunds(aliiaMbank, ulugbekOptima, 500);
//        System.out.println(aliiaMbank.getBalance());
//        System.out.println(ulugbekOptima.getBalance());

        DemirBank zinaidaDemir = new DemirBank(123456789333L, 664466778);

//        Bank.transferFunds(zinaidaDemir, ulugbekOptima, 1000);

        System.out.println(zinaidaDemir.getBalance());

        BankBase.allBankRecords.stream().filter(n -> n.getBalance() > 100).forEach(System.out::println);

        double allSumOfBanks = BankBase.allBankRecords.stream().mapToDouble(Bank::getBalance).sum();
        System.out.println(allSumOfBanks);
    }
}
