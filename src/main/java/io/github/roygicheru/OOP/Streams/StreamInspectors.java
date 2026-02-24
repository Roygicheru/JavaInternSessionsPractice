package io.github.roygicheru.OOP.Streams;

import java.util.List;

public class StreamInspectors {
    public static void main(String[] args) {
        List<Integer> grades = List.of(85, 92, 78, 100, 65);

        System.out.println("Grades: " + grades);

        boolean hasPerfectScore = grades.stream()
                .anyMatch(grade -> grade == 100);

        boolean everyonePassed = grades.stream()
                .allMatch(grade -> grade > 50);

        System.out.println("Anyone got 100? " + hasPerfectScore);
        System.out.println("Did everyone pass? " + everyonePassed);

    }
}
