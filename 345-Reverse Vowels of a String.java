class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<Character>();
        for(char c:"aeiouAEIOU".toCharArray()) set.add(c);
        char[] S = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        char cha;
        while(i<j){
            if(set.contains(S[i])){
                if(set.contains(S[j])){
                    cha = S[i];
                    S[i] = S[j];
                    S[j] = cha;
                    i++;
                    j--;
                }
                else{
                    j--;
                }
            }
            else{
                i++;
            }
        }
        String t = new String(S);
        return t;
    }
}
