package beggnierjava;

import java.util.Scanner;

public class solution {

    // Function to find single number
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;   // XOR operation
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        solution obj = new solution();
        int ans = obj.singleNumber(nums);

        System.out.println("Single number is: " + ans);

        sc.close();
    }
}