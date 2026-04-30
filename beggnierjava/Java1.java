package beggnierjava;

public class Java1 {
    public static void main(String[] args) {

        int x = 6;

        // if-else
        if (x > 5) {
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }

        // ternary operator
        int res = (x % 2 == 0) ? 10 : 20;
        System.out.println(res);

        int n = 3;

        // modern switch (Java 14+)
        switch (n) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid.");
        }
    }
}
