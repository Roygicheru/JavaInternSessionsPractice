package io.github.roygicheru.OOPAndOthers.Inheritance;

public class UniversitySystemMain {
    public static void main(String[] args) {
        UniversityPerson universityPerson = new UniversityPerson("1a2a3a", "Kamande" , "kamande@gmail.com");
        UniversityStudent universityStudent = new UniversityStudent("1b2b3b", "Steve", "stevey@gmail.com", "Software Engineering", 3.5);
        UniversityProfessor universityProfessor = new UniversityProfessor("1b2b3b", "Jude", "jude@gmail.com", "Sciences", "200,000 Kshs.");
        UniversityStaff universityStaff = new UniversityStaff("1b2b3b", "Angel", "angel@gmail.com", "Lecturer", 40);

        System.out.println("\n ======== UNIVERSITY PERSON DETAILS ========");
        universityPerson.displayInfo();
        System.out.println("\n ======== UNIVERSITY STUDENT DETAILS =======");
        universityStudent.displayInfo();
        universityStudent.Study();
        System.out.println("\n ======== UNIVERSITY PROFESSOR DETAILS =======");
        universityProfessor.displayInfo();
        universityProfessor.departmentHead();
        System.out.println("\n ======== UNIVERSITY STAFF DETAILS =======");
        universityStaff.displayInfo();
        universityStaff.staffRole();
    }
}
