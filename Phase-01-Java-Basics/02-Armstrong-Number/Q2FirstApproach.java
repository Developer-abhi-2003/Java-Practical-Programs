import java.util.Scanner;

public class Q2FirstApproach {

    static void arms(int num){
        int temp = num, count = 0, d = 1;
        double total = 0;

        while (temp > 0){
            count++;
            temp /= 10;
            d *= 10;
        }

        d /= 10;

        for (int i= 0; i < count; i++) {
            double digit = (num/d) % 10;
            d/=10;
            digit = Math.pow(digit, count);
            total += digit;
        }
        if (total == num)
            System.out.println("Number is Armstrong" + num);
    }

    public static void main(String[] args) {

        int number;
        System.out.println("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if (number < 0)
            return;

        arms(number);


    }
}