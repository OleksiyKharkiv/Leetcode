import java.util.Scanner;

public class FibonacciNumIter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("Please enter the number:");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                System.out.println("Entered number is: " + n);
                break;
            }
            System.out.println("Invalid input. Please enter integer number.");
            sc.next();
        }
        System.out.println("The Fibonacci number is: " + fibonacciNumIter(n));
    }

    public static int fibonacciNumIter(int n) {
        if (n == 0 || Math.abs(n) == 1) {
            return n;
        }
        int f = 0;
        if (n > 1) {
            int prev1 = 0;
            int prev2 = 1;
            for (int i = 2; i <= n; i++) {
                f = prev1 + prev2;
                prev1 = prev2;
                prev2 = f;
            }
        }
        if (n< -1){
            int prev1 = 0;
            int prev2 = -1;
            for (int i = -2; i >= n; i--) {
                f = prev1 - prev2;
                prev1 = prev2;
                prev2 = f;
            }
        }
        return f;
    }
}
