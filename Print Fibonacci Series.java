//https://www.naukri.com/code360/problems/print-fibonacci-series_7421617?leftPanelTabValue=PROBLEM
public class Solution {
    public static int[] fibonacciHelper(int out[],int i,int n){
        if(n>=1){
            out[0]=0;
        }
        if(n>=2){
            out[1]=1;
        }
        if(i>n-1){
            return out;
        }
        out[i]=out[i-1]+out[i-2];
        return fibonacciHelper(out,i+1,n);
    }
    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
        int out[]=new int[n];
        return fibonacciHelper(out,2,n);
    }
}
