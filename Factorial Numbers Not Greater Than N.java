//https://www.naukri.com/code360/problems/factorial-numbers-not-greater-than-n_8365435?leftPanelTabValue=SUBMISSION
import java.util.*;
public class Solution {
    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        List<Long> lo=new ArrayList<Long>();
        long fact=1;
        int num=2;
        returnfact(n,lo,fact,num);
        return lo;
    }
    public static void returnfact(Long n, List<Long> lo, Long fact,int num)
    {
        if(fact>n)
            return ;     
         lo.add(fact);
        returnfact(n, lo, fact*num,num+1);
    }
}
