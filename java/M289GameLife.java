public class M289GameLife {

    // make a copy of the board
    public void gameOfLifeCopy(int[][] board) {
        int[] neighbors = {0, 1, -1};

        int rows = board.length;
        int cols = board[0].length;

        // copy the board
        int[][] copyBoard = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                copyBoard[row][col] = board[row][col];
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                // check neighbors
                int liveNeighbors = 0;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        if (!(neighbors[i] == 0 && neighbors[j] == 0)) {
                            int r = (row + neighbors[i]);
                            int c = (col + neighbors[j]);

                            if ((r < rows && r >= 0) && (c < cols && c >= 0) && (copyBoard[r][c] == 1)) {
                                liveNeighbors += 1;
                            }
                        }
                    }
                }

                // rule 1/ 3
                if ((copyBoard[row][col] == 1) && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[row][col] = 0;
                }
                // rule 4
                if (copyBoard[row][col] == 0 && liveNeighbors == 3) {
                    board[row][col] = 1;
                }
            }
        }
    }

    //Encoding State Changes, Since the board must be updated in-place,
    // we cannot immediately overwrite 1 or 0 before checking all neighbors.
//    Old State → New State	Encoded Value
//            0 → 1 (dead → live)	3
//            1 → 0 (live → dead)	2
//            0 → 0 (dead → dead)	0
//            1 → 1 (live → live)	1

//    8 possible neighbors
    int[][] dir ={{1,-1},{1,0},{1,1},{0,-1},{0,1},{-1,-1},{-1,0},{-1,1}};
    public void gameOfLife(int[][] board) {
//        mark the board
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int live=0;
                for(int[] d:dir){
                    if(d[0]+i<0 || d[0]+i>=board.length || d[1]+j<0 || d[1]+j>=board[0].length) continue;
                    //Counts live neighbors by checking 1 (live) and 2 (was live but will die).
                    if(board[d[0]+i][d[1]+j]==1 || board[d[0]+i][d[1]+j]==2) live++;
                }
                if(board[i][j]==0 && live==3) board[i][j]=3;    // 0 → 1 (dead → live)
                if(board[i][j]==1 && (live<2 || live>3)) board[i][j]=2;     // 1 → 0 (live → dead)
            }
        }

//         Final State Update
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j] %=2;
            }
        }
}
