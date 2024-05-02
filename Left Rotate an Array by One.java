//https://www.naukri.com/code360/problems/left-rotate-an-array-by-one_5026278?leftPanelTabValue=PROBLEM
import java.util.* ;
import java.io.*; 
public class Solution {
    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
         rev(arr,1,n-1);
         rev(arr,0,n-1);
         return arr;
    }
    static void rev(int[] arr,int start,int end){
        while(start<end){
          int temp=arr[start];
          arr[start]=arr[end];
          arr[end]=temp;
          start++;
          end--;
        }
    }
}
