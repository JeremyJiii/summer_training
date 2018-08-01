public int numTrees(int n) {
    int [] G = new int[n+1];
    G[0] = G[1] = 1;
    
    for(int i=2; i<=n; ++i) {
    	for(int j=1; j<=i; ++j) {
    		G[i] += G[j-1] * G[i-j];
    	}
    }

    return G[n];
}
/*
Explanation:
            从1~n中选出一个数组来当做root
            总个数 = （左字数个数 * 右子树个数） 的 求和。
            左子树个数为dp[i-1],右子树为dp[n-i],当前长度为n
*/
//递归方法，一类题目
class Solution {
    public int numTrees(int n) {
        return trees(1, n);
    }

    int trees(int lo, int hi) {
        if (lo >= hi) return 1;
        int total = 0;
        for (int i = lo; i <= hi; i++)
            total += trees(lo, i - 1) * trees(i + 1, hi);
        return total;
    }
}
