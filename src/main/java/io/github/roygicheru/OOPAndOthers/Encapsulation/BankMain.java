package io.github.roygicheru.OOPAndOthers.Encapsulation;

public class BankMain {
    public static void main(String[] args) {
        Bank bankAccount = new Bank("102033","John", 30000);
        bankAccount.deposit(20000);
        bankAccount.withdraw(10000);
        bankAccount.displayBalance();

    }
}
