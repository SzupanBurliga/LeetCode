class Solution {
    public void rotate(int[][] matrix) {
        int matrixSize = matrix.length;
        for(int i = 0; i < matrixSize; i++){
            for(int j = i+1; j < matrixSize; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int col1 = 0;
        int col2 = matrixSize - 1;
        while(col1 < col2){
            for(int i = 0; i < matrixSize; i++){
                int temp = matrix[i][col1];
                matrix[i][col1] = matrix[i][col2];
                matrix[i][col2] = temp;
            }
            col1++;
            col2--;
        }
    }
}