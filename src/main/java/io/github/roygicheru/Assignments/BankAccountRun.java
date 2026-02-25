package io.github.roygicheru.Assignments;

public class BankAccountRun {
    public static void main(String[] args) {
        BankAccount_RoyGicheru bankAccount = new BankAccount_RoyGicheru("a1b2c3", "Roy Gicheru", 2000.0);

        System.out.println("\nBank Account Details:");
        bankAccount.deposit(300.0);
        bankAccount.withdraw(100.0);
        System.out.println(bankAccount.getBalance());

    }
}
