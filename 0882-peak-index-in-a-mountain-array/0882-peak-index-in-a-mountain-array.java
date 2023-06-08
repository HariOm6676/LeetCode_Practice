class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i=0,j=arr.length-1,m=0;
        while(i<=j)
        {
            m=i+(j-i)/2;
            if(i==j)
            return m;
            // System.out.println(nums[m]);
            if(arr[m]>arr[m+1])
            j=m;
            else
            i=m+1;
        }
        return m;
    
    }
}