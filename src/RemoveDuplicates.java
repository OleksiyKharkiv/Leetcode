import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer numbers of array members:");
        int n = scanner.nextInt();
        System.out.println("You entered number: " + n);
        int[] arr = new int[n];
        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + "member of array :");
            arr[i] = scanner.nextInt();
            if (!seen.add(arr[i])){
                duplicates.add(arr[i]);
            }
        }
        System.out.println("Duplicate elements: " + duplicates);
    }
}