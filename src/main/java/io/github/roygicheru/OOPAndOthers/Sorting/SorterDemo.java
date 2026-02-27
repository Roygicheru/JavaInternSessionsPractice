package io.github.roygicheru.OOPAndOthers.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SorterDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 22, 3.2));
        students.add(new Student("Alice", 20, 3.8));
        students.add(new Student("Bob", 21, 3.5));
        students.add(new Student("David", 20, 3.9));

        System.out.println("--- Original Order ---");
        students.forEach(System.out::println);

        Comparator<Student> byName = Comparator.comparing(Student::getName);
        Collections.sort(students, byName);

        System.out.println("\n--- Sorted by Name ---");
        students.forEach(System.out::println);

        Comparator<Student> byAgeThenGpa = Comparator
                .comparing(Student::getAge)
                .thenComparing(Student::getGpa);

        Collections.sort(students, byAgeThenGpa);

        System.out.println("\n--- Sorted by Age, then GPA ---");
        students.forEach(System.out::println);

        Comparator<Student> highestGpaFirst = Comparator
                .comparing(Student::getGpa)
                .reversed();

        Collections.sort(students, highestGpaFirst);

        System.out.println("\n--- Leaderboard: Highest GPA First ---");
        students.forEach(System.out::println);

    }
}
