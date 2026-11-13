import java.util.Scanner;

    public class PalindromeOptimized {

        static boolean isPalindrome(int num) {

            // Negative numbers are not palindrome
            // Numbers ending in zero are not palindrome (except 0)
            if (num < 0 || (num % 10 == 0 && num != 0)) {
                return false;
            }

            int reverse = 0;

            while (num > reverse) {
                reverse = reverse * 10 + num % 10;
                num /= 10;
            }

            return num == reverse || num == reverse / 10;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if (isPalindrome(num)) {
                System.out.println("Palindrome Number");
            } else {
                System.out.println("Not a Palindrome Number");
            }

            sc.close();
        }
    }