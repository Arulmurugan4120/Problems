//https://leetcode.com/problems/sum-of-digits-in-base-k/
class Solution {
    public int sumBase(int n, int k) {
        int sum = 0;
        while(n>=k){
            int diff = n%k;
            n -= diff;
            n /= k; 
            sum += diff;
        }
        if(n<k){
            sum += n%k;
        }
        return sum;
    }
}
