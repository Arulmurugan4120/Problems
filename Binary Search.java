//https://leetcode.com/problems/binary-search/description/
class Solution {
    public int search(int[] arr, int item) {
        int n = arr.length;
        int start = 0, end = n-1;

        while(start <= end) {
            int mid = (start+end)/2;
            if(item == arr[mid]) {
                return mid;
            }
            else if(item > arr[mid]) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
}
