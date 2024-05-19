//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class Solution {
public int[] searchRange(int[] nums, int target) {
    int[] r = new int[2];
    r[0] = findStart(nums, target);
    r[1] = findEnd(nums, target);
    return r;
}

private int findStart(int[] nums, int target){
    int index = -1;
    int start = 0;
    int end = nums.length - 1;
    while(start <= end){
        int mid = (start + end) / 2;
        if(nums[mid] >= target){
            end = mid - 1;
        }else{
            start = mid + 1;
        }
        if(nums[mid] == target) index = mid;
    }
    return index;
}

private int findEnd(int[] nums, int target){
    int index = -1;
    int start = 0;
    int end = nums.length - 1;
    while(start <= end){
        int mid = (start + end) / 2;
        if(nums[mid] <= target){
            start = mid + 1;
        }else{
            end = mid - 1;
        }
        if(nums[mid] == target) index = mid;
    }
    return index;
    }
}
