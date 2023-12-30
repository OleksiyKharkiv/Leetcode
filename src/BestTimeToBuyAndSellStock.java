public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (prices.length < 2){
            return maxProfit;
        }
        if (prices.length == 2 && prices[1] > prices[0]){
            maxProfit = prices[1] - prices[0];
            return maxProfit;
        }
        if (prices.length == 2 && prices[1] <= prices[0]){
            maxProfit = 0;
            return maxProfit;
        }
        else {
            for (int i = 0 ; i < prices.length - 1; i++){
                for (int j = i+1; j < prices.length; j++ ){
                    if ((prices[j] - prices[i]) > maxProfit){
                        maxProfit = prices[j] - prices[i];
                    }
                }
            }
            return maxProfit;
        }
    }
}