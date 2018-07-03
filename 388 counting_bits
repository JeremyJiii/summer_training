class Solution {
    public int[] countBits(int num) {
        /*
        0 0
        1 1
        2 10
        3 11
        4 100
        5 101
        6 110
        7 111
        8 1000
        */
        int[] cat= new int[num+1];
        for (int i=1; i<=num; i++) {
            cat[i] = cat[i/2] + (i & 1);
        }
        return cat;
    }
}
