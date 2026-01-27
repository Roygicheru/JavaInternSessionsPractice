package io.github.roygicheru.OOP.Inheritance;

public class UniversityPerson {
    protected String id;
    protected String name;
    protected String email;

    public UniversityPerson(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void displayInfo(){
        System.out.println("\nID: " + id + " || Name: " + name + " || Email: " + email);
    }

}
