//https://www.naukri.com/code360/problems/ninja-and-the-sorted-check_6581957?leftPanelTabValue=PROBLEM
public class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        for(int i=1;i<a.length;i++){
                if(a[i-1]>(a[i])){
                    return 0;
                }
        }
        return 1;
    }
}
