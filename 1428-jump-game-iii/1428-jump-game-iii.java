class Solution {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> q= new LinkedList<>();
        q.add(start);
        int v[]=new int[arr.length];
        v[start]=1;
        while(!q.isEmpty())
        {
            int t= q.poll();
            if(arr[t]==0)
            return true;
            
                if(t-arr[t]>=0 && v[t-arr[t]]!=-1)
                {
                    q.add(t-arr[t]);
                    v[t-arr[t]]=-1;
                }
                if(t+arr[t]<arr.length && v[t+arr[t]]!=-1)
                {
                    q.add(t+arr[t]);
                    v[t+arr[t]]=-1;
                }
                
            }
        
        return false;
    }
}