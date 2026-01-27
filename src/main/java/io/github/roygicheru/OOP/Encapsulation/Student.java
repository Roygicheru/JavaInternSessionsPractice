package io.github.roygicheru.OOP.Encapsulation;

public class Student {
    private String studentId;
    private String name;
    private int age;
    private double gpa;

    public Student(String studentId, String name, int age, double gpa) {
        setStudentId(studentId);
        setName(name);
        setAge(age);
        setGpa(gpa);
    }

    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }

    public void setStudentId(String studentId) {
        if (studentId != null && studentId.length() == 6 && studentId.matches("a1b2c3")) {
            this.studentId = studentId;
        } else {
            System.out.println("Student ID must be exactly 6 alphanumeric characters!");
        }
    }

    public void setName(String name) {
        if (name != null && name.trim().length() > 2) {
            this.name = name;
        } else {
            System.out.println("Student name must contain at least 2 letters and not be empty!");
        }
    }

    public void setAge(int age) {
        if (age >= 16 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Student age must be between 16 and 100!");
        }
    }

    public void setGpa(double gpa) {
        if (gpa > 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Student gpa  must be between 0.0 and 4.0!");
        }
    }

    public void displayInfo(){
        System.out.println("Student ID: " + getStudentId());
        System.out.println("Student Name: " + getName());
        System.out.println("Student Age: " + getAge());
        System.out.println("Student GPA: " + getGpa());
    }

}
