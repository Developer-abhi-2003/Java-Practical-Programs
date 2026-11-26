@FunctionalInterface
interface Calculator{
    int calculate(int a, int b);
}
public class Task_8 {
    public static void main(String[] args) {
        Calculator c = (a, b) -> a+b;
        System.out.println("Addition = "+ c.calculate(10, 20));
        Calculator d = (a, b) -> a-b;
        System.out.println("Subtraction = "+ d.calculate(10, 20));
        }
    }

