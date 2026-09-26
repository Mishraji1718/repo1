class Solution {
    public int maxProfit(int[] prices) {
        // int profit = 0;
        // int l = 0;
        // int r = prices.length-1;
        // while(l<r){
        //     int d = r-l;
        //     if(d>profit){
        //         profit = d;
        //     }
        //     r--;
        // }
        // return profit;
        int buy = Integer.MAX_VALUE;
        int p  = 0;
        for(int price : prices){
            if(price < buy){
                buy = price;
            }
            p = Math.max(p,price-buy);
        }
        return p;
    }
}