//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
class Solution {
    public int strStr(String haystack, String needle) {
        int n=needle.length();
        int h=haystack.length();
        for(int i = 0, j = n; j <= h; i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
