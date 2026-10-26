1class Solution {
2    public int closedIsland(int[][] grid) {
3        int rows = grid.length;
4        int cols = grid[0].length;
5        
6        for (int r = 0; r < rows; r++) {
7            for (int c = 0; c < cols; c++) {
8                if ((r == 0 || r == rows - 1 || c == 0 || c == cols - 1) && grid[r][c] == 0) {
9                    dfs(grid, r, c);
10                }
11            }
12        }
13        
14        int closedIslandsCount = 0;
15        for (int r = 0; r < rows; r++) {
16            for (int c = 0; c < cols; c++) {
17                if (grid[r][c] == 0) {
18                    dfs(grid, r, c);
19                    closedIslandsCount++;
20                }
21            }
22        }
23        
24        return closedIslandsCount;
25    }
26    
27    private void dfs(int[][] grid, int r, int c) {
28        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 1) {
29            return;
30        }
31        
32        grid[r][c] = 1;
33        
34        dfs(grid, r + 1, c);
35        dfs(grid, r - 1, c);
36        dfs(grid, r, c + 1);
37        dfs(grid, r, c - 1);
38    }
39}
40