class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length==0)
            return 0;
        int sum = (0+nums.length)*(nums.length+1)/2;
        for(int n:nums)
            sum -= n;
        return sum;
    }
}
