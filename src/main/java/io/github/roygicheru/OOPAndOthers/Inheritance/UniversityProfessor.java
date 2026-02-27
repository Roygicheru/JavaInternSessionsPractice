package io.github.roygicheru.OOPAndOthers.Inheritance;

public class UniversityProfessor extends UniversityPerson {
    private String department;
    private final String salary;

    public UniversityProfessor(String name, String id, String email, String department, String salary) {
        super(name, id, email);
        this.department = department;
        this.salary = salary;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Department : " + department + " || Salary : " + salary);
    }

    public void departmentHead(){
        System.out.println(name + " is the professor in charge of the " + department + " Department.");
    }
}
