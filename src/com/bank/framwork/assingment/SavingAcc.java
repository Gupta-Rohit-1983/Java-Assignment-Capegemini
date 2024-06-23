package com.bank.framwork.assingment;

public abstract class SavingAcc extends BankAcc{

    private boolean isSalaried;
    private static final float MINBAL = 500;

    public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal);
        this.isSalaried = isSalaried;
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() - amount >= MINBAL) {
            super.deposite(-amount);
        } else {
            System.out.println("Insufficient balance. Minimum balance must be maintained.");
        }
    }

    @Override
    public String toString() {
        return "SavingAcc [isSalaried=" + isSalaried + ", toString()=" + super.toString() + "]";
    }
}
