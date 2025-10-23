package Math;

//https://leetcode.com/problems/palindrome-number/
//9. Palindrome Number
public class Leetcode_9 {
    public static boolean isPalindrome(int x) {
        int r = reverse(x);
        if(x == r){
            return true;
        }
        return false;
    }
    public static int reverse(int n){
        int ans=0;
        while(n>0){
            int num = n%10;
            ans = ans *10 + num;
            n = n/10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 121;
        boolean ans = isPalindrome(num);
        System.out.println(ans);
    }
}
