import java.util.Arrays;

//https://leetcode.com/problems/concatenation-of-array/
//1929. Concatenation of Array
public class Leetcode_1929 {
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];

        }
        return ans;
    }

    public static void main(String[] args) {
        int[]  arr = {1,2,1};
        int[] ans = new int[arr.length*2];
        ans = getConcatenation(arr);
        System.out.println(Arrays.toString(ans));
    }
}
