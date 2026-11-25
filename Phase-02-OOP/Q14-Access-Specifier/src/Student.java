
public class Student {
    private int rollNo = 1629;
    int marks = 88;
    protected String name = "Abhishek Pandey";
    public String clg = "SCN CLG";

    static void display(){
        Student s = new Student();
        System.out.println("From Display function : ");
        System.out.println("Roll No = "+ s.rollNo);
        System.out.println("Marks = " + s.marks);
        System.out.println("Name = " + s.name);
        System.out.println("College = " + s.clg);
        System.out.println("-----------------------------");
    }
    public static void main(String[] args) {

        System.out.println("From Main : ");
        Student s = new Student();
        System.out.println("Roll No = " +s.rollNo);
        System.out.println("Marks = " + s.marks);
        System.out.println("Name = " + s.name);
        System.out.println("College = " + s.clg);
        System.out.println("-----------------------------");

        display();
    }
}