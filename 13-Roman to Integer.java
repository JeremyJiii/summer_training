class Solution {
    public int romanToInt(String s) {
        Map<String,Integer> map = new HashMap<>();
        map.put("I",1); map.put("V",5);map.put("X",10);map.put("L",50);map.put("C",100);map.put("D",500);
        map.put("M",1000);map.put("IV",4);map.put("IX",9);map.put("XL",40);
        map.put("XC",90);map.put("CD",400);map.put("CM",900);
        int result=0,i=0;
        while(i<s.length()-2){
            if(map.containsKey(s.substring(i,i+2))){
                result += map.get(s.substring(i,i+2));
                i += 2;
            }
            else{
                result += map.get(s.substring(i,i+1));
                i++;
            }
        }
        if(i==s.length()-1) result += map.get(s.substring(i));
        if(i==s.length()-2){
            if(map.containsKey(s.substring(i))) result += map.get(s.substring(i));
            else result += map.get(s.substring(i,i+1)) + map.get(s.substring(i+1));
        }
        return result;
    }
}
