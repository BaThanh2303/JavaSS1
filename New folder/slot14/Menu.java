package slot14;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<Student> students = new ArrayList<Student>();
    Scanner scanner = new Scanner(System.in);
    public void addStudent(){
        System.out.println("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Student Birth: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Enter Student Address: ");
        String address = scanner.nextLine();
        System.out.println("Enter Student GPA: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();
        Student newStudent = new Student(id,name, dateOfBirth, address, gpa);
        students.add(newStudent);

    }
    public void editStudent(){
        System.out.println("Enter Student ID to edit: ");
        String
    }
}
