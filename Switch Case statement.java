//https://www.naukri.com/code360/problems/switch-case-statement_8357244?leftPanelTabValue=SUBMISSION
public class Solution {
    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
        double area=0.0;
        switch(ch){
            case 1:
            double radius=a[0];
            area=Math.PI*radius*radius;
            break;
            case 2:
            double length=a[0];
            double breadth=a[1];
            area=length*breadth;
            break;
            default:
            System.out.println("Invalid choice");
        }
        return area;
    }
}
