public class KthCharacter {
    public char kthCharacter(int k) {
        int depth = 0;
        while ((1 << depth) < k) {
            depth++;
        }
//        komment
        return dfs( k, depth, 'a');
    }

    private char dfs(int k, int depth, char start) {
        int halfLen = (1 << depth) / 2;
        if (depth == 0) return start;
        if (k < halfLen) {
            return dfs(k, depth - 1, start);
        } else {
            char nextChar = (char) (start + 1);
            return dfs(k - halfLen, depth - 1, nextChar);
        }
    }
}