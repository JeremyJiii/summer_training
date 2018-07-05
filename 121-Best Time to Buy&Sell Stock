class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0;
        int low = prices[0];
        int profile=0;
        for(int n:prices){
            if(n<low)
                low = n;
            if(n-low>profile)
                profile = n - low;
        }
       return profile;
    }
}
