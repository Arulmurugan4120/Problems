//https://leetcode.com/problems/count-of-matches-in-tournament/
class Solution {
    public int numberOfMatches(int n) {
        int count=0;
        int temp=n;
        while(n>1){
            if(n%2==0){
                count+=(n/2);
            }
            else {
                count+=((n-1)/2);  
            }
            n-=(n/2);
        }
        return temp-1;
    }
}
