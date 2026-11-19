import java.util.Scanner;

public class Q7LargestSmallestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int arr [] =  new int[5];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr[3] = 44;
        arr[4] = 55;

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);

        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i])
                smallest = arr[i];
            if (largest < arr[i])
                largest = arr[i];
        }

        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);

    }
}