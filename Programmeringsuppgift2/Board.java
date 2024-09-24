package Programmeringsuppgift2;

/*
 * Class that manages the board and its methods.
 */
public class Board {
    
    // A 4x4 board initialized with zeros
    private int[][] board = {
        {0, 0, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 0}
    };
    
    public int[][] getBoard() {
        return board;
    }

    public boolean isValid(int row, int col, int num) {

        // Check if the number already exists in the row or column
        for(int i = 0; i < 4; i++){
            if(board[row][i] == num || board[i][col] == num){
                return false; // Not valid if number is found.
            }
        }

        // Check 2x2 grid for duplicates
        int startRow = (row / 2) * 2;
        int startCol = (col / 2) * 2;
        for(int r = startRow; r < startRow + 2; r++){
            for(int c = startCol; c < startCol + 2; c++){
                if(board[r][c] == num){
                    return false; // Not valid if there is duplicates
                }
            }
        }
        return true; // Valid if there are no duplicates.
    }
    
    /*
     * Prints the board in the console with all the numbers.
     */
    public void printBoard(){
        for(int row = 0; row < 4; row++){
            for(int col = 0; col < 4; col++){
                System.out.print(board[row][col] + " ");
            }
            System.out.println(); // Move to next line after each row.
        }
    }
}
