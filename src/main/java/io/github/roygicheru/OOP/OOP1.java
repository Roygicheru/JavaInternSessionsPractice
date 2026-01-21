package io.github.roygicheru.OOP;

public class OOP1 {
    public int age;
    public String name;


    public void practiceTask(){
        OOP1 prac = new OOP1();
        OOP1 prac2 = new OOP1();

        prac.age = 21;
        prac.name = "John";
        prac2.age = 18;
        prac2.name = prac.name;
        IO.println("Hello. "+prac2.name+"'s age 3 years ago was " + prac2.age + ", and now he's " + prac.age + " years old.");
    }
}
