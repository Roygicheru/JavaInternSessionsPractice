package io.github.roygicheru.OOPAndOthers.PolyAndAbstraction;

public abstract class GameCharacter {
//    public void welcome() {
//        System.out.println("Welcome to the game!\n");
//    }

    public static final int MAX_LEVEL = 99;
    public static final String GAME_NAME = "FANTASY SCAPE";

    public abstract void attack();

    public class BackPack{
        private final String[] items = {"Potion", "Map", "Sword"};

        public void checkItems(){
            System.out.println("======= BACK PACK =======");
            for(String item : items){
                System.out.println("- " + item);
            }
        }
    }
}
