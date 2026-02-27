package io.github.roygicheru.OOPAndOthers.Optionals;

import java.util.Optional;

public class OptionalDemo {

    public static Optional<String> findUserByName(String name) {
        if (name.equals("Roy")) {
            // Box WITH a pizza inside
            return Optional.of("Roy Gicheru");
        } else {
            // An EMPTY box
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        System.out.println("--- The Safe Database ---");

        Optional<String> activeUser = findUserByName("Roy");

        Optional<String> missingUser = findUserByName("Ghost");

//        Optional<String> emptyUser = Optional.empty();

        String user1 = activeUser.orElse("Guest User");
        String user2 = missingUser.orElse("Guest User");
//        String user5 = emptyUser.orElseThrow(() -> new RuntimeException("NO USER FOUND!"));

        System.out.println("Result 1: " + user1);
        System.out.println("Result 2: " + user2);

        System.out.println("Result 3: ");
        activeUser.ifPresent(name -> System.out.println("Sending email to " + name));

        System.out.println("Result 4 (Should be blank): ");
        missingUser.ifPresent(name -> System.out.println("Sending email to " + name));

//        System.out.println("Result 5: ");
//        emptyUser.ifPresent(name -> System.out.println("Sending email to " + name));
    }
}
