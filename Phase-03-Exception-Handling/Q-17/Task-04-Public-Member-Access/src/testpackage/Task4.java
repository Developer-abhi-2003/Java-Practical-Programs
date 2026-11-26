package testpackage;

import mypackage.Student;

public class Task4 {

    public static void main(String[] args){

        Student s = new Student();

        System.out.println("Accessing Public Variables: ");
        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " + s.rollNo);
        System.out.println("\nAccessing Public Method:");
        s.display();
    }
}
