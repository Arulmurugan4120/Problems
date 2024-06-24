//https://leetcode.com/problems/happy-number/
class Solution {
    public boolean isHappy(int n) {
        int a = n;
        int b = n;
        do{
            a = square(a);
            b = square(square(b));
        }while(a != b);
        return a==1;
    }

    int square(int n){
        int result=0;
        while(n > 0){
            int rem = n % 10;
            result += rem*rem;
            n /= 10;
        }
        return result;
    }
}
