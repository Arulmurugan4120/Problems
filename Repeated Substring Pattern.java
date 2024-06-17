//https://leetcode.com/problems/repeated-substring-pattern/description/
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        for(int i = 1; i <= length/2; i++){
            if(length % i == 0){
                String substr=s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < length/i; j++){
                    sb.append(substr);
                }        
                if(sb.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}
