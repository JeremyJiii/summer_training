class Solution {
    public int[] plusOne(int[] digits) {
        //9+1的情况
        int carry = 0;
        digits[digits.length-1] += 1;
        if(digits[digits.length-1]==10){
            digits[digits.length-1] = 0;
            carry = 1;
        }
        for(int i=digits.length-2;i>=0;i--){
            if(digits[i]==9&&carry==1){
                digits[i] = 0;
                carry = 1;
            }
            else{
                digits[i] += carry;
                carry = 0;
            }
        }
        int[] d = new int[digits.length+1];
        if(carry==1){
            d[0] = 1;
            for(int j=1;j<d.length;j++){
                d[j] = digits[j-1];
            }
        }
        return carry==0?digits:d;
    }
}
