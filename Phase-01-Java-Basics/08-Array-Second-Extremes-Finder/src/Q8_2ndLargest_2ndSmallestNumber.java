public class Q8_2ndLargest_2ndSmallestNumber {
    public static void main(String[] args) {

        int arr[] = {55, 4, 77, 2, 8, 0, 33, 52, 1, 7, 8, 69, 28, 47, 28, 80, -96, -32, -99,453, 654, 87, 765, 86, 788, 777, -101};

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondSmallest = 0, secondLargest = 0;

        for (int i = 0; i< arr.length; i++){
            if (smallest > arr[i]) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            if (largest < arr[i]){
                secondLargest = largest;
                largest = arr[i];
            }
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > smallest && arr[j] < secondSmallest){
                    secondSmallest = arr[j];
                }
                if (arr[j] < largest && arr[j] > secondLargest) {
                    secondLargest = arr[j];
                }
            }
        }

        System.out.println("Second Largest Number = " + secondLargest);
        System.out.println("Second Smallest Number = " + secondSmallest);


    }
}