class Solution {
    public String convertToTitle(int columnNumber) {
        int n=columnNumber;
        String s="";
        int d=0;
        while(n!=0)
        {
            d=n%26;
            n=n/26;
            System.out.println(d+"  "+n);
            if (d==0)
            {
                s='Z'+s;
                n-=1;
                // break;
            }
            else
            s=(char)(64+d)+s;
        }
        return s;
    }
}