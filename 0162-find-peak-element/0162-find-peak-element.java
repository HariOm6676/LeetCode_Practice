class Solution {
    public int findPeakElement(int[] nums) {
        int i=0,j=nums.length-1,m=0;
        while(i<=j)
        {
            m=i+(j-i)/2;
            if(i==j)
            return m;
            // System.out.println(nums[m]);
            if(nums[m]>nums[m+1])
            j=m;
            else
            i=m+1;
        }
        return m;
    }
}