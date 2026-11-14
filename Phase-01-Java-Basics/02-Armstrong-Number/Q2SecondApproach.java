import java.util.Scanner;

public class Q2SecondApproach {

    static int armstrong(int Number, int count, int d) {

        if (d > Number)
            return 0;

        double digit = (Number / d) % 10;
        return (int) Math.pow(digit, count) + armstrong(Number, count, d*10);
    }

    public static void main(String[] args) {
        int number, total;

        System.out.println("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if (number < 0)
            return;


        int temp = number;
        int count =0;

        while (temp > 0){
            count++;
            temp /= 10;
        }

        total = armstrong(number, count, 1);

        if (total == number)
            System.out.println("The Number is Armstrong");
        else
            System.out.println("The Number is not Armstrong");
    }
}
