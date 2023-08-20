class Solution {
    int count=0;
    public void solve(int n,int last)
    {
        if (n == 0)
        count++;
        else{

        
        for(int i=0;i<5;i++)
        {
            if(i>=last)
            solve(n-1,i);
        }
        }
    }
    public int countVowelStrings(int n) {
        solve(n,0);
        return count;
    }
}