//https://www.naukri.com/code360/problems/sum-of-all-divisors_8360720?leftPanelTabValue=PROBLEM
public class Solution {
    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int sum = 0;
        int i = 1;
        while (i <= n)
        {
            int value = n / i;
            int r = n / value;
            sum += ((r * (r + 1)) / 2 - (i * (i - 1)) / 2) * value;
            i = r + 1;
        }
        return sum;
    }
}
