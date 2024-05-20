//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans  ={-1,-1};
        int start = index(nums,target,true);
        int end = index(nums,target,false);
        ans[0]= start;
        ans[1]= end;
        return ans;
    }
    int index(int[] nums, int target, boolean firstIndex){
        int ans = -1;
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]>target){
                e= mid -1;
            }
            else if(nums[mid]<target){
                s = mid+1;
            }
            else{
                ans = mid;
                if(firstIndex){
                    e = mid-1;
                }
                else{
                    s= mid+1;
                }
            }
        }
        return ans;
    }
}
