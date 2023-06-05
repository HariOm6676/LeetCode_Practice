// class Solution1 {
//     int dfs(int i,int j,int m,int n,int[][] dp)
//     {
//         if(i>=m || j>=n)
//         return 0;
//         if(i==m-1&& j==n-1)
//         return 1;
//         if(dp[i+1][j]!=0 && dp[i][j+1]!=0)
//         return dp[i+1][j]+dp[i][j+1];
//         else if(dp[i+1][j]!=0)
//         return dp[i+1][j]+dfs(i,j+1,m,n);
//         else if(dp[i][j+1]!=0)
//         return dfs(i+1,j,m,n)+dp[i+1][j];
//         else{
//         dp[i+1][j]= dfs(i+1,j,m,n);
//         dp[i][j+1]=dfs(i,j+1,m,n);
//         return dp[i+1][j]+dp[i][j+1];
//         }

//     }
//     public int uniquePaths(int m, int n) {
//         int dp[][]= new int[m][n];
//         return dfs(0,0,m,n);
//     }
// }
class Solution {
    long ncr(int n,int r)
    {
        long p=1;
        for(int i=1;i<=r;i++)
        p=p*(n-r+i)/i;
        return p;
    }
    
        public int uniquePaths(int m, int n) {
            return ((int)ncr((m+(n-2)),n-1));
        }
}