//https://www.naukri.com/code360/problems/-print-n-times_8380707?leftPanelTabValue=PROBLEM
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> printNtimes(int n) {
        // Write your code here.
        String name = "Coding Ninjas";
        List<String> cn = new ArrayList<>();
        return cns(cn, n, name);
    }

    public static List<String> cns(List<String> cn, int n, String name) {
        if (n == 0) {
            return cn;
        }
        cn.add(name);
        return cns(cn, n - 1, name);
    }
}
