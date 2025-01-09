import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateParenthesis (res, "", 0, 0, n);
        return res;
    }
    private static void generateParenthesis (List<String> res, String curr, int open, int close, int n){
        if (curr.length() == 2*n){
            res.add(curr);
            return;
        }
        if (open < n){
            generateParenthesis(res, curr + "(", open + 1, close, n);
        }
        if (close < open) {
            generateParenthesis(res, curr + ")", open, close + 1, n);
        }
    }
}
