//https://www.naukri.com/code360/problems/find-character-case_58513?leftPanelTabValue=PROBLEM
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        // Write your code here
        Scanner in = new Scanner(System.in);
        char output = in.next().charAt(0);
        if(output >= 'A' && output <= 'Z'){
            System.out.println("1");
        }else if(output >= 'a' && output <= 'z'){
            System.out.println("0");
             }else{
            System.out.println("-1");
        }
    }
}
