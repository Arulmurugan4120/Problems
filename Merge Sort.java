//https://www.naukri.com/code360/problems/merge-sort_5846?leftPanelTabValue=PROBLEM
public class Solution {
    public static void mergeSort(int[] arr, int l, int r){
        if(l >= r) 
        return;
        int mid = l + (r-l)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        ms(arr, l, mid, r);
    }
    public static void ms(int[] arr, int l, int mid, int r){
        int[] temp = new int[r-l+1];
        int left = l, right = mid+1, index = 0;
        while(left <= mid && right <= r){
            if(arr[left] <= arr[right]) 
            temp[index++] = arr[left++];
            else 
            temp[index++] = arr[right++];
        }
        while(left <= mid)  
        temp[index++] = arr[left++];
        while(right <= r) 
        temp[index++] = arr[right++];
        index = 0;
        for(int i=l;i<=r;i++){
            arr[i] = temp[index++];
        }
    }
}
