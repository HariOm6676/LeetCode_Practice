class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
         int i=0,j=letters.length-1;
         int m=0;
         while(i<=j)
         {
           m=(i+j)/2;
          //  if(letters[m]==target)
         
           if(letters[m]>target)
           j=m;
           else
           i=m+1;
            if(i==m)
          break;
            System.out.println(m);
         }
        if(letters[m]>target)
         return letters[m];
         else
         return letters[0];
      }
}