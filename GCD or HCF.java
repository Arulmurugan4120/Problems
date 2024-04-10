//https://www.naukri.com/code360/problems/hcf-and-lcm_840448?leftPanelTabValue=SUBMISSION
public class Solution {
    public static int calcGCD(int n, int m){
       while(n>0 && m>0) {
           if(n>m)
            n = n % m;
            else
            m = m% n;
       }
    if(n == 0)
    return m;
    else
    return n;
    }
}
