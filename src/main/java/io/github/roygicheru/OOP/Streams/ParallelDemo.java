package io.github.roygicheru.OOP.Streams;

import java.util.List;

public class ParallelDemo {
    public static void main(String[] args) {
        List<String> tasks = List.of("Task 1",  "Task 2", "Task 3",  "Task 4", "Task 5", "Task 6");

        System.out.println("--- Normal Stream (One Worker) ---");
        tasks.stream().forEach(task -> {
            String workerName = Thread.currentThread().getName();
            System.out.println(task + " done by: " + workerName);
        });

        System.out.println("--- Parallel Stream (Team of Workers) ---");
        tasks.parallelStream().forEach(task -> {
            String workerName = Thread.currentThread().getName();
            System.out.println(task + " done by: " + workerName);
        });
    }
}
