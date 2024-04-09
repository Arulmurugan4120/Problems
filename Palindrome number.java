//https://www.naukri.com/code360/problems/palindrome-number_624662?leftPanelTabValue=SUBMISSION
public class Solution {
    public static boolean palindromeNumber(int n){
        // Write your code here.
        int number = n;
        int reverse = 0;
        boolean out = false;
        while(number>0){
            int a = number%10;
            reverse =  reverse*10 + a;
            number = number/10;
        }
        if(n==reverse){
            out = true;
        }
        return out;
    }
}
