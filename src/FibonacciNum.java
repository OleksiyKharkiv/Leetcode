import java.util.Scanner;

public class FibonacciNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("Enter the integer number N: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                System.out.println("You entered: " + n);
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer number");
                scanner.next();
            }
        }
        System.out.println("Fibonacci number for " + n + " is: " + fibonacciNum(n));
    }

    public static int fibonacciNum(int n) {
        int f = 0;
        if (n == 0 || n == 1 || n == -1) {
            f = n;
        }
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                f = fibonacciNum(i - 1) + fibonacciNum(i - 2);
            }
        }
        if (n < -1) {
            for (int i = -2; i >= n; i--) {
                f = fibonacciNum(i + 2) - fibonacciNum(i + 1);
            }
        }
        return f;
    }
}
