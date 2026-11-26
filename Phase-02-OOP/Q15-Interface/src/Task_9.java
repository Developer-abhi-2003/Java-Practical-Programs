import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Task_9 {
    public static void main(String[] args) {

        Predicate<Integer> p = n ->  n%2 == 0;
        System.out.println("Is 5 even ? " + p.test(5));
        System.out.println("Is 8 even ? " + p.test(8));

        Function<Integer, Integer> f = n -> n*n;
        System.out.println("Square of 5 = " + f.apply(5));

        Consumer<String> c = name -> System.out.println("Welcome to Java, " + name+"!");
        c.accept("Abhishek");

        Supplier<Integer> s = () -> 100;
        System.out.println("Supplied Value = " + s.get());
    }
}
