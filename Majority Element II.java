//https://leetcode.com/problems/majority-element-ii/
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Integer majorityElement1 = 0;
        Integer majorityElement2 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int num : nums) {
            if (num == majorityElement1) {
                count1++;
            } else if (num == majorityElement2) {
                count2++;
            } else if (count1 == 0) {
                majorityElement1 = num;
                count1++;
            } else if (count2 == 0) {
                majorityElement2 = num;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == majorityElement1) {
                count1++;
            } else if (num == majorityElement2) {
                count2++;
            }
        }

        List<Integer> r = new ArrayList<>();
        int n = nums.length;

        if (count1 > n / 3) {
            r.add(majorityElement1);
        }
        if (count2 > n / 3) {
            r.add(majorityElement2);
        }

        return r;        
    }
}
