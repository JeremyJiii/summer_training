class Solution {
    public String minWindow(String s, String t) {
        
        int s_len = s.length();
        int t_len = t.length();
        int ruler = t_len;
        
        int res = Integer.MAX_VALUE;
        int start = 0;
        
        int[] freq = new int[128];
        
        char[] c_s = s.toCharArray();
        char[] c_t = t.toCharArray();
        
        // count char in t
        for (char c : c_t)
            freq[c]++;
        
        int i = 0, j = 0;
        while (j < s_len) {
            
            // whether ruler can expand
            if (freq[c_s[j]] >= 1){
                ruler--;
            }
            freq[c_s[j]]--;
            j++;
                
            
            
            // if ruler == 0, it means all char in t has been contained in window now
            while (ruler == 0) {
                
                // choose min window
                if (res > j - i) {
                    res = j - i;
                    start = i;
                }
                
                // narrow left border
                if (freq[c_s[i]] == 0)
                    ruler++;
                freq[c_s[i]]++;
                i++;
            }
            
        }
        
        return res == Integer.MAX_VALUE ? "" : s.substring(start, start + res);
        
    }
}
