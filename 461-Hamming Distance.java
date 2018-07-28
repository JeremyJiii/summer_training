class Solution {
    public int hammingDistance(int x, int y) {
        int res = 0;
        for(int i=0;i<31;i++){
            int count=0;
            res += (x&1)^(y&1);
            x>>=1;
            y>>=1;
        }
        return res;
    }
}
