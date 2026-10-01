1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st = new Stack<>();
4
5        for (char ch : s.toCharArray()) {
6
7            if (ch == '(' || ch == '{' || ch == '[') {
8                st.push(ch);
9            } else {
10
11                if (st.isEmpty()) {
12                    return false;
13                }
14
15                char top = st.pop();
16
17                if ((ch == ')' && top != '(') ||
18                    (ch == '}' && top != '{') ||
19                    (ch == ']' && top != '[')) {
20                    return false;
21                }
22            }
23        }
24
25        return st.isEmpty();
26    }
27}