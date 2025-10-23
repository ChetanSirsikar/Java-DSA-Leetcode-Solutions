package Binary_Search;

//https://leetcode.com/problems/first-bad-version/
//278. First Bad Version
public class Leetcode_278 {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    public static int firstBadVersion(int n) {
        int s=0;
        int e =n;
        while(s <=e){
            int mid = s+(e-s)/2;
//            if(isBadVersion(mid)){
//                e =mid-1;
//            }
//            else{
//                s=mid+1;
//            }
        }
        return s;
    }
}
