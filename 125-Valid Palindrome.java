class Solution {
    public boolean isPalindrome(String s) {
        char[] l1 = new char[s.length()];
        char[] l2 = new char[s.length()];
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        int m=0,n=0;
        for(int i=0;i<ch.length;i++){
            if(Character.isLetterOrDigit(ch[i]))
                l1[m++]=ch[i];
        }
        for(int i=ch.length-1;i>=0;i--){
            if(Character.isLetterOrDigit(ch[i]))
                l2[n++]=ch[i];
        }
        String s1 = String.valueOf(l1);
        String s2 = String.valueOf(l2);
        return s1.equals(s2);
    }
}
