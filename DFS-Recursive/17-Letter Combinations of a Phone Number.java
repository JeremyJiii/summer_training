class Solution {
    public List<String> letterCombinations(String digits) {
        //dfs recursive 
        List<String> ls = new ArrayList();
        if(digits.length() == 0) 
            return ls;
        String[] dict = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        dfs(digits,ls,0,dict,"");
        return ls;
    }
    public void dfs(String digits,List<String> ls,int index,String[] dict,String item){
        if(index>=digits.length()){
            ls.add(item);
            return;
        }
        String combi = dict[digits.charAt(index)-'0'];
        for(int i=0;i<combi.length();i++){
            dfs(digits,ls,index+1,dict,item+combi.charAt(i));
        }
    }
}
