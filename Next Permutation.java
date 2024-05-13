//https://leetcode.com/problems/next-permutation/
class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }
    public  void swap(int[] nums, int no1, int no2){
        int temp = nums[no1];
        nums[no1] = nums[no2];
        nums[no2] = temp;
    }
    public  void reverse(int[] nums, int start){
        int i = start;
        int j = nums.length-1;
        while(i<j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
