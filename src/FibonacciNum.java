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
        if (n == 0 || n == 1 || n == -1) {
            return n;
        }
        if (n > 1) {
            return fibonacciNum(n - 1) + fibonacciNum(n - 2);
        }
        return (fibonacciNum(Math.abs(n) - 1) + fibonacciNum(Math.abs(n)-2))*(-1);
    }
}
