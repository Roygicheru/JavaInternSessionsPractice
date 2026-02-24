package io.github.roygicheru.OOP.Streams;

import java.util.List;

public class StreamOptional {
    public static void main(String[] args) {
        List<Integer> grades = List.of(85, 92, 78, 100, 45);

        List<Integer> emptyGrades = List.of();

        int highestGrade = grades.stream()
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println("Highest grade in normal class: " + highestGrade);

        int highestEmpty = emptyGrades.stream()
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println("Highest grade in empty class: " + highestEmpty);
    }
}
