//https://www.naukri.com/code360/problems/if-else-decision-making_8357235?leftPanelTabValue=PROBLEM
public class Solution {
    public static String compareIfElse(int a, int b) {
        // Write your code here
        if(a<b){
            return "smaller";
        }
        else if(a>b){
            return "greater";
        }
        return "equal";
    }
}
