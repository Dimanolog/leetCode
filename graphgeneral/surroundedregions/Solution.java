package graphgeneral.surroundedregions;

public class Solution {
    public static final char OCHAR = 'O';
    public static final char TEMP_CHAR = 'T';
    public static final char XCHAR = 'X';
    private int rows;
    private int cols;


    public void solve(char[][] board) {

        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }


        rows = board.length;
        cols = board[0].length;

        int lastColIndex = cols - 1;
        int lastRowIndex = rows - 1;


        for (int row = 0; row < rows; row++) {
            if (board[row][0] == OCHAR) {
                graphDfs(board, row, 0);
            }

            if (board[row][lastColIndex] == OCHAR) {
                graphDfs(board, row, lastColIndex);
            }
        }

        for (int col = 0; col < cols; col++) {
            if (board[0][col] == OCHAR) {
                graphDfs(board, 0, col);
            }

            if (board[lastRowIndex][col] == OCHAR) {
                graphDfs(board, lastRowIndex, col);
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] == OCHAR) {
                    board[row][col] = XCHAR;
                } else if (board[row][col] == TEMP_CHAR) {
                    board[row][col] = OCHAR;
                }
            }
        }
    }

    private void graphDfs(char[][] board, int row, int column) {
        if (row < 0 || column < 0 || row >= rows || column >= cols) {
            return;
        }

        char c = board[row][column];

        if (c == TEMP_CHAR || c == XCHAR) {
            return;
        }

        if (c == OCHAR) {
            board[row][column] = TEMP_CHAR;
        }

        graphDfs(board, row - 1, column);
        graphDfs(board, row + 1, column);
        graphDfs(board, row, column - 1);
        graphDfs(board, row, column + 1);

    }

}
