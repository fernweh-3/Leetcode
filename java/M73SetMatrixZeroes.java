import java.util.HashSet;
import java.util.Set;

public class M73SetMatrixZeroes {

    // Brute Force
    public void setZeroesBF(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int i: row){
            for (int j = 0; j < cols; j++){
                matrix[i][j] = 0;
            }
        }
        for(int j :col){
            for(int i = 0; i<rows;i++){
                matrix[i][j]=0;
            }
        }
    }


    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int col0 = 1;
        // int[] row = new int[n];
        // int[] coloumn=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;// Mark row i in first column
                    if(j!=0){
                        matrix[0][j]=0;} // Mark column j in first row if j!=0
                    else col0=0; // Special case: Mark first column
                }
            }
        }
//        Zero out elements using markers (except first row & column)
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0 ){
                    matrix[i][j]=0;
                }
            }
        }
//        Zero out the first row if needed
        if(matrix[0][0]==0){
            for (int j = 0; j < m; j++) {
                matrix[0][j]=0;
            }
        }
//        Zero out the first column if needed
        if(col0==0){
            for (int i = 0; i < n; i++) {
                matrix[i][0]=0;
            }
        }

    }
}
