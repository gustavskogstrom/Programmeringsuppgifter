package Programmeringsuppgift2;

import java.util.Random;
/*
 * Class responsible for generating numbers on the board.
 */
public class SudokuGenerator {
    private Board board;
    private Random random;

    // Constructor that links the generator with the board
    public SudokuGenerator(Board board){
        this.board = board;
        this.random = new Random();
    }

    // Fills the board with random numbers between 1 and 4
    public void randomNumbers(){
        int[][] boardArray = board.getBoard(); // Fetch the 2D-array representing the board

        for(int row = 0; row < 4; row++){
            for(int col = 0; col < 4; col++){
                int num = random.nextInt(4) + 1; // Generates a number between 1 and 4

                // Keeps generating a number until it is valid
                while (!board.isValid(row, col, num)) {
                    num = random.nextInt(4) + 1;
                }
                boardArray[row][col] = num; // Assign the valid number to the board position
            }
        }
    }
}
