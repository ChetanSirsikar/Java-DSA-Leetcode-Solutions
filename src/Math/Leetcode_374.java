package Math;

//https://leetcode.com/problems/guess-number-higher-or-lower/
//374. Guess Number Higher or Lower
public class Leetcode_374 {
    /**
     * Forward declaration of guess API.
    // * @param  num   your guess
     * @return 	     -1 if num is higher than the picked number
     *			      1 if num is lower than the picked number
     *               otherwise return 0
     * int guess(int num);
     */
    public static int guessNumber(int n) {
        int s =0;
        int e = n;
        int ans =0;

        while(s <=e){
            int mid = s +(e-s)/2;
           // int g = guess(mid);
//            if(g ==0){
//                ans = mid;
//            }
//            if(g == -1){
//                e = mid-1;
//            }
//            else{
//                s = mid+1;
//            }
        }
        return ans;

    }

}
