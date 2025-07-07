import java.util.HashSet;
import java.util.Set;

public class Unique3DigitEvenNumbers {
    public int totalNumbers (int[]digits){
        Set<Integer> result = new HashSet<>();
        boolean[]used = new boolean[digits.length];
        dfs(0, 0, digits, used, result);
        return result.size();
    }
    private void dfs(int depth, int currNum, int[]digits, boolean[]used, Set<Integer> result){
        if (depth == 3){
            if (currNum % 2 == 0){
                result.add(currNum);
            }
            return;
        }
        for (int i = 0; i < digits.length; i++) {
            if (used[i]) continue;
            if (depth == 0 && digits[i] == 0) continue;
            used[i] = true;
            dfs(depth + 1, currNum * 10 + digits[i], digits, used, result);
            used[i] = false;
        }
    }
}