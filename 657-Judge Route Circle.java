class Solution {
    public boolean judgeCircle(String moves) {
        int upper=0,down=0,right=0,left=0;
        for(char c:moves.toCharArray()){
            if(c=='U')
                upper++;
            else if(c=='D')
                down++;
            else if(c=='L')
                left++;
            else if(c=='R')
                right++;
        }
        return upper==down&&left==right;
    }
}
