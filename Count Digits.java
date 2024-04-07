//https://www.naukri.com/code360/problems/count-digits_8416387?leftPanelTabValue=SUBMISSION
public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        int count=0,temp=n;
        while(temp>0){
            int rem=temp % 10;
            if(rem!=0 && n % rem==0){
                count++;
            }
            temp/=10;
        }
        return count;
    }
}
