import java.util.ArrayList;
import java.util.List;

public class M54SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;
        int left = 0;
        int top = 0;
        List<Integer> res = new ArrayList<>();
        while (top<=row && left<=col){
            for (int i = left;i<=col;i++){
                res.add(matrix[top][i]);
            }
            top+=1;
            for (int j = top;j<=row;j++){
                res.add(matrix[j][col]);
            }
            col-=1;
            if(top<=row){
                for (int m = col;m>=left;m--){
                    res.add(matrix[row][m]);
                }}
            row-=1;
            if(left<=col){
                for(int n = row; n>=top;n--){
                    res.add(matrix[n][left]);
                }}
            left+=1;
        }
        return res;

    }
}
