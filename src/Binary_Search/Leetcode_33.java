package Binary_Search;//https://leetcode.com/problems/search-in-rotated-sorted-array/
//33. Search in Rotated Sorted Array

public class Leetcode_33 {
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if(pivot == -1){
            return BinarySearch(nums,target,0,nums.length-1);
        }
        else if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return BinarySearch(nums,target,0,pivot-1);
        }
        return BinarySearch(nums,target,pivot+1,nums.length-1);

    }
    public static int findPivot(int[] nums){
        int s=0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid < e && nums[mid+1] < nums[mid] ){
                return mid;
            }
            else if(mid > s && nums[mid-1] > nums[mid]){
                return mid-1;
            }
            else if(nums[mid] < nums[s]){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return -1;
    }
    public static int BinarySearch(int[] nums,int target,int start,int end){
        int s = start;
        int e = end;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target == nums[mid]){
                return mid;
            } else if (nums[mid] > target) {
                e = mid-1;
            }
            else {
                s = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = search(arr,target);
        System.out.println(ans);
    }
}
