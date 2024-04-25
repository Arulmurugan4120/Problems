//https://www.naukri.com/code360/problems/insertion-sort_624381?leftPanelTabValue=PROBLEM
public class Solution {
    public static void insertionSort(int[] arr, int size) {
        //Your code goes here
        for(int i=0;i<=size-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
}
