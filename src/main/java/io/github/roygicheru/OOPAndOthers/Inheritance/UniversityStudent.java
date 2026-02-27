package io.github.roygicheru.OOPAndOthers.Inheritance;

public class UniversityStudent extends UniversityPerson {
    private String major;
    private double gpa;

    public UniversityStudent(String id, String name, String email,String major, double gpa){
        super(id, name, email);

        this.major = major;
        this.gpa = gpa;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Student Major: " + major + " || Student GPA: " + gpa);
    }

    public void Study(){
        System.out.println(name + " is studying " + major + ".");
    }
}
