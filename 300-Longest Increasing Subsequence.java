class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] result = new int[nums.length];
        int size = 0;
        for(int n:nums){
            int i=0,j=size-1;
            while(i<=j){
                int center = (i+j)/2;
                if(result[center]<n) {i = center + 1;}
                else {j = center-1;}
            }
            result[i] = n;
            if(i==size) size++;
        }
        return size;
    }
}
