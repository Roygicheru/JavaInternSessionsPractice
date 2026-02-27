package io.github.roygicheru.OOPAndOthers.Generics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class GuestList {
    public static void main(String[] args) {
        Set<String> unordered = new HashSet<>();
        Set<String> ordered = new LinkedHashSet<>();
        Set<String> sorted = new TreeSet<>();

        unordered.add("Zebra");
        unordered.add("Apple");
        unordered.add("Mango");
        unordered.add("Apple");

        ordered.add("Zebra");
        ordered.add("Apple");
        ordered.add("Mango");
        ordered.add("Apple");

        sorted.add("Zebra");
        sorted.add("Apple");
        sorted.add("Mango");
        sorted.add("Apple");

        System.out.println("Unordered list:");
        System.out.println(unordered);
        System.out.println(unordered.size() + "\n");
        System.out.println("Ordered list:");
        System.out.println(ordered);
        System.out.println(ordered.size() + "\n");
        System.out.println("Sorted list:");
        System.out.println(sorted);
        System.out.println(sorted.size() + "\n");
    }
}
