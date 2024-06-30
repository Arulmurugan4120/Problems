//https://leetcode.com/problems/climbing-stairs/
public class Solution {
    public int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int one = 1;
        int two = 2;
        int result = 0;
        for (int i = 2; i < n; i++) {
            result = one + two;
            one = two;
            two = result;
        }
        return result;
    }
}
