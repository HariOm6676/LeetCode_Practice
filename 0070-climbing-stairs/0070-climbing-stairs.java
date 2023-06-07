class Solution {
    int climb(int p,int n,int[] dp)
    {
        if(p>n)
        return 0;
        if(p==n)
        return 1;
        if(dp[p]!=0)
        return dp[p];
        dp[p]=climb(p+1,n,dp)+climb(p+2,n,dp);
        return dp[p];
    }
    public int climbStairs(int n) {
        int dp[]= new int[n];
        return climb(0,n,dp);
    }
}