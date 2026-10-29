1class Solution {
2    public int[] findDegrees(int[][] matrix) {
3        int n = matrix.length;
4        int[] ans = new int[n];
5        for (int i = 0; i < n; ++i) {
6            for (int x : matrix[i]) {
7                ans[i] += x;
8            }
9        }
10        return ans;
11    }
12}