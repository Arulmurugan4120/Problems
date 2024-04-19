//https://naukri.com/code360/problems/check-palindrome-recursive_624386?leftPanelTabValue=PROBLEM
public class Solution {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        return reverse(0,str,str.length());
    }
    public static boolean reverse(int i,String str,int n){
        if(i>=n/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt(n-i-1)){
            return false;
        }
        return reverse(i+1,str,n);
    }
}
