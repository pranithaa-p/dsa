1import java.util.Arrays;
2
3class Solution {
4    public long maxAlternatingSum(int[] nums) {
5        int n = nums.length;
6        long[] sq = new long[n];
7        for (int i = 0; i < n; i++) {
8            sq[i] = (long) nums[i] * nums[i];
9        }
10        Arrays.sort(sq);
11        long ans = 0;
12        int m = n / 2;
13        for (int i = 0; i < n; i++) {
14            if (i < m) {
15                ans -= sq[i];
16            } else {
17                ans += sq[i];
18            }
19        }
20        return ans;
21    }
22}
23