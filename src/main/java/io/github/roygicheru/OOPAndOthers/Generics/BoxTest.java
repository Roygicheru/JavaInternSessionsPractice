package io.github.roygicheru.OOPAndOthers.Generics;

import java.util.ArrayList;
import java.util.List;

public class BoxTest {

    public static double sumList(List<? extends Number> list){
        double total = 0.0;
        for(Number n : list){
            total += n.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();

        intList.add(1000);
        intList.add(2000);
        intList.add(3000);
        intList.add(4000);
        double sum = sumList(intList);
        System.out.println(sum);

        doubleList.add(1200.5);
        doubleList.add(1300.5);
        doubleList.add(1400.5);
        doubleList.add(1500.5);
        double sum2 = sumList(doubleList);
        System.out.println(sum2);

    }
}
