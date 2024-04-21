//https://www.naukri.com/code360/problems/count-frequency-in-a-range_8365446?leftPanelTabValue=PROBLEM
public class Solution {
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        //In this program is to count the frequency of all elements from 1 to n.
        int hash[]=new int [n];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=n){
                hash[nums[i]-1]++;
            }
        }
        return hash;
    }
}
