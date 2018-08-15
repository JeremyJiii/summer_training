class Solution {
    public int res; 
    public int countSubstrings(String s) {
        if(s.length()<=1)
            return s.length();
        for(int i=0;i<s.length();i++){
            isPalin(i,i,s);
            isPalin(i,i+1,s);
        }
        return res;
    }
    public void isPalin(int left,int right,String s){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
            res++;
        }
    }
}
