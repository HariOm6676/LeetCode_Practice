class Solution {
    int m= Integer.MIN_VALUE;
    public int largestAltitude(int[] gain) {
        for(int i=1;i<gain.length;i++)
        {
            gain[i]+=gain[i-1];
        }
        for(int i=0;i<gain.length;i++)
        {
            m= Math.max(m,gain[i]);
        }
        if(m<=0)
        return 0;
        else
        return m;
    }
}