1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder sb = new StringBuilder();
4        int opened = 0;
5        
6        for (char c : s.toCharArray()) {
7            if (c == '(') {
8                if (opened > 0) {
9                    sb.append(c);
10                }
11                opened++;
12            } else {
13                opened--;
14                if (opened > 0) {
15                    sb.append(c);
16                }
17            }
18        }
19        
20        return sb.toString();
21    }
22}
23