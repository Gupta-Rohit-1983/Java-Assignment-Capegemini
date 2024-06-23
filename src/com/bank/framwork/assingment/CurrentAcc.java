package com.bank.framwork.assingment;

public abstract class CurrentAcc extends BankAcc{

    private final float creditLimit;

    public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() + creditLimit >= amount) {
            super.deposite(-amount);
        } else {
            System.out.println("Withdrawal amount exceeds credit limit.");
        }
    }

    @Override
    public String toString() {
        return "CurrentAcc [creditLimit=" + creditLimit + ", toString()=" + super.toString() + "]";
    }

}
