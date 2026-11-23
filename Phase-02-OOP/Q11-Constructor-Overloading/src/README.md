
public class Main {
    static class student {

        int age;
        String name, course;

        student(){
            this("Unknow", 0, "Not Assigned");
        }

        student(String name) {
            this("Abhishek", 0, "Not Assigned");
        }

        student(String name, int age){
            this(name, age, "Not Assigned");
        }

        student(String name, int age, String course){
            this.name = name;
            this.age = age;
            this.course = course;
        }
        void display(){
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Course : " + course);
            System.out.println("---------------------------");
        }
    }
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student("Abhi");
        student s3 = new student("Shek", 24);
        student s4 = new student("Abhishek Pandey", 24, "BCA");

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}