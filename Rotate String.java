//https://leetcode.com/problems/rotate-string/description/
class Solution {
    public boolean rotateString(String s, String goal) {
        int a=s.length();
        int b=goal.length();
        if(a != b){
            return false;
        }
        String str=s+s;
        if(!str.contains(goal)){
            return false;
        }
        return true;
    }
}
