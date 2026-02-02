package io.github.roygicheru.OOP.Generics;

public class BoxTest {
    public static void main(String[] args) {
//        Box<String> myBox = new Box<>();
//        myBox.add("Hello");
//        myBox.add("123"); // Gives compile time errors
//        System.out.println(myBox.get() + "\n");
//
//        Box<Integer> myBox2 = new Box<>();
//        myBox2.add(88);
//        System.out.println(myBox2.get() + "\n");
//
//        Pair<String, String> pair1 = new Pair<>();
//        pair1.add("John", "He is my brother");
//        System.out.println(pair1.getKey()+ ": " + pair1.getValue());
//
//        Pair<String, Integer> pair2 = new Pair<>();
//        pair2.add("Alice", 95);
//        System.out.println("Student: " + pair2.getKey()+ ", Grade: " + pair2.getValue());

        NumberBox<Double> numberBox = new NumberBox<>(18.22);
        numberBox.printDouble();

        NumberBox<Integer> numberBox2 = new NumberBox<>(44);
        numberBox2.printDouble();

//        NumberBox<String> numberBox3 = new NumberBox<>(44); // Outputs error, incompatible with number parent class
//        numberBox2.printDouble();
    }
}
