//https://leetcode.com/problems/isomorphic-strings/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char original = s.charAt(i);
            char mapped = t.charAt(i);
            if(!map.containsKey(original)){
                if(!map.containsValue(mapped)){
                    map.put(original,mapped);
                }
                else{
                    return false;
                }
            }
            else{
                char ch=map.get(original);
                if(ch != mapped){
                    return false;
                }
            }
        }
        return true;
    }
}
