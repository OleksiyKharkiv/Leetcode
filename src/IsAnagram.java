import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string 1:");
        String str1 = scanner.nextLine();
        str1= str1.replaceAll("\\s", "");
        System.out.println("Enter string 2:");
        String str2 = scanner.nextLine();
        str2 = str2.replaceAll("\\s", "");
        if (isAnagram(str1, str2)){
            System.out.println("The strings are anagrams");
        }else {
            System.out.println("The strings are NOT anagrams");
        }
    }
    public static boolean isAnagram (String str1, String str2){
        if (str1.length() != str2.length()) {
            return false;
        }
        return getLettersStat(str1).equals(getLettersStat(str2));
    }
    private static Map<Character, Integer> getLettersStat(String str) {
        HashMap<Character, Integer> stat = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            stat.put(c, stat.getOrDefault(c, 0) + 1);
        }
        return stat;
    }
}