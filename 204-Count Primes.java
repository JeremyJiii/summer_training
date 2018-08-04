class Solution {
    public int countPrimes(int n) {
        int[] notPrime = new int[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == 0) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = 1;
                }
            }
        }
        
        return count;
    }
}
