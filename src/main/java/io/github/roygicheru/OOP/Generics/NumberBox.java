package io.github.roygicheru.OOP.Generics;

public class NumberBox <T extends Number> {
    private final T num;

    public NumberBox(T num){
        this.num = num;
    }

    public void printDouble(){
        System.out.println("Value as Double: " + num.doubleValue());
    }

}
