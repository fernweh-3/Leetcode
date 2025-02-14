public class N59SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int row = n - 1;
        int col = n - 1;
        int left = 0;
        int top = 0;
        int num = 1;
        int[][] res = new int[n][n];
        while (top<=row && left<=col){
            for (int i = left;i<=col;i++){
                res[top][i] = num;
                num+=1;
            }
            top+=1;
            for (int j = top;j<=row;j++){
                res[j][col] = num;
                num+=1;
            }
            col-=1;
            if(top<=row){
                for (int m = col;m>=left;m--){
                    res[row][m] = num;
                    num+=1;
                }}
            row-=1;
            if(left<=col){
                for(int i = row; i>=top;i--){
                    res[i][left] = num;
                    num+=1;
                }}
            left+=1;
        }
        return res;
    }
}
