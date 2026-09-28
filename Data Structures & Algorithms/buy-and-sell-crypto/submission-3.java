class Solution {
    public int maxProfit(int[] prices) {
       //iterate with min val as 0
       //start with 1st index
       //-if that val is < min, then that becomes min
       //else { calculate profit with curr value}
        // calculating maxProfit


        int maxProfit = 0;
        int minBuy = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < minBuy){
                minBuy = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i]-minBuy);
            }
        }
        return maxProfit;

    }
}
