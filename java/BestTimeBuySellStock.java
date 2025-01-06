public class BestTimeBuySellStock {
    public int maxProfit(int[] prices) {
        int buy = 0, sell = buy+1, profit = 0;
        while(sell < prices.length){
            if (prices[buy]>prices[sell]){
                buy=sell;
                sell=buy+1;
            }else{
                profit = Math.max(profit, prices[sell]-prices[buy]);
                sell++;
            }
        }
        return profit;
    }
}
