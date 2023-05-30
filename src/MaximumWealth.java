public class MaximumWealth {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;

        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
                if (sum > wealth) {
                    wealth = sum;
                }
            }
        }
        return wealth;
    }
}