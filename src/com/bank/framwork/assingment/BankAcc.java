package com.bank.framwork.assingment;

public abstract class BankAcc {
    private int accNo;
    private String accNm;
    private float accBal;

    public BankAcc(int accNo, String accNm, float accBal) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.accBal = accBal;
    }

    public abstract void withdraw(float amount);

    public void deposite(float amount) {
        accBal += amount;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getAccNm() {
        return accNm;
    }

    public void setAccNm(String accNm) {
        this.accNm = accNm;
    }

    public float getAccBal() {
        return accBal;
    }

    @Override
    public String toString() {
        return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
    }
}
