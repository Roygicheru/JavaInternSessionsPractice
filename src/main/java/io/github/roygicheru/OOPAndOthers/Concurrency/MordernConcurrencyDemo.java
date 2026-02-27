package io.github.roygicheru.OOPAndOthers.Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class MordernConcurrencyDemo {

    private static AtomicInteger balance = new AtomicInteger(0);

    public static void main(String[] args) {
        System.out.println("--- The Modern Bank ---");

        // FEATURE 2: Creating a Thread Pool with exactly 2 workers
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit Task A to the pool
        executor.submit(() -> {
            for (int i = 0; i < 10000; i++) {
                balance.incrementAndGet(); // Safe, unbreakable math!
            }
        });

        // Submit Task B to the pool
        executor.submit(() -> {
            for (int i = 0; i < 10000; i++) {
                balance.incrementAndGet(); // Safe, unbreakable math!
            }
        });

        // Tell the manager we are done assigning tasks so it can close up shop
        executor.shutdown();

        // Wait silently until all tasks are finished
        while (!executor.isTerminated()) { }

        // Fetch the final number!
        System.out.println("Final Bank Balance: $" + balance.get());
    }
}
