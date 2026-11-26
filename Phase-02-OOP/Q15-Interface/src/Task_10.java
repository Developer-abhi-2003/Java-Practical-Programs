import java.util.function.Consumer;
import java.util.function.Function;

public class Task_10 {
    static class Number{
        static int cube(int n){return n*n*n;}
    }

    static class Printer{
        void printMessage(String message){
            System.out.println("Hii Abhishek, let's start "+message);
        }
    }

     static class Employee{
        String name;

        Employee(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Function<Integer, Integer> f = Number::cube;
        System.out.println("Cube of 4 = " + f.apply(4));

        Printer p = new Printer();
        Consumer<String> c = p::printMessage;
        c.accept("Learning of Java Method Reference");

        Function<String, Employee> empName = Employee::new;
        Employee e = empName.apply("Abhishek");
        System.out.println("Employee Name = " + e.name);
    }
}
