import java.util.Scanner;

public class Q2ThridApproach {

    static Boolean isArmstrong(int n) {
        int digit = String.valueOf(n).length();
        int sum = 0, temp = n;

        while (temp > 0){
            sum += Math.pow((temp % 10), digit);
            temp /= 10;
        }
        return sum == n;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();

        System.out.println(num + (isArmstrong(num) ? " is an Armstrong number." : " is not an Armstrong number."));
        sc.close();

    }

}
