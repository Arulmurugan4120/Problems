//https://www.naukri.com/code360/problems/largest-element-in-the-array-largest-element-in-the-array_5026279?leftPanelTabValue=SUBMISSION
import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int largest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
}
