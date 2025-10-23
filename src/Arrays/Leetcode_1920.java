package Arrays;//https://leetcode.com/problems/build-array-from-permutation/description/
//1920. Build Array from Permutation
import java.util.Arrays;

public class Leetcode_1920 {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            ans[i]  = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        int[] ans = buildArray(arr);
        System.out.println(Arrays.toString(ans));
    }
}
