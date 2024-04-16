//https://www.naukri.com/code360/problems/n-to-1-without-loop_8357243?leftPanelTabValue=PROBLEM
public class Solution
{
    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] out=new int[x];
        pn(out,x,0);
        return out;
    }
    public static void pn(int[] arr,int a,int b){
        if(a > 0){
            arr[b]=a;
            pn(arr,a-1,b+1);
        }
    }
}
