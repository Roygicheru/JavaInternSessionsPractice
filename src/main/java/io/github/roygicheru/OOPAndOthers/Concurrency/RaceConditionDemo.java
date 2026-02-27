package io.github.roygicheru.OOPAndOthers.Concurrency;

public class RaceConditionDemo {

    private static int balance = 0;

    public static synchronized void deposit() {
        balance++;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("--- The Secure Bank ---");

        // Worker A: Deposits $1 into the account, 10,000 times.
        Runnable workerA = () -> {
            for (int i = 0; i < 10000; i++) {
//                balance++;
                deposit();
            }
        };

        // Worker B: Deposits $1 into the account, 10,000 times.
        Runnable workerB = () -> {
            for (int i = 0; i < 10000; i++) {
//                balance++;
                deposit();
            }
        };

        Thread thread1 = new Thread(workerA);
        Thread thread2 = new Thread(workerB);

        thread1.start();
        thread2.start();

        // This tells the Main thread to pause and wait for A and B to finish
        thread1.join();
        thread2.join();

        // If two workers deposit $1 exactly 10,000 times each...
        // the balance SHOULD be 20,000.
        System.out.println("Final Bank Balance: $" + balance);
    }
}
