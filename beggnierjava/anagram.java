package beggnierjava;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Convert strings to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are Not Anagram");
        }

        sc.close();
    }
}