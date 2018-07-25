class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[2];
        int j=1,prev=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(j==1){
                if(i==nums.length-1)
                    res[1]=nums[i];
                prev=nums[i];
                j++;
            }
            else{
                if(nums[i]!=prev){
                    res[count]=prev;
                    count++;
                    //一旦找到两个值就中断
                    if(count==2)
                        break;
                    
                    prev=nums[i];
                    if(i==nums.length-1)
                        res[1]=nums[i];
                }
                else
                    j=1;
            }
        }
        return res;
    }
}
