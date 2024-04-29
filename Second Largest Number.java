//https://www.naukri.com/code360/problems/ninja-and-the-second-order-elements_6581960?leftPanelTabValue=PROBLEM
public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int fL=a[0];
        int fS=a[0];
        int i=1;
        while(i<n){
            if(a[i]>fL){
                fL=a[i];
            }
            if(a[i]<fS){
                fS=a[i];
            }
            i++;
        }
        int sL=a[1];
        int sS=a[1];
        i=0;
        while(i<n){
            if(a[i]!=fL && a[i]>sL){
                sL=a[i];
            }
            if(a[i]!=fS && a[i]<sS){
                sS=a[i];
            }
            i++;
        }
        return new int[]{sL,sS};
    }
}
