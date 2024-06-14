//https://leetcode.com/problems/detect-capital/
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 0)
        return true;
        int count = 0;
        int word_length = word.length();
        for(int i = 0; i < word_length; i++){
            char char1 = word.charAt(i);
            if(char1 >= 65 && char1 < 91)
            count++;
        }
        if(count == word_length)
        return true;
        if(count == 0)
        return true;
        if(count ==1 && word.charAt(0) >= 65 && word.charAt(0) < 91) return true;
        return false;

    }
}
