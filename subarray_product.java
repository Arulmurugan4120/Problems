//https://leetcode.com/problems/subarray-product-less-than-k/?envType=daily-question&envId=2024-03-27
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if( k <= 1) return 0;
        int i = 0;
        int j = 0;
        int count = 0,product = 1;
        while(j < nums.length){
            product *= nums[j];
            while(i < nums.length && product >= k){
                product /= nums[i];
                i++;
            }
            if(product < k){
                count += 1+(j-i);
            }
            j++;
        }
        return count;
    }
}
