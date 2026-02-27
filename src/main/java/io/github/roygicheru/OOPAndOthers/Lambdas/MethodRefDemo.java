package io.github.roygicheru.OOPAndOthers.Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefDemo {
    public static void main(String[] args) {
        System.out.println("--- Method Reference Shortcuts ---");

//        Function<Double, Double> absoluteLambda = n -> Math.abs(n);
        Function<Double, Double> absoluteRef = Math::abs;

        System.out.println("Absolute value of 50: " + absoluteRef.apply(-50.0));

        Consumer<String> printerRef = System.out::println;
        printerRef.accept("This was printed using a method reference!");

        Supplier<List<String>> listFactoryRef = ArrayList::new;

        List<String> newList = listFactoryRef.get();
        System.out.println("Created a new list: " + newList.getClass().getSimpleName());

    }
}
