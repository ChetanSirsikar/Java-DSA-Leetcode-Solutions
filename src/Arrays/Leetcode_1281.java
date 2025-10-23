package Arrays;

//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
//1281. Subtract the Product and Sum of Digits of an Integer
public class Leetcode_1281 {
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while(n>0){
            int num = n %10;
            sum +=num;
            product *=num;
            n = n/10;
        }
        int ans = product-sum;
        return ans;
    }

    public static void main(String[] args) {
        int n = 234;
        int ans = subtractProductAndSum(n);
        System.out.println(ans);
    }
}
