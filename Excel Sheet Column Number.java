//https://leetcode.com/problems/excel-sheet-column-number/description/
class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        int length=columnTitle.length();
        for(int i = 0; i < length;i++){
            res *= 26;
            char c = columnTitle.charAt(i);
            int num = (int)c - 'A' + 1;
            res += num;
        }
        return res;
    }
}
