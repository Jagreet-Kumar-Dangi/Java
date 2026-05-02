package dsaarray;

import java.util.Scanner;

public class ArrayLargestNum {

    public static int largestNumber(int[] num) {
        if (num.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int largest = num[0];
        for (int n : num) {
            if (n > largest) {
                largest = n;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Length of an Array: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Invalid array size.");
                return;
            }

            int[] arr = new int[n];

            System.out.println("Enter elements of array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int result = largestNumber(arr);
            System.out.println("Largest number in array is: " + result);
        }
    }
}