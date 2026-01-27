package io.github.roygicheru.OOP.PolyAndAbstraction;

public class Mage extends GameCharacter{
    @Override
    public void attack(){
        System.out.println(GAME_NAME);
        System.out.println("Max level: " + MAX_LEVEL);
        System.out.println("\nMage casts a fireball spell!");
    }
}

