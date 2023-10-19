class Solution {
    public int findJudge(int n, int[][] trust) {
        if (n==1)
        return 1;
        Map<Integer,Set<Integer>> m= new HashMap<Integer,Set<Integer>>();
        Map<Integer,Set<Integer>> m1= new HashMap<Integer,Set<Integer>>();
        int check=1;
        for (int[] a :trust)
        {
            if(!m.containsKey(a[1]))
            {
                Set<Integer> s= new HashSet<Integer>();
                s.add(a[0]);
                m.put(a[1],s);
            }
            else
            m.get(a[1]).add(a[0]);
            if(!m1.containsKey(a[0]))
            {
                Set<Integer> s= new HashSet<Integer>();
                s.add(a[1]);
                m1.put(a[0],s);
            }
            else
            m1.get(a[0]).add(a[1]);
        }
        int ans=0;
        int c=0;
        for(int i:m.keySet())
        {
            if(m.get(i).size()==n-1 && !m1.containsKey(i))
            {
                ans=i;
                c+=1;
            }
        }
        if (c==1)
        return ans;
        return -1;
        // System.out.println(m1);
        // System.out.println(m);
        // return check;
    }
}