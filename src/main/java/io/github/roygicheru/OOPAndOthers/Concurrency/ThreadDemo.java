package io.github.roygicheru.OOPAndOthers.Concurrency;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Main program started...");

        // Task 1: A worker that counts to 5
        Runnable workerA = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Worker A is on step: " + i);
                try {
                    // Pause for half a second to simulate hard work
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Task 2: Another worker that counts to 5
        Runnable workerB = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("--- Worker B is on step: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Hire the workers (Create the Threads)
        Thread thread1 = new Thread(workerA);
        Thread thread2 = new Thread(workerB);

        // Tell them to start working AT THE SAME TIME!
        // (Notice we use .start(), NOT .run())
        thread1.start();
        thread2.start();

        System.out.println("Main program finished the setup!");
    }
}
