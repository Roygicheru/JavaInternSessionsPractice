package io.github.roygicheru.OOPAndOthers.Static;

public class StaticExample {
    // 'static' means this variable belongs to the class, not a specific object.
    // There is only ONE copy of 'radius' shared by everyone.
    public static double radius = 7;

    // 'static' means you can call this function without creating a 'new StaticKeyword()'
    public static double calculateArea() {
        // It can access 'radius' directly because both are static
        double area = Math.PI * radius * radius;
        return area;
    }
}
