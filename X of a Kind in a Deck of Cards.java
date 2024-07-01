//https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:deck){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int gcd=0;
        for(int freq:map.values()){
            gcd=gcd(gcd,freq);
        }
        
        return gcd>1;
    }
    public int gcd(int num1,int num2){
        return num2==0?num1:gcd(num2,num1%num2);
    }
}
