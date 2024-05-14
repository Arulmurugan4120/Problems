//https://leetcode.com/problems/set-matrix-zeroes/description/
class Solution {
    public void setZeroes(int[][] matrix) {
        int a=matrix.length;
        int b=matrix[0].length;
        int[] row=new int[a];
        int[] column=new int[b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    column[j]=1;
                }
            }
        }
        for(int i=0;i<a;i++){
            if(row[i]==1){
                for(int j=0;j<b;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<b;i++){
            if(column[i]==1){
                for(int j=0;j<a;j++){
                    matrix[j][i]=0;
                }
            }
        } 
    }
}
