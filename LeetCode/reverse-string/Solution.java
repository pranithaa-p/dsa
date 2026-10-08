1class Solution {
2    public void reverseString(char[] s) {
3        int left = 0;
4        int right = s.length - 1;
5        while (left < right) {
6            char temp = s[left];
7            s[left] = s[right];
8            s[right] = temp;
9            left++;
10            right--;
11        }
12    }
13}
14