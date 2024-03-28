//https://leetcode.com/problems/two-sum/description
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int result=0;
            for(int j=i+1;j<nums.length;j++){
                result=nums[i]+nums[j];
                 if(result==target){
                    return new int[] {i,j};
                 }
            }
        }
        return new int[] {};
    }
}
