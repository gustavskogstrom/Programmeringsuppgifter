package Programmeringsuppgift2;

/**
 * Main class that runs the program.
 */
public class Main {
    public static void main(String[] args) {
        
        // Create a new board and generator to fill the board with numbers
        Board board = new Board();
        SudokuGenerator generator = new SudokuGenerator(board);
        generator.randomNumbers();

        // Print the board to the console
        board.printBoard();
    }
}
