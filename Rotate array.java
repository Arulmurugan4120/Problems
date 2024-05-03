//https://www.naukri.com/code360/problems/rotate-array_1230543?leftPanelTabValue=SUBMISSION
import java.util.ArrayList;
public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        rotate(arr, 0, k-1);
        rotate(arr, k, arr.size() - 1);
        rotate(arr, 0, arr.size() - 1);
        return arr;
    }
    public static void rotate(ArrayList<Integer> arr, int low, int high){
        while(low < high){
            int temp = arr.get(low);
            arr.set(low, arr.get(high));
            arr.set(high, temp);
            low++;high--;
        }
    }
}
