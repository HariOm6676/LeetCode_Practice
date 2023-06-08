class Solution {
    int m,n;
    boolean sf(int i,int j,int arr[][])
    {
        if(arr[i][j]!=1)
        return false;
        for(int r=0;r<n;r++)
        {
            if(arr[i][r]==1&& r!=j)
            return false;
        }
        for(int r=0;r<m;r++)
        {
            if(arr[r][j]==1&& r!=i)
            return false;
        }
        return true;
    }
    public int numSpecial(int[][] mat) {
        int c=0;
        m=mat.length;
        n=mat[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(sf(i,j,mat)==true)
                c++;
            }
        }
        return c;
    }
}