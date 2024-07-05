//https://leetcode.com/problems/number-of-good-pairs/
class Solution {
    public int numIdenticalPairs(int[] nums) {
       Arrays.sort(nums);
       int result=0;
       int same=1, start=nums[0];
       for(int i=1;i<nums.length;i++){
            if(start!=nums[i]){
                   start=nums[i];
                   same=1;
            }else{
                    result+=same;
                    same++;
            }
       }
       return result;
    }
}
