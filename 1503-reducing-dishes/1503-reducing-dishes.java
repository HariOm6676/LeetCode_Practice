class Solution {
    public int solve(int[] s,int index,int time,int[][] dp)
    {
        if (index==s.length)
        return 0;
        if (dp[index][time]!=0)
        return dp[index][time];
        int i=s[index]*(time+1) + solve(s,index+1,time+1,dp);
        int e=0+ solve(s,index+1,time,dp);
        dp [index][time]=Math.max(i,e);
        return dp[index][time];
    }
    public int solve1(int[] s)
    {
        int n=s.length;
        int[][] dp=new int[n+1][n+1];
        for (int index=n-1;index>=0;index--)
        {
            for (int time=n-1;time>=0;time--)
            {
                int i=s[index]*(time+1) + dp[index+1][time+1];
                int e=dp[index+1][time];
                dp[index][time]=Math.max(i,e);
            }

        }
        return dp[0][0];
    }
    public int maxSatisfaction(int[] satisfaction) {
        // int n=satisfaction.length;
        // int [][] dp=new int[n+1][n+1];
        Arrays.sort(satisfaction);
        return solve1(satisfaction);

    }
}