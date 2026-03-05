package br.com.leodev.model.bank_account;

import java.util.Scanner;

public class BankAccount {
    private String accName;
    private double balance;

    Scanner kb = new Scanner(System.in);

    public String getAccName() {
        return accName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit() {
        System.out.println("Which the value that you want deposit? ");
         double amount = kb.nextInt();
         balance += amount;

        System.out.println("The value $" + (balance) + " was deposited!");

    }

    public void withdraw() {
        System.out.println("Which the value that you want withdraw? ");
        double amount = kb.nextInt();
        if (amount > balance ) {
            System.out.println("Insuficient funds!");
        } else {
            balance -= amount;
            System.out.println("You retire $" + (balance) + " from your account!" );
        }

    }

    public void showBalance() {
        System.out.println("You have $" + balance);
    }



}
