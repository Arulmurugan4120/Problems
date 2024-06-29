//https://leetcode.com/problems/sqrtx/
class Solution {
    public int mySqrt(int x) {
        long a=0;
        long b=x;
        while(a <= b){
            long mid= a +(b-a)/2;
            if(mid*mid == x) 
            return (int)mid;
            else if(mid*mid > x) 
            b =mid-1;
            else 
            a = mid+1;
        }
        return (int)b;
    }
}
