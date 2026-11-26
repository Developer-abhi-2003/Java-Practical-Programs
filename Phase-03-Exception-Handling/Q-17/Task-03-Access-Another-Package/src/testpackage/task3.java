package testpackage;
import mypackage.Calculator;

public class task3 {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println("Multiplication: " + calc.multiply(20, 10));
        System.out.println("Division: " + calc.divide(20, 10));
    }
}
