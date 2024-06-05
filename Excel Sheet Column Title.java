//https://leetcode.com/problems/excel-sheet-column-title/description/
class Solution {
    public String convertToTitle(int columnNumber) {
        String ans="";
        while(columnNumber > 0){
            columnNumber--;
            int value=columnNumber % 26;
            value += 65;
            ans=((char)value+"")+""+ans;
            columnNumber = columnNumber / 26;
        }
        return ans;
    }
}
