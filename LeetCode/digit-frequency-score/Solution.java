1class Solution {
2    public int digitFrequencyScore(int n) {
3        int ans = 0;
4        for (; n > 0; n /= 10) {
5            ans += n % 10;
6        }
7        return ans;
8    }
9}