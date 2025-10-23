package Binary_Search;

//https://leetcode.com/problems/sqrtx/
//69. Sqrt(x)
public class Leetcode_69 {
    public static int mySqrt(int x) {
        return (int)Math.sqrt(x);

        // int s =0;
        // int e =x;

        // while(s<=e){
        //     int mid = s+(e-s)/2;
        //     long a = (long) mid*mid;
        //     if( a == x){
        //         return mid;
        //     }
        //     else if(a >x){
        //         e =mid-1;
        //     }
        //     else{
        //         s=mid+1;
        //     }
        // }
        // return e;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(mySqrt(n));
    }
}
