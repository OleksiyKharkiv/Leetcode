public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length < 1){
            return 0;
        }
        int profit = 0;
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1 ; i < prices.length; i++){
            profit = prices[i] - minPrice;
            if (profit > maxProfit){
                maxProfit = profit;
            }
            if (prices[i] < minPrice){
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }
}