1class Solution {
2    public int titleToNumber(String columnTitle) {
3        int result = 0;
4        for (int i = 0; i < columnTitle.length(); i++) {
5            int val = columnTitle.charAt(i) - 'A' + 1;
6            result = result * 26 + val;
7        }
8        return result;
9    }
10}