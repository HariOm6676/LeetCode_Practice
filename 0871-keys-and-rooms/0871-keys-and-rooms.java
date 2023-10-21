class Solution {
    Set<Integer> s= new HashSet<Integer>();
    public void dfs(List<List<Integer>> rooms, int i)
    {
        s.add(i);
        for(int j=0;j<rooms.get(i).size();j++)
        {
            if(!s.contains(rooms.get(i).get(j)))
            {
                dfs(rooms,rooms.get(i).get(j));
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        dfs(rooms,0);
        for(int i=0;i<rooms.size();i++)
        {
        if (!s.contains(i))
        return false;
        }
        // System.out.println(s);
        return true;
    }
}