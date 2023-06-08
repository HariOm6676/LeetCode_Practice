class Solution {
    int c=0;
    void set(int m,int n,int[][] arr,int i,int j)
    {
        for(int r=0;r<m;r++)
        arr[r][j]++;
        for(int r=0;r<n;r++)
        arr[i][r]++;
    }
    public int oddCells(int m, int n, int[][] indices) {
        int arr[][]= new int[m][n];
        for(int[] a:indices)
        {
                set(m,n,arr,a[0],a[1]);
        }
        for(int a[]:arr)
        {
            for(int i:a)
            {
                if(i%2!=0)
                c++;
            }
        }
        return c;
    }
}