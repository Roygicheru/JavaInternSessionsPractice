package io.github.roygicheru.OOP.PolyAndAbstraction;

public class PolyAndAbsMain {
    public static void main(String[] args) {
//        Polymorphism polymorphism = new Polymorphism();

//        int result1 = polymorphism.add(7, 5);
//        int result2 = polymorphism.add(new int[]{3, 4, 5, 6, 7});

//        System.out.println("The sum is: " + result1);
//        System.out.println("The sum of the array is: " + result2);

//        GameCharacter character = new GameCharacter();
//        Warrior warrior = new Warrior();
//        Mage mage = new Mage();
//
//        System.out.println("\n============ GAME CHARACTER ============");
//        character.attack();
//        System.out.println("\n============ WARRIOR ============");
//        warrior.attack();
//        System.out.println("\n============ MAGE ============");
//        mage.attack();

        GameCharacter[] party = new GameCharacter[3];

        party[0] = new Mage();
        party[1] = new Warrior();
        party[2] = new Healer();

        System.out.println("======= BATTLE START =======");

        for (GameCharacter character : party) {
            // Everyone can attack, because it's in the Parent Class
            character.attack();

            // CHECK: Does this object have the "Healable" skill?
            if (character instanceof Healable) {
                // If yes, "cast" (convert) the variable to view it as a Healer
                ((Healable) character).heal();
            }
        }

        // 1. You need a Character first (Outer Object)
        // (We use Warrior since GameCharacter is abstract)
        GameCharacter myHero = new Warrior();

        // 2. Create the Backpack linked to THAT specific hero
        // Notice the syntax: myHero.new Backpack()
        GameCharacter.BackPack myPack = myHero.new BackPack();

        // 3. Use the backpack
        myPack.checkItems();

    }
}
