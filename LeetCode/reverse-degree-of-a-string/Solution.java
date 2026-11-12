1class Solution {
2    public int reverseDegree(String s) {
3        int mult = 1;
4        int sum = 0;
5        for(int i=0;i<s.length();i++){
6            int num = 'z' - s.charAt(i) + 1;
7            mult = (i+1)*num;
8            sum+=mult;
9        }
10        return sum;
11    }
12}