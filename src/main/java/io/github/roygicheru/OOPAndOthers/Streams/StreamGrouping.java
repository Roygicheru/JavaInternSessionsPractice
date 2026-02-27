package io.github.roygicheru.OOPAndOthers.Streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGrouping {
    public static void main(String[] args) {
        List<String> employees = List.of("Bob", "Alice", "Tom" , "Charlie", "Eve", "David");

        System.out.println("Raw employees list: " + employees);

        Map<Integer, List<String>> groupedByNameLength = employees.stream()
                .collect(Collectors.groupingBy(name -> name.length()));

        System.out.println("\n--- Employees Grouped By Name Length ---");

        for (Map.Entry<Integer, List<String>> entry : groupedByNameLength.entrySet()) {
            System.out.println(entry.getKey() + " letters: " + entry.getValue());
        }
    }
}
