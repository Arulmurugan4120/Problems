//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0;
        for(; i < nums.length; i++){
                if(nums[i]==nums[j]){
                    continue;
                }
                j++;
                nums[j]=nums[i];
            }
        return ++j;
    }
}
