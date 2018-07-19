//所有滑动窗口问题的通用解法
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l = new ArrayList();
        if(p.length()>s.length()) return l;
        Map<Character,Integer> map = new HashMap();
        for(char c:p.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int begin=0,end=0; 
        int count = map.size();
        while(end<s.length()){
            char c = s.charAt(end);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0) count--;
            }
            end++;
            while(count==0){
                char ch = s.charAt(begin);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                    if(map.get(ch)>0) count++;
                }
                if((end-begin)==p.length()) l.add(begin);
                begin++;
            }
        }
        return l; 
    }
}
