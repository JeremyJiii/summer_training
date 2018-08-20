class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor==0||dividend==0)
            return 0;
        int sign = ((dividend>0&&divisor>0)||(dividend<0&&divisor<0))?1:-1;
        long Idividend = Math.abs((long)dividend);
        long Idivisor = Math.abs((long)divisor);
        long sub= Idivisor;
        long count=0,bit=1;
        while(Idividend>=Idivisor){
            if(Idividend>=sub){
                sub<<=1;
                bit<<=1;
                continue;
            }
            bit>>=1;
            sub>>=1;
            Idividend -= sub;
            count += bit;
            bit = 1;
            sub = Idivisor;
        }
        count = sign>0?count:-count;
        return (int)Math.min(Integer.MAX_VALUE,Math.max(count,Integer.MIN_VALUE));
    }
}
