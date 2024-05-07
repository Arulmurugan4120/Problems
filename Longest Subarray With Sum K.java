//https://www.naukri.com/code360/problems/longest-subarray-with-sum-k_6682399?leftPanelTabValue=SUBMISSION
public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int l = 0, r = 0, max = 0;
        long sum = 0;
        while(r < a.length){
            sum += a[r++];
            while(sum > k){
                sum -= a[l++];
            }
            if(sum == k) 
            max = Math.max(max, r - l);
        }
        return max;
    }
}
