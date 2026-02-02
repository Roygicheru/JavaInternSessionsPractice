package io.github.roygicheru.OOP.Generics;

public class Box<T> {
    private T item;

    public void add(T item){
        this.item = item;
    }

    public T get(){ return this.item;}
}
