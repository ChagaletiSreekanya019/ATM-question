package org.atmproject;

public class Account {
    private String userName;
    private long accountNumber;
    private long adharNum;
    private double balance;

    public Account(String userName, long accountNumber, long adharNum, double balance) {
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.adharNum = adharNum;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (getBalance() > amount) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    public double checkBalance() {
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

}
