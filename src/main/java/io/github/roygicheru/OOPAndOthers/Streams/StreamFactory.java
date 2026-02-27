package io.github.roygicheru.OOPAndOthers.Streams;

import java.util.List;

public class StreamFactory {
    public static void main(String[] args) {
        // 1. Raw Materials
        List<Integer> prices = List.of(20, 55, 10, 100, 45, 80);

        System.out.println("Raw Prices: " + prices);
//        System.out.println("--- Final Sorted Costs ---");

        int totalRevenue = prices.stream()
                .filter(price -> price > 50)
                .map(price -> price += 5)
                .reduce(0, (total, price) -> total += price);

        System.out.println("Total revenue: " + totalRevenue);
//                .sorted()
//                .forEach(price -> System.out.println(price));

        // 2. The Conveyor Belt (Stream)
//        List<Integer> finalCosts = prices.stream()
                // Robot 1: Kick off anything under $50
//                .filter(price -> price > 50)

                // Robot 2: Add $5 tax to whatever is left
//                .map(price -> price + 5)

//                .sorted()

                // Robot 3: Box it up into a new List
//                .collect(Collectors.toList());

        // 3. The Result
//        System.out.println("Final Costs: " + finalCosts);
    }
}
