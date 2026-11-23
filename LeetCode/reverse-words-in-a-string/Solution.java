1class Solution {
2    public String reverseWords(String s) {
3        StringBuilder result = new StringBuilder();
4        int i = s.length() - 1;
5
6        while (i >= 0) {
7            while (i >= 0 && s.charAt(i) == ' ') {
8                i--;
9            }
10            if (i < 0) {
11                break;
12            }
13            int end = i;
14            while (i >= 0 && s.charAt(i) != ' ') {
15                i--;
16            }
17            int start = i + 1;
18
19            if (result.length() > 0) {
20                result.append(' ');
21            }
22            result.append(s, start, end+ 1);
23        }
24        return result.toString();
25    }
26}