import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter tne number you are looking for: ");
        int f = scanner.nextInt();
        System.out.print("Enter tne number of arrays elements: ");
        int n = scanner.nextInt();
        int res = indexOf(n,f);
        if (res != -1) {
            System.out.println("The index of your number in array is : " + res);
        }
        else System.out.println("Your number not presented in this array. Sorry.");
    }

    public static int indexOf(int n, int f) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            while (true) {
                System.out.print("Enter the " + (i + 1) + "-th integer number of array: ");
                if (scanner.hasNextInt()) {
                    arr[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter integer number");
                    scanner.next();
                }
            }
        }
        int left = 0;
        int right = n - 1;
        if (f > arr[right]) {
            return -1;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (f == arr[mid]) {
                return mid;
            } else {
                if (f > arr[mid]) {
                    left = mid + 1;
                }
                if (f < arr[mid]) {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
