//https://leetcode.com/problems/rotate-image/
class Solution {
    public void rotate(int[][] matrix) {
    // S1 => Transpose of matrix 
        int n = matrix.length ; 
        for (int i= 0 ;i<n;i++){
            for(int j=0 ;j<i;j++){
            // Swap the elements
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp ;
        }
    }
    int a= 0 ; int b = n-1;
    while(a<b){
        // Swap the elements of the start col with end col 
        for(int i= 0 ;i<n ;i++){
            int temp = matrix[i][a];
            matrix[i][a]=matrix[i][b];
            matrix[i][b]= temp;
        }
        a++; 
        b--;
        }
    }
}
