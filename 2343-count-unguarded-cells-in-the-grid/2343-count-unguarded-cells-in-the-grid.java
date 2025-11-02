class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];

        for (int[] wall : walls) {
            int row = wall[0];
            int col = wall[1];
            grid[row][col] = 1; 
        }
        for (int[] guard : guards) {
            int row = guard[0];
            int col = guard[1];
            grid[row][col] = 1; 
        }
        // pomocniczo do ruchu
        int[] dr = {-1, 1, 0, 0}; 
        int[] dc = {0, 0, 1, -1}; 

        for (int[] guard : guards) {
            int startRow = guard[0];
            int startCol = guard[1];
            for (int i = 0; i < 4; i++) {
                int row = startRow + dr[i];
                int col = startCol + dc[i];

                while (row >= 0 && row < m && col >= 0 && col < n) {
                    if (grid[row][col] == 1) {
                        break;
                    }
                    if (grid[row][col] == 0) {
                        grid[row][col] = 2;
                    }
                    row += dr[i];
                    col += dc[i];
                }
            }
        }
        int count = 0;
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] == 0) {
                    count++;
                }
            }
        }
        
        return count;
    }
}