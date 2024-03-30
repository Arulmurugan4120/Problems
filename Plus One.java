//https://leetcode.com/problems/plus-one/description/
class Solution {
    public int[] plusOne(int[] digits) {
        int alen=digits.length;
        for(int i=alen-1;i >= 0;i--){
            if(digits[i] < 9){
            digits[i]++;
            return digits;
        }
        digits[i]=0;
    }
    int[] newarr = new int[alen + 1];
    newarr[0]=1;
    return newarr;
}
}
