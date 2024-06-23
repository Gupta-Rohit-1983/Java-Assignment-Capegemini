package com.bank.framwork.assingment;

public class MMCurrentAcc extends CurrentAcc {

    public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal, creditLimit);
    }

    @Override
    public void withdraw(float amount) {
        super.withdraw(amount);
    }

    @Override
    public String toString() {
        return "MMCurrentAcc [toString()=" + super.toString() + "]";
    }

}
