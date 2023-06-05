class Solution {
    public int consecutiveNumbersSum(int n) {
        // int N=(n+1)*n/2;
        int k=1;
        int c=0;
        while((2*n-(k*(k-1)))>0)
        {
            if((n-(k*(k-1))/2)%k==0)
            c+=1;
            k++;
        }
        return c;
    }
}