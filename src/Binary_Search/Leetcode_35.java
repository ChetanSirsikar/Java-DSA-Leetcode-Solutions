package Binary_Search;

//https://leetcode.com/problems/search-insert-position/
//35. Search Insert Position
public class Leetcode_35 {
    public static int searchInsert(int[] nums, int target) {
        int s= 0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;

            if(nums[mid] == target ){
                return mid;
            }
            if(nums[mid] < target){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 5;
        int ans = searchInsert(arr,target);
        System.out.println(ans);
    }
}
