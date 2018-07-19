class Solution {
    public String minWindow(String s, String t){
        if(t.length()>s.length()) return "";
        int begin=0,end=0,head=0,len=Integer.MAX_VALUE;
        Map<Character,Integer> map = new HashMap();
        for(char c:t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
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
                if((end-begin)<len){
                    head = begin;
                    len = end - begin;
                }
                begin++;
            }
        }
        if(len==Integer.MAX_VALUE) return "";
        return s.substring(head,head+len);
    }
}
