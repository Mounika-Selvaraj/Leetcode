/*121. Best Time to Buy and Sell Stock*/



class Solution {
    public int maxProfit(int[] prices)
    {
        int min=prices[0];
        int p=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min){
                min=prices[i];
            }
            else{
                int profit=prices[i]-min;
                if(profit>p){
                    p=profit;
                }
            }
        
        }
        return p;
    }
}
