// Solution 1:
// class Solution {
//     List<String> l= new ArrayList<String>();
//     public void solve(int i,String a, String t)
//     {
        
//         if (i<=t.length())
//         {
//         l.add(a);
//         if (i==t.length())
//         return;
//         }
//         solve(i+1,a,t);
//         solve(i+1,a+t.charAt(i),t);

//     }
//     public boolean isSubsequence(String s, String t) {
//         solve(0,"",t);
//         System.out.println(l);
//         for(String a: l)
//         {
//             if (a.equals(s))
//             return true;
//         }
//         return false;
//     }
// }
// Solution 2:
// class Solution {
//     List<String> l= new ArrayList<String>();
//     boolean ans=false;
//     public void solve(int i,String s,String a, String t)
//     {
        
//         if (i<=t.length())
//         {
//         if(s.equals(a))
//         ans=true;
//         System.out.println(a+" "+s+"  "+ans);
//         if(ans==true)
//         return;
//         if (i==t.length())
//         {
//             ans=false;
//             return;
//         }
//         }
//         solve(i+1,s,a,t);
//         solve(i+1,s,a+t.charAt(i),t);
//     }
//     public boolean isSubsequence(String s, String t) {
//         solve(0,s,"",t);
//         return ans;
//     }
// }
// Solution 3:
// class Solution {
//     List<String> l= new ArrayList<String>();
//     boolean ans=false;
//     public boolean solve(int i,int j,String s,String a, String t)
//     {
//         if(i==t.length() && j<s.length())
//         return false;
//         if (j==s.length())
//         return true;
        
//         boolean a1=solve(i+1,j,s,a,t);
//         a=a+t.charAt(i);
//         if (a.charAt(j)==s.charAt(j))
//         {
//         return a1||solve(i+1,j+1,s,a,t);
//         }
//         return a1;
//     }
//     public boolean isSubsequence(String s, String t) {
        
//         return solve(0,0,s,"",t);
//     }
// }
// Solution DP
class Solution {
    public boolean solve(int i,int j,String s,String a1, String t,HashMap<List<Integer>,Boolean> dp)
    {
        List<Integer> a= new ArrayList<Integer>();
            a.add(i);
            a.add(j);
        // System.out.println(dp);
        if (dp.containsKey(a))
        return dp.get(a);
        if(i==t.length() && j<s.length())
        {
            dp.put(a,false);
            return false;
        }
        if (j==s.length())
        {
            dp.put(a,true);
            return true;
        }
        
        
        boolean a2=solve(i+1,j,s,a1,t,dp);
        a1=a1+t.charAt(i);
        if (a1.charAt(j)==s.charAt(j))
        {
        dp.put(a,a2||solve(i+1,j+1,s,a1,t,dp));
        }
        else
        dp.put(a,a2);

        return dp.get(a);
    }
    public boolean isSubsequence(String s, String t) {
        HashMap<List<Integer>,Boolean> dp= new HashMap<List<Integer> , Boolean>();
        return solve(0,0,s,"",t,dp);
    }
}