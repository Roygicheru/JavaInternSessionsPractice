package io.github.roygicheru.OOPAndOthers.Static;

public class StaticMain {
    public static void main(String[] args) {
        // DIRECT ACCESS: Notice we use the class name "StaticKeyword"
        // We do NOT say: StaticKeyword sk = new StaticKeyword();

        // 1. Accessing the static variable
        System.out.println("Current Radius: " + StaticExample.radius);

        // 2. Calling the static method
        double area = StaticExample.calculateArea();
        System.out.println("The Area is: " + area);

        // 3. You can even change the static variable globally
        StaticExample.radius = 10;
        System.out.println("New Area with radius 10: " + StaticExample.calculateArea());
    }
}
