//https://leetcode.com/problems/rearrange-array-elements-by-sign/
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i=0;
        int j=1;
        int arr[]=new int[nums.length];
        for(int a=0;a<nums.length;a++){
            if(nums[a]>0){
                arr[i]=nums[a];
                i=i+2;
            }else{
                arr[j]=nums[a];
                j=j+2;
            }
        }
        return arr;
    }
}
