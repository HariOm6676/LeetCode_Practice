class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        Set<Integer> s= new HashSet<Integer>();
        for(List<Integer> a:edges)
        {
            s.add(a.get(1));
        }
        List<Integer> a= new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            if (!s.contains(i))
            a.add(i);
        }
        return a;
    }
}