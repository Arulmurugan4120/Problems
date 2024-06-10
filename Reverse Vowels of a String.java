//https://leetcode.com/problems/reverse-vowels-of-a-string/
class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels=new HashSet<>();
        vowels.add('a');    vowels.add('A');
        vowels.add('e');    vowels.add('E');
        vowels.add('i');    vowels.add('I');
        vowels.add('o');    vowels.add('O');
        vowels.add('u');    vowels.add('U');

        char[] ch=s.toCharArray();
        int left=0, right=ch.length-1;

        while(left < right){
            while(left < right && !vowels.contains(Character.toLowerCase(ch[left]))) {
                left++;
            }
            while(left < right && !vowels.contains(Character.toLowerCase(ch[right]))) {
                right--;
            }

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }
        return new String(ch);
    }
}
