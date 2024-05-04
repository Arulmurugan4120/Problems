//https://www.naukri.com/code360/problems/ninja-and-the-zero-s_6581958?leftPanelTabValue=PROBLEM
public class Solution {
    public static int[] moveZeros(int n, int []a) {
        int index = 0;
        for(int i=0;i<a.length;i++){
            if(a[i] != 0){
                int temp = a[index];
                a[index++] = a[i];
                a[i] = temp;
            }
        }
        return a;
    }
}
