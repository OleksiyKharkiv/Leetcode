import java.util.*;

public class LetterCombination {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        char[] digitsArr = digits.toCharArray();
        boolean check = true;
        for (char ch : digitsArr) {
            if (ch < '2' || ch > '9') {
                check = false;
                break;
            }
        }
        if (!check) {
            System.out.println("String 'digits' is invalid");
        } else {
            Map<Character, String> map = new HashMap<>();
            map.put('2', "abc");
            map.put('3', "def");
            map.put('4', "ghi");
            map.put('5', "jkl");
            map.put('6', "mno");
            map.put('7', "pqrs");
            map.put('8', "tuv");
            map.put('9', "wxyz");

            Queue<String> queue = new LinkedList<>();
            queue.add("");
            for (char digit : digitsArr) {
                String letters = map.get(digit);
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    String combination = queue.poll();
                    for (char letter: letters.toCharArray()) {
                        queue.add(combination + letter);
                    }
                }
            }
            return new ArrayList<>(queue);
        }
        return new ArrayList<>();
    }
}