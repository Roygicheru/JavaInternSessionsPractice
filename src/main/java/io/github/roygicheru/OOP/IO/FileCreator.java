package io.github.roygicheru.OOP.IO;

import java.io.File;
import java.io.IOException;

public class FileCreator {
    public static void main(String[] args) throws IOException {
        File myFile = new File("test_document.txt");

        System.out.println("Does file exist? " + myFile.exists());

        System.out.println("Creating file...");
        myFile.createNewFile();

        System.out.println("Does file exist now? " + myFile.exists());

        System.out.println("Saved at: " + myFile.getAbsolutePath());
    }
}
