class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1,j=b.length()-1,carry=0;
        StringBuilder sb = new StringBuilder();
        while(i>=0||j>=0){
            int res=carry;
            if(i>=0) res += (a.charAt(i--) - '0');
            if(j>=0) res += (b.charAt(j--) - '0');
            sb.append(res%2);
            carry = res/2;
        }
        if(carry>0)
            sb.append(carry);
        return sb.reverse().toString();
    }
}
