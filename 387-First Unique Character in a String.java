class Solution {
    public int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        int t=-1;
        for(int i=0;i<c.length;i++){
            if(s.indexOf(c[i])==s.lastIndexOf(c[i])){
                t=i;
                break;
            }
        }
        return t;
    }
}
