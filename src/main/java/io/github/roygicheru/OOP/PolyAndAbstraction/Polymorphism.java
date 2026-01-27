package io.github.roygicheru.OOP.PolyAndAbstraction;

public class Polymorphism {
    // Version 1: Two integers
    public int add(int a, int b) {
        System.out.println("Adding two integers");
        return a + b;
    }// Version 2: Three integers
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers");
        return a + b + c;
    }// Version 3: Two doubles
    public double add(double a, double b) {
        System.out.println("Adding two doubles");
        return a + b;
    }// Version 4: Array of integers
    public int add(int[] numbers){
        System.out.println("Adding array of integers...");
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
