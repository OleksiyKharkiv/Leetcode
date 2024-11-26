import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string:");
        String input = scanner.nextLine();

        String reversed = reverse(input);
        System.out.println("Original string is: " + input);
        System.out.println("Reverse string is: " + reversed);
    }

    public static String reverse(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("String is empty");
            return input;
        }
        return new StringBuilder(input).reverse().toString();
    }
}
