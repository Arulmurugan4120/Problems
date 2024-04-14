//https://www.naukri.com/code360/problems/print-1-to-n_628290?leftPanelTabValue=PROBLEM
public class Solution {
    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] arr=new int[x];
        return rf(arr, x);
    }
    public static int[] rf(int[] arr,int x){
        if(x==0){
            return arr;
        }
        arr[x-1]=x;
        return rf(arr,x-1);
    }
}
