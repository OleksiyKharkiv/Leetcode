public class FibonacciNumber {
    public int fib(int n) {
        if (n == 1 || n == -1 || n == 0) return n;
        if (n > 0) return fib(n - 1) + fib(n - 2);
        return fib(n + 1) - fib(n + 2);
    }
}