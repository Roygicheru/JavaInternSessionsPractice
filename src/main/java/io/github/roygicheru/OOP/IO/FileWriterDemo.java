package io.github.roygicheru.OOP.IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("test_document.txt");

//        String content = "This is the modern way to write files in Java 17.";
        String content = "\n" + "New Log Entry at: " + System.currentTimeMillis() + "\n";

        // StandardOpenOption.CREATE means "Create if missing"
        // StandardOpenOption.APPEND means "Add to end"
//        Files.writeString(filePath, content);
        Files.writeString(filePath, content,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);

        System.out.println("Appended to: " + filePath.toAbsolutePath());

        String readBack = Files.readString(filePath);
        System.out.println("\n--- File Content ---");
        System.out.println(readBack);
    }
}
