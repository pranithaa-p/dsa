1class Solution {
2    public int findClosest(int x, int y, int z) {
3        int xz = Math.abs(x - z);
4        int yz = Math.abs(y - z);
5        
6        if (xz == yz) {
7            return 0;
8        }
9        return xz < yz ? 1 : 2;
10    }
11}
12