package io.github.roygicheru.OOP.Encapsulation;

public class Bank {
    private final String accountNumber;
    private final String accountHolder;
    private double balance;

    public Bank(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        if (initialBalance >= 0){
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Set to 0");
        }
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (this.balance >= amount) {
                this.balance -= amount;
                System.out.println("Withdrawn " + amount);
            } else {
                System.out.println("Insufficient funds! Balance is " + this.balance);
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("The balance of user "+ this.accountHolder + " of account number " + this.accountNumber +" is " + this.balance);
    }

}
