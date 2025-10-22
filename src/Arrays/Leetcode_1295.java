package Arrays;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
//1295. Find Numbers with Even Number of Digits
public class Leetcode_1295 {
    public static int findNumbers(int[] nums) {
        int count =0;
        for(int i = 0;i<nums.length;i++){

            if(iseven(nums[i])){
                count+=1;
            }
        }
        return count;
    }
    public static boolean iseven(int n){
        int digits = (int) Math.log10(n)+1;
        if(digits % 2 ==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int ans = findNumbers(arr);
        System.out.println(ans);
    }
}
