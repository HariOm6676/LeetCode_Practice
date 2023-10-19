class Solution {
    Set<Integer> s= new HashSet<Integer>();
    List<List<Integer>> ans= new ArrayList<List<Integer>>();
    public void dfs(int[][] graph,int i,List<Integer> st)
    {
        // s.add(i);
        for (int j=0;j<graph[i].length;j++)
        {
                st.add(graph[i][j]);
                dfs(graph,graph[i][j],new ArrayList<Integer>(st));
                st.remove(st.size()-1);
            
           
        }
        //  else
        if(i==graph.length-1)
            ans.add(st);
        
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
      
       List<Integer> l= new ArrayList<Integer>();
       l.add(0);
        dfs(graph,0,l);
        return ans;
    }
}