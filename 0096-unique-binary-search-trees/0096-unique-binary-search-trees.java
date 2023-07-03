class Solution {
    long dp[] = new long[20];
    public int numTrees(int n) {
        if(n<=1)
        return 1;
        if(dp[n]!=0)
        return (int)dp[n];
        for(int i=1;i<=n;i++)
        {
            dp[n]+=numTrees(i-1)*numTrees(n-i);
        }
        return (int)dp[n];
        
    }
}