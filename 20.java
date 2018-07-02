class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(Character c: s.toCharArray()){
            if(c==')'){
                if(st.isEmpty()||st.peek()!='(') return false;
                else st.pop();
            }
            else if(c==']'){
                if(st.isEmpty()||st.peek()!='[') return false;
                else st.pop();
            }
            else if(c=='}'){
                if(st.isEmpty()||st.peek()!='{') return false;
                else st.pop();
            }
            else{
                st.push(c); 
            }
        }
        return st.isEmpty();
    }
}
