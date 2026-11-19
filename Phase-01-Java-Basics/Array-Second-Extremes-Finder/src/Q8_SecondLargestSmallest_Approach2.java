import java.util.Scanner;

public class Q8_SecondLargestSmallest_Approach2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements (min 2 distinct) : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++){
            System.out.print("\nEnter the element for " + (i+1) + " = ");
            arr[i] = sc.nextInt();
        }

        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > largest) {secondLargest = largest; largest = arr[i];}
                else if (arr [i] > secondLargest && largest != arr[i])  secondLargest = arr[i];

            if (arr[i] < smallest) {secondSmallest = smallest; smallest = arr[i];}
                else if (arr[i] < secondSmallest && arr[i] != smallest) secondSmallest = arr[i];
        }

        if (n == 0)
            System.out.println("No Elements");
        else if (largest == smallest)
            System.out.println("Not Avilable");
        else{
            System.out.println("Second largest  : " + secondLargest);
            System.out.println("Second smallest : " + secondSmallest);
        }
    }
}
