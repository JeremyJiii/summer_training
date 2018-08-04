class Solution {
    public int titleToNumber(String s) {
        int bit = 1,res=0;
        for(int i=s.length()-1;i>=0;i--){
            res += bit*(s.charAt(i) -'A' + 1);
            bit *= 26;
        }
        return res;
    }
}
