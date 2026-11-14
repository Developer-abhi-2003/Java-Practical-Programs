import java.util.Scanner;

public class Q3FirstApproach {
    public static void main(String[] args) {
        System.out.printf("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 1){
            System.out.println("A non - Prime Number");
        } else if (num == 2 || num == 3 || num == 5 || num == 7 || num == 11) {
            System.out.println("A Prime Number");
        }
        else if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0 || num % 11 == 0){
            System.out.println("A non - Prime Number");
        }
        else
            System.out.println("A Prime Number");
    }
}




