//https://leetcode.com/problems/first-unique-character-in-a-string/
class Solution {
    public int firstUniqChar(String s) {
        char ch[] = s.toCharArray();
        for(int i = 0; i < ch.length; i++){
            boolean flag = true;
            for(int j = 0; j < ch.length; j++){
                if(i != j && ch[i] == ch[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return i;
            }
        }
        return -1;
    }
}
