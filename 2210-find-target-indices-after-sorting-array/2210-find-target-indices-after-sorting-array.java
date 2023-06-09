class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int m=0;
        int i=0,j=nums.length-1;
        while(i<j)
        {
            m=(i+j)/2;
            if(nums[m]>=target)
            j=m;
            else
            i=m+1;
            System.out.println(m+" "+nums[m]);
        }
        List<Integer> ans= new ArrayList<Integer>();
        while(i<nums.length&&nums[i]==target){
            ans.add(i);
            i++;
        }
        return ans;
    }
}