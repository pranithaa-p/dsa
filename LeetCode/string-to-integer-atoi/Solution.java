1class Solution {
2    public int myAtoi(String s) {
3        if (s == null || s.length() == 0) {
4            return 0;
5        }
6
7        int i = 0;
8        int n = s.length();
9
10        while (i < n && s.charAt(i) == ' ') {
11            i++;
12        }
13
14        if (i == n) {
15            return 0;
16        }
17
18        int sign = 1;
19        char firstChar = s.charAt(i);
20        if (firstChar == '-') {
21            sign = -1;
22            i++;
23        } else if (firstChar == '+') {
24            i++;
25        }
26        long result = 0;
27        while (i < n) {
28            char c = s.charAt(i);
29            if (c < '0' || c > '9') {
30                break;
31            }
32
33            int digit = c - '0';
34            result = result * 10 + digit;
35            if (sign == 1 && result > Integer.MAX_VALUE) {
36                return Integer.MAX_VALUE;
37            }
38            if (sign == -1 && -result < Integer.MIN_VALUE) {
39                return Integer.MIN_VALUE;
40            }
41            i++;
42        }
43        return (int) (result * sign);
44    }
45}