package tp3;

/**
 * @author Agustin Augurusa, Juan Cruz De Lorenzo, Florencia Froschauer.
 */

public class SudokuSolver {

    public boolean solveSudoku(int[][] grid) {
        int row = -1;
        int column = -1;
        boolean isEmpty = true;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] == 0) {
                    row = i;
                    column = j;
                    isEmpty = false;
                    break;
                }
            }

            if (!isEmpty) {
                break;
            }
        }

        if (isEmpty) {
            return true;
        }

        for (int i = 1; i <= grid.length; i++) {
            if (checkNumber(grid, row, column, i)) {
                grid[row][column] = i;
                if (solveSudoku(grid)) {
                    return true;
                }
                else {
                    grid[row][column] = 0;
                }
            }
        }
        return false;
    }

    /**
     * Check if the number can be a possible solution.
     */

    public boolean checkNumber(int[][] grid, int row, int column, int number) {
        return uniqueNumberInColumn(grid, column, number) && uniqueNumberInRow(grid, row, number) &&
                uniqueNumberInGrid(grid, row, column, number);
    }

    /**
     *  Returns false if the number is already in the column, and true if it isn't.
     */

    private boolean uniqueNumberInColumn(int[][] grid, int column, int number) {
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][column] == number) {
                return false;
            }
        } return true;
    }

    /**
     *  Returns false if the number is already in the row, and true if it isn't.
     */

    private boolean uniqueNumberInRow(int[][] grid, int row, int number) {
        for (int i = 0; i < grid.length; i++) {
            if (grid[row][i] == number) {
                return false;
            }
        } return true;
    }

    /**
     *  Returns false if the number is already in the 3x3 grid, and true if it isn't.
     */

    private boolean uniqueNumberInGrid(int[][] grid, int row, int column, int number) {
        int gridRow = row - row % 3;
        int gridColumn = column - column % 3;

        for (int i = gridRow; i < gridRow + 3; i++) {
            for (int j = gridColumn; j < gridColumn + 3; j++) {
                if (grid[i][j] == number) {
                    return false;
                }
            }

        } return true;
    }

    public void print(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int d = 0; d < grid.length; d++) {
                System.out.print(grid[i][d]);
                System.out.print(" ");
            }
            System.out.print("\n");

            if ((i + 1) % (int) Math.sqrt(grid.length) == 0) {
                System.out.print("");
            }
        }
    }
}
