//https://leetcode.com/problems/number-of-lines-to-write-string/
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int rowCount = 1;
        final int len=s.length();
        int currRowWiidth = 0;
        for(int i = 0;i < len; i++){
            int charI = s.charAt(i) - 'a';
            currRowWiidth += widths[charI];
            if(currRowWiidth > 100){
                currRowWiidth = widths[charI];
                rowCount++;
            }
        }
        return new int[]{rowCount,currRowWiidth};
    }
}
