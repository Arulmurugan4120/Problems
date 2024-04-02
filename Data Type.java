//https://www.naukri.com/code360/problems/data-type_8357232?leftPanelTabValue=PROBLEM
import java.util.*;
public class Solution {
    public static int dataTypes(String type) {
        // Write your code here
        if(type.equals("Integer")){
            return 4;
        }
         if(type.equals("Long")){
            return 8;
        }
         if(type.equals("Float")){
            return 4;
        }
         if(type.equals("Double")){
            return 8;
        }
         if(type.equals("Character")){
            return 1;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner get= new Scanner(System.in);
        String in=get.nextLine();
        int result=dataTypes(in);
        System.out.println(result);

    }
}
