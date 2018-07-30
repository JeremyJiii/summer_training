class Solution {
    public int climbStairs(int n) {
        //Fibonacci
        int[] plan = new int[n+1];
        plan[0]=1;
        plan[1]=1;
        for(int i=2;i<=n;i++){
            plan[i] = plan[i-1]+plan[i-2];
        }
        return plan[n];
    }
}
