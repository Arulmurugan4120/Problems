//https://www.naukri.com/code360/problems/reverse-bits_2181102?leftPanelTabValue=PROBLEM
public class Solution {
    public static long reverseBits(long n) {
        long arr[]=new long[32];
        int count=0;
        while(n!=0){
            long rem=n%2;
            arr[count]=rem;
            n/=2;
            count++;
        }
        count=0;
        long result=0;
        for(int i=31; i>=0; i--){
            result+=(long)Math.pow(2,count)*arr[i];
            count++;
        }
        return result;
    }
}
