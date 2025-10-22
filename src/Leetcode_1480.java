//https://leetcode.com/problems/running-sum-of-1d-array/
//1480. Running Sum of 1d Array
import java.util.Arrays;

public class Leetcode_1480 {
    public static int[] runningSum(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            nums[i] += max;
            max = nums[i] ;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans = runningSum(arr);
        System.out.println(Arrays.toString(ans));
    }
}
