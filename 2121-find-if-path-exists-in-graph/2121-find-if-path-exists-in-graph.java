class Solution {
    Map<Integer,List<Integer>> m= new HashMap<Integer,List<Integer>>();
    Set<Integer> s= new HashSet<Integer>();
    boolean ans=false;
    public void dfs(Map<Integer,List<Integer>> m,int src,int dest)
    {
        s.add(src);
        if (src==dest)
        {
            ans=true;
            return;
        }
        for(int i:m.get(src))
        {
            if(!s.contains(i))
            dfs(m,i,dest);
        }

    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        for(int[] a: edges)
        {
            if (!m.containsKey(a[0]))
            {
                List<Integer> l=new ArrayList<Integer>();
                l.add(a[1]);
                m.put(a[0],l);
                
            }
            else
            m.get(a[0]).add(a[1]);
            if (!m.containsKey(a[1]))
            {
                List<Integer> l1=new ArrayList<Integer>();
                l1.add(a[0]);
                m.put(a[1],l1);
            }
            else
            m.get(a[1]).add(a[0]);
        }
        dfs(m,source,destination);

        return ans;
    }
}