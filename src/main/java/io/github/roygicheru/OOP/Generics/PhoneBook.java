package io.github.roygicheru.OOP.Generics;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, Integer> phoneBook = new HashMap<>();

        phoneBook.put("Alice", 12345);
        phoneBook.put("Bob", 98765);
        phoneBook.put("Stevey", 67890);
        phoneBook.put("LilJames", 22113);

//        System.out.println(phoneBook.get("Alice"));
//        System.out.println(phoneBook);

        for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
            String name  = entry.getKey();
            Integer number = entry.getValue();
            System.out.println("Name: " + name + " | Number: " + number);
        }
    }
}
