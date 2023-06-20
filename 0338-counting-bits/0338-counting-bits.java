class Solution {
    public int[] countBits(int n) {
        int a[] = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int c=0,i1=i;
            while(i1>=1)
            {
                if(a[i1]!=0)
               { c+=a[i1];
               break;
               }
                else if(i1%2==1)
                c++;
                System.out.println(i1);
                i1/=2;
            }
            a[i]=c;
        }
        return a;
    }
}