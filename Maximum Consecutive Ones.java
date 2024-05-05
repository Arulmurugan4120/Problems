//https://www.naukri.com/code360/problems/traffic_6682625?leftPanelTabValue=PROBLEM
public class Solution {
    public static int traffic(int n, int m, int []vehicle) {
        int index = 0, max = 0, count = 0;
        for(int i=0;i<n;i++){
            if(vehicle[i] == 0) 
            count++;
            while(count > m) 
            if(vehicle[index++] == 0) 
            count--;
            max = Math.max(max, i - index + 1);
        }
        return max;
    }
}
