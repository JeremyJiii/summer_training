class Solution {
    public String multiply(String num1, String num2) {
        int[] pos = new int[num1.length() + num2.length()];
        for(int i=num2.length()-1;i>=0;i--){
            for(int j=num1.length()-1;j>=0;j--){
                int result = (num2.charAt(i)-'0') * (num1.charAt(j)-'0');
                int sum = result + pos[i+j+1];
                pos[i+j] += sum/10;
                pos[i+j+1] = sum%10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int t:pos){
            if(!(sb.length()==0&&t==0))
                sb.append(t);
        }
        return sb.length()==0?"0":sb.toString();
    }
}
