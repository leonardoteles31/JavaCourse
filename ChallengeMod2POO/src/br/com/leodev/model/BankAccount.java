package br.com.leodev.model;

public class BankAccount {
    private String accNumber;
    private double balance;
    public String holderName;

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double  setBalance(double balance) {
        this.balance = balance;
        return balance;
    }

}
