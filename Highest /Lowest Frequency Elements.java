//
import java.util.HashMap;
import java.util.Map;
public class Solution {
    public static int[] getFrequencies(int []v) {
        // Write Your Code Here
        Map<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<v.length;i++){
            mp.put(v[i],mp.getOrDefault(v[i], 0) +1);
        }
        int maxfreq=Integer.MIN_VALUE;
        int maxKey=-1;
        int minfreq=Integer.MAX_VALUE;
        int minKey=-1;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            int freq=entry.getValue();
            if(freq>maxfreq || ((freq==maxfreq) &&  (entry.getKey()<maxKey))){
                maxfreq=entry.getValue();
                maxKey=entry.getKey();
            }
            if(freq<minfreq || ((freq==minfreq) && (entry.getKey()<minKey))){
                minfreq=entry.getValue();
                minKey=entry.getKey();
            }
            
        }
        return new int[] {maxKey,minKey};
    }
}
