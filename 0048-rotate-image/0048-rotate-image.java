class Solution {
    public void rotate(int[][] matrix) {
        int l= matrix.length;
        for(int i=0;i<l;i++)
        {
            for(int j=i;j<l;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
       }
       for(int i=0;i<l;i++)
        {
            int k=0;
            int n=l-1;
            while(k<n)
            {
                int temp=matrix[i][k];
                matrix[i][k]=matrix[i][n];
                matrix[i][n]=temp;
                k+=1;
                n-=1;
            }
       }

    }
}