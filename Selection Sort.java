//https://www.naukri.com/code360/problems/selection-sort_624469?leftPanelTabValue=SUBMISSION
public class Solution {
    public static void selectionSort(int[] arr) {
        //Your code goes here
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int num=i;
            for(int j=i+1;j<n;j++){
                if(arr[num]>arr[j]){
                    num=j;
                }
            }
            int temp=arr[num];
            arr[num]=arr[i];
            arr[i]=temp;
        }
    }
}
