class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList();
        for(int a=1;a<4;a++){
            for(int b=1;b<4;b++){
                for(int c=1;c<4;c++){
                    if(a+b+c>s.length()-4&&a+b+c<s.length()){
                        String one = s.substring(0,a);
                        String two = s.substring(a,a+b);
                        String three = s.substring(a+b,a+b+c);
                        String four = s.substring(a+b+c);
                        if(isvalid(one)&&isvalid(two)&&isvalid(three)&&isvalid(four)) 
                            list.add(one+"."+two+"."+three+"."+four);
                    }
                }
            }
        }
        return list;
    }
    public boolean isvalid(String st){
        if(Integer.parseInt(st)>255||(st.startsWith("0")&&st.length()>1))
            return false;
        return true;
    }
}
