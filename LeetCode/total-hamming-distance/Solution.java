1class Solution {
2    public int totalHammingDistance(int[] nums) {
3        int ans = 0, n = nums.length;
4        for (int i = 0; i < 32; ++i) {
5            int a = 0;
6            for (int x : nums) {
7                a += (x >> i & 1);
8            }
9            int b = n - a;
10            ans += a * b;
11        }
12        return ans;
13    }
14}