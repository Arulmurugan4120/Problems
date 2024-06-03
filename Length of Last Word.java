//https://leetcode.com/problems/length-of-last-word/
class Solution {
    public int lengthOfLastWord(String s) {
        int count=0,a;
        a=s.length()-1;        
        for(int b = a;b >= 0;b--){
            if(s.charAt(b)!=' '){
                count++;
            }
            else if(count>0){
                break;
            }
        }
        return count;
    }
}
