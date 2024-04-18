//https://www.naukri.com/code360/problems/reverse-an-array_8365444?leftPanelTabValue=SUBMISSION
public class Solution {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        int result[]=new int[n];
        reverse(n-1,0,nums,result);
        return result;
    }
    public static void reverse(int n,int i,int nums[],int result[]){
        if(n==-1){
            return ;
        }
        result[i]=nums[n];
        reverse(n-1,i+1,nums,result);
    }
}
