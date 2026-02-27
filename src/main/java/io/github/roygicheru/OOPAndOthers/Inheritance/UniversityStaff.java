package io.github.roygicheru.OOPAndOthers.Inheritance;

public class UniversityStaff extends UniversityPerson {
    private String position;
    private int workHours;

    public UniversityStaff(String name, String id, String email, String position, int workHours) {
        super(name, id, email);
        this.position = position;
        this.workHours = workHours;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("The staff position " + position + " should entail working for " + workHours + " hours weekly.");
    }

    public void staffRole(){
        System.out.println(name + " is in the " + position + " Position.");
    }
}
