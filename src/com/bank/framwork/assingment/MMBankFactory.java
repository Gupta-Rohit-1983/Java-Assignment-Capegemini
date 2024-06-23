package com.bank.framwork.assingment;

public class MMBankFactory extends BankFactory{

    @Override
    public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalaried) {
        return new MMSavingAcc(accNo, accNm, accBal, isSalaried);
    }

    @Override
    public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
        return new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
    }
}
