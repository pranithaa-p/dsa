1class Solution {
2    public int consecutiveNumbersSum(int n) {
3        int ans = 0;
4        for (int i = 1; i * i <= n; i++) {
5            if (n % i > 0) {
6                continue;
7            }
8            int j = n / i;
9            if (i % 2 == 1) {
10                ans++;
11            }
12            if (j != i && j % 2 == 1) {
13                ans++;
14            }
15        }
16        return ans;
17    }
18}