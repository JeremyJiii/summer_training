class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        double t = myPow(x,n/2);
        if(n%2!=0) return n<0 ? 1/x*t*t : x*t*t; # the last of odd term and n==1
        else return t*t;
    }
}
