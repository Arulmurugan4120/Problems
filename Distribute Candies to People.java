//https://leetcode.com/problems/distribute-candies-to-people/
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int index = 1;
        while (candies > 0) {
            for (int i = 0; i < num_people; i++) {
                if (candies == 0) break;
                index = candies > index ? index : candies;
                result[i] += index;
                candies -= index++;
            }
        }

        return result;
    }
}
