1class Solution {
2    public long sumAndMultiply(int n) {
3        String s = Integer.toString(n);
4        long sum = 0, ans = 0;
5        for (int i = 0; i < s.length(); i++) {
6            int digit = s.charAt(i) - '0';
7            if (digit != 0) {
8                sum += digit;
9                ans = ans * 10 + digit;
10            }
11        }
12        return ans * sum;
13    }
14}
15