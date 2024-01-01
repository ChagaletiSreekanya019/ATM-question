package org.atmproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TransactionManager {
    private Account account;
    private Authentication auth;

    public TransactionManager(Account account, Authentication auth) {
        this.account = account;
        this.auth = auth;
    }

    public void performTransaction(String choice, double amount) {
        if (choice.equals("CheckBalance")) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.checkBalance());
        } else {
            System.out.println("Enter account number:");
            long accNumber = new java.util.Scanner(System.in).nextLong();
            System.out.println("Enter pin:");
            int pin = new java.util.Scanner(System.in).nextInt();
            if (auth.isValidPin(accNumber, pin)) {
                if (choice.equals("WithDraw")) {
                    account.withdraw(amount);
                } else if (choice.equals("Deposit")) {
                    account.deposit(amount);
                }
            } else {
                System.out.println("Invalid account number or pin.");
            }
        }
    }
}
