package com.sai.app.oops;

public class BankAccount {

    private double balance = 1000;

    // Getter method
    public double getBalance() {
        return balance;
    }

    // Setter method with validation
    public void setBalance(double amount) {
        if (amount >= 0) {
            balance = amount;
        } else {
            System.out.println("Invalid balance!");
        }
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        System.out.println("Initial Balance: "
                           + account.getBalance());

        account.setBalance(5000);

        System.out.println("Updated Balance: "
                           + account.getBalance());

        account.setBalance(-2000);
    }
}
