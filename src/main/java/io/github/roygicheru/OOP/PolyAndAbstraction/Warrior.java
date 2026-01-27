package io.github.roygicheru.OOP.PolyAndAbstraction;

public class Warrior extends GameCharacter implements Healable {
    @Override
    public void attack(){
        System.out.println("\nMax level: " + MAX_LEVEL);
        System.out.println("\nWarrior swings a giant sword!");
    }
    @Override
    public void heal(){
        System.out.println("Warrior applies a bandage.\n");
    }
}

