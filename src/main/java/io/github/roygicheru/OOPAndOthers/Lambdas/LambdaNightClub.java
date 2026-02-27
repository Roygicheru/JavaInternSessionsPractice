package io.github.roygicheru.OOPAndOthers.Lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaNightClub {
    public static void main(String[] args) {
        System.out.println("--- Welcome to the Lambda Club! ---");

        // 1. PREDICATE (The Bouncer)
        // Rule: You must be 18 or older
        Predicate<Integer> isAdult = age -> age >= 18;

        int guestAge = 20;
        System.out.println("Guest is 20. Allowed in? " + isAdult.test(guestAge));

        // 2. CONSUMER (The Bartender)
        // Rule: Take the order, print it, return nothing.
        Consumer<String> serveDrink = drink -> System.out.println("Serving one " + drink + ".");

        serveDrink.accept("Mojito");

        // 3. SUPPLIER (The DJ)
        // Rule: Takes no input, just drops a random beat (number)
        Supplier<Double> randomBeat = () -> Math.random() * 100;

        System.out.println("DJ drops beat track #: " + randomBeat.get());

        // 4. FUNCTION (The Coat Check)
        // Rule: Take a String (coat brand), return an Integer (ticket number based on length)
        Function<String, Integer> coatToTicket = coat -> coat.length() * 10;

        System.out.println("Checked a 'Gucci' coat. Ticket #: " + coatToTicket.apply("Gucci"));

    }
}
