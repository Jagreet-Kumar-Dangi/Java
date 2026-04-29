package beggnierjava;
import java.util.Scanner;

class palindrome{

    public boolean isPalindrome(int x) {

        // Negative numbers and numbers ending with 0 (except 0) are not palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int rev = 0;

        // Reverse only half of the number
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        return x == rev || x == rev / 10;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

       palindrome obj = new palindrome();
        boolean result = obj.isPalindrome(num);

        if (result) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not Palindrome.");
        }

        sc.close();
    }
}
