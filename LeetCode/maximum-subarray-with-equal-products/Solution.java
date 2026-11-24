1class Solution {
2    public int maxLength(int[] nums) {
3        int n = nums.length;
4        int ans = 0;
5
6        for (int i =0; i <n; i++) {
7            long prod = 1;
8            long g = 0;
9            long l = 1;
10
11            for (int j = i; j < n; j++) {
12                long x = nums[j];
13                if (prod > Long.MAX_VALUE / x) {
14                    break;
15                }
16
17                prod *= x;
18                g = (g == 0) ? x : gcd(g, x);
19                l = lcm(l, x);
20
21                if (prod == l * g) {
22                    ans = Math.max(ans, j - i + 1);
23                } else if (prod > l * g) {
24                    break;
25                }
26            }
27        }
28        return ans;
29    }
30
31    private long gcd(long a, long b) {
32        while (b != 0) {
33            long t = b;
34            b = a % b;
35            a = t;
36        }
37        return a;
38    }
39    private long lcm(long a, long b) {
40        return (a/gcd(a, b))* b;
41    }
42}