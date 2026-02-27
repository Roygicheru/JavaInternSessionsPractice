package io.github.roygicheru.OOPAndOthers.Optionals;

import java.util.Optional;

public class AdvancedOptional {

    public static void processCorporateEmail(Optional<String> emailBox) {
        emailBox
                .filter(email -> email.endsWith("@google.com"))
                .map(String::toUpperCase)
                .ifPresentOrElse(
                        validEmail -> System.out.println("Access Granted for: " + validEmail),
                        () -> System.out.println("No valid email address found")
                );
    }

    public static void main(String[] args) {

        System.out.println("--- Advanced Optional Tricks ---");

        Optional<String> user1 = Optional.of("roy@google.com");
        Optional<String> user2 = Optional.of("hacker@gmail.com");
        Optional<String> user3 = Optional.empty();

        System.out.println("\n--- Testing Java 9 ifPresentOrElse ---");

        user1.ifPresentOrElse(
                email -> System.out.println("Email found: " + email),
                () -> System.out.println("No email found")
        );

        user2.ifPresentOrElse(
                email -> System.out.println("Email found: " + email),
                () -> System.out.println("No email found")
        );

        user3.ifPresentOrElse(
                email -> System.out.println("Email found: " + email),
                () -> System.out.println("No email found")
        );

        System.out.println("\n--- Testing Map & Filter ---");

        processCorporateEmail(user1);
        processCorporateEmail(user2);
        processCorporateEmail(user3);

    }
}
