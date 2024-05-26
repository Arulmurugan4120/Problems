//https://leetcode.com/problems/find-a-peak-element-ii/description/
class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int max = Integer.MIN_VALUE;
        int[] res = new int[2];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(max < mat[i][j]){
                    max = mat[i][j];
                    res[0] = i;
                    res[1] = j;
                }
            }
        }

        return res;
    }
}
