//https://www.naukri.com/code360/problems/bubble-sort_624380?leftPanelTabValue=SUBMISSION
public class Solution {
    public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        for(int a=0;a<n-1;a++){
            int swap=0;
            for(int b=0;b<n-a-1;b++){
                if(arr[b]>arr[b+1]){
                    int temp=arr[b];
                    arr[b]=arr[b+1];
                    arr[b+1]=temp;
                    swap++;
                }
            }
            if(swap==0)
            break;
        }
    }
}
