/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long n1=n;
        long i=1;
        while(i<=n1)
        {
            long  m=(i+n1)/2;
            if(guess((int)m)==-1)
            n1=m-1;
            else if(guess((int)m)==1)
            i=m+1;
            else
            return (int)m;
        }
        return -1;
    }
}