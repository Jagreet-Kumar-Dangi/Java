package beggnierjava;

import java.util.Scanner;

public class perfectnum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        System.out.println("Enter a number:");
        n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            System.out.println("Perfect Number.");
        } else {
            System.out.println("Not a Perfect Number.");
        }

        sc.close();
    }
}