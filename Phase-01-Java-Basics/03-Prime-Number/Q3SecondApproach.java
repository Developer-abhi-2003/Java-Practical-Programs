import java.util.Scanner;

public class Q3SecondApproach {

    static boolean isPrime(int number){
        for (int i = 3; i < number; i++){
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void main (String[] args){
        System.out.println("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 2) {
            System.out.println("A Prime Number");
            return;
        }
        else if (num % 2 == 0 || num <= 1){
            System.out.println("A non - Prime Number");
            return;
        }

        System.out.println((isPrime(num)) ? "A Prime Number" :"A non - Prime Number");

    }
}
