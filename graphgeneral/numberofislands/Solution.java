package graphgeneral.numberofislands;

public class Solution {
    private boolean[][] visited;
    private int rows;
    private int cols;

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        rows = grid.length;
        cols = grid[0].length;
        int count = 0;

        visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    ++count;
                    dfs(grid, i, j);
                }
            }

        }


        return count;
    }


    public void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == '0' || visited[i][j]) {
            return;
        }

        visited[i][j] = true;

        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }

}
