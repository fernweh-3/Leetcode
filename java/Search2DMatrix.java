public class Search2DMatrix {
    public boolean searchMatrix1(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, bottom = m -1;
        while(top <= bottom){
            int row = (top + bottom)/2;
            if (target > matrix[row][n-1]){
                top = row +1;
            }else if(target < matrix[row][0]){
                bottom = row-1;
            }else{
                break;
            }
        }

        // if (!(top <= bottom)){
        //     return false;
        // }
        int row = (top + bottom)/2;
        int left = 0, right = n-1;
        while (left<= right){
            int mid = (left + right) /2;
            if(target > matrix[row][mid]){
                left = mid + 1;
            }else if (target<matrix[row][mid]){
                right = mid - 1;
            }else{
                return true;
            }
        }
        return false;
    }
    public boolean searchMatrix2(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int l = 0, r = ROWS* COLS-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            int row = mid/COLS, col = mid%COLS;
            if (target > matrix[row][col]){
                l = mid + 1;
            }else if (target < matrix[row][col]){
                r = mid - 1;
            }else{
                return true;
            }
        }
        return false;
    }
}
