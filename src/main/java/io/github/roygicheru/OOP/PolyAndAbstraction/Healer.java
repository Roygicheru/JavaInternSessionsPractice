package io.github.roygicheru.OOP.PolyAndAbstraction;

public class Healer extends GameCharacter implements Healable{
    @Override
    public void attack(){
        System.out.println("Max level: " + MAX_LEVEL);
        System.out.println("\nHealer does nothing...they are peaceful :)");
    }
    @Override
    public void heal(){
        System.out.println("Healer heals self.\n");
    }
}
