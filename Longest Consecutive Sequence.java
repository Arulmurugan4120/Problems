//https://leetcode.com/problems/longest-consecutive-sequence/
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int count=0,maxcount=0;
        for(int element : set){
            if(!set.contains(element-1)){
                count=1;
                int in=element;
            while(set.contains(in+1)){
                count++;
                in++;
            }
            maxcount=Math.max(maxcount,count);
            }
        }
        return maxcount;
    }
}
