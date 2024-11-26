import java.util.Objects;
import java.util.Scanner;

public class StringIsPalindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();
         boolean isPalindrome = isPalindrome(input);
        System.out.println("Entered string is palindrome:" + isPalindrome);
    }
    public static boolean isPalindrome (String input){
        if (Objects.equals(input, reverse(input))) {
            System.out.println("Entered string IS a palindrome");
            return true;
        } else {
            System.out.println("Entered string is NOT a palindrome");
            return false;
        }
    }
    public static String reverse (String input){
        return new StringBuilder(input).reverse().toString();
    }
}