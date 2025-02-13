public class M48RotateImage {
    public void rotate(int[][] matrix) {
        // transpose
        for(int i= 0; i < matrix.length; i++){
            for (int j = i; j< matrix[i].length; j++){
                //only iterate over the upper triangle (j > i). Otherwise, it will swap back
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // reverse
        for(int i= 0; i < matrix.length; i++){
            for (int j = 0; j< matrix[i].length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - j - 1];
                matrix[i][matrix[i].length - j - 1] = temp;
            }
        }
    }
}
