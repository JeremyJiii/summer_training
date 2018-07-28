class Solution {
    public boolean canPartition(int[] nums) {
        if(nums.length==0)
            return false;
        int total = 0;
        for(int n:nums)
            total+=n;
        if(total%2!=0)
            return false;
        total /= 2;
        boolean[] dp = new boolean[total+1];
        dp[0] = true;
        for(int i=1;i<=nums.length;i++){
            for(int j=total;j>=nums[i-1];j--){
                dp[j]= dp[j]||dp[j-nums[i-1]];
            }
        }
        return dp[total];
    }
}
