class Solution {
    static boolean findEmptySpace(char[][] board ,int[] emptySpace){

        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(board[i][j] == '.'){
                    //empty space ki row store krenge 
                      emptySpace[0] = i;
                      // empty space ki col ka index store krenge 
                      emptySpace[1] = j;
                      return true;
                }
            }
        }
        return false;
    }
    static boolean isSafeToPlace(char[][] board, char charValue , int rowIndex , int colIndex){
        // check horizontal or same row isme row ka index same rhega or col ka index 0 to <9 tak jayega
        for(int col =0 ; col<9; col++){
            if(board[rowIndex][col] == charValue){
                return false;
            }
        }
        // check vertical or same column isme column index same rhega or row index 0 to <9 jayega
        for(int row = 0; row<9; row++){
            if(board[row][colIndex] == charValue){
                return false;
            }
        }
        //check current 3*3 sub box
        int startRow = rowIndex - rowIndex%3;
        int startCol = colIndex - colIndex%3;
        for(int i =0 ; i<3;i++){
            for(int j=0;j<3;j++){
                int actualRow = startRow + i;
                int actualCol = startCol + j;
                if(board[actualRow][actualCol] == charValue){
                    return false;
                }
            }
        }
        // SAFE PLACE HAI VALUE DALNE K LIYE
        return true;
    }
    static boolean  solveSudokuHelper(char[][] board){
        int[] emptySpace = new int[2];
        if(!findEmptySpace(board , emptySpace)){
            return true;
        }
        int rowIndex = emptySpace[0];
        int colIndex = emptySpace[1];
        for(int value = 1; value<=9 ; value++){
            char charValue = (char)(value + '0');
            if(isSafeToPlace (board , charValue, rowIndex , colIndex)){
                board[rowIndex][colIndex] = charValue;
                if(solveSudokuHelper(board) == true){
                    return true;
                }
                //agar recursion solve na kar paye or wapish aayega to current current value undo kr denge or backtracking krenge
                board[rowIndex][colIndex] = '.';

            }
        }
                    // agar fir bhisolve na ho paye 
            return false;

    }
    public void solveSudoku(char[][] board) {
        solveSudokuHelper(board);
    }
}