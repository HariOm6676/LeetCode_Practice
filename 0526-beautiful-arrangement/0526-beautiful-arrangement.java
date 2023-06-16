class Solution {
    int c=0;
    void solve(int n,int p,List<Boolean> bit_v)
    {
        if(p==n)
        {
            // for(int i=0;i<n;i++)
            // {
            //     if(perm.get(i)%(i+1)!=0 && (i+1)%perm.get(i)!=0)
            //     {
            //         return;
            //     }
            // }
            c+=1;
        }
        else
    {
        for(int i=1;i<=n;i++)
        {
           
            if(bit_v.get(i)==true && (i%(p+1)==0 || (p+1)%i==0))
            {
                bit_v.set(i,false);
                p++;
                solve(n,p,bit_v);
                // perm.remove(perm.size()-1);
                p--;
                bit_v.set(i,true);
            }
        }


    }
        

    }
    public int countArrangement(int n) {
        // int c=0;
    List<Boolean> bit_v = new ArrayList<Boolean>();
    // List<Integer> p= new ArrayList<Integer>();
    for(int i=0;i<=n;i++)
    bit_v.add(true);
    solve(n,0,bit_v);
    return c;

    }
}