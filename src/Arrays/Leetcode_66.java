package Arrays;//https://leetcode.com/problems/plus-one/
//66. Plus One
import java.util.Arrays;

public class Leetcode_66 {
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length-1;i>=0;i-- ){
            if(digits[i] <9){
                digits[i]++;
                return digits;
            }
            digits[i] =0;
        }
        digits = new int[digits.length+1];
        digits[0] =1;
        return digits;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] ans = plusOne(arr);
        System.out.println(Arrays.toString(ans));
    }
}
