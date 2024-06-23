package com.bank.framwork.assingment;

public class Main {

    public static void main(String[] args) {
        BankFactory factory = new MMBankFactory();

        SavingAcc savingAcc = factory.getNewSavingAccount(101, "John Doe", 1000, true);
        CurrentAcc currentAcc = factory.getNewCurrentAccount(102, "Jane Doe", 5000, 2000);

        System.out.println(savingAcc);
        System.out.println(currentAcc);

        savingAcc.withdraw(200);
        currentAcc.withdraw(6000);

        System.out.println(savingAcc);
        System.out.println(currentAcc);
    }
}
