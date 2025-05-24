package leetcode;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {

        int[] prices = {10, 1, 5, 6, 7, 1};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
//        int max  = 0;
//        int i =0;
//        int r =1;
//
//        while (r<prices.length){
//            if(prices[i]<prices[r]){
//                int  profit = prices[r]-prices[i];
//                max = Math.max(max,profit);
//            }else {
//                i=r;
//            }
//            r++;
//        }
//
//        return max;


        int maxP = 0;
        int minBuy = prices[0];

        for (int sell : prices) {
            maxP = Math.max(maxP, sell - minBuy);
            minBuy = Math.min(minBuy, sell);
        }
        return maxP;
    }
}


