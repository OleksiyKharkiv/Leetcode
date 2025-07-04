public class UglyNumber {
    class Solution {
        public boolean isUgly(int n) {
            if (n == 0) return false;
            if (n > 0 && n <= 4) {
                return true;
            }
            for (int p : new int[] { 2, 3, 5 }) {
                while (n % p == 0) {
                    n /= p;
                }

            }
            return n == 1;
        }
    }
}
