package tp3;

/**
 * @author Agustin Augurusa, Juan Cruz De Lorenzo, Florencia Froschauer.
 */

public class SudokuSolverTester {
    public static void main(String[] args) {
        SudokuSolver sudokuSolver = new SudokuSolver();
        int[][] grid = new int[][] {
                        {0, 7, 0, 0, 2, 0, 0, 5, 0},
                        {0, 0, 3, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 3, 0, 9, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {4, 0, 0, 0, 0, 0, 0, 9, 0},
                        {0, 0, 0, 1, 7, 0, 0, 0, 3},
                        {0, 0, 5, 0, 0, 0, 0, 0, 7},
                        {3, 0, 0, 0, 8, 6, 0, 0, 0},
                        {0, 0, 1, 0, 0, 0, 0, 0, 0}
        };

        sudokuSolver.solveSudoku(grid);
        sudokuSolver.print(grid);
    }
}
