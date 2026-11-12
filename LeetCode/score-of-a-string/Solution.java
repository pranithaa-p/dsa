1class Solution {
2    public int scoreOfString(String s) {
3        int sum = 0;
4        for(int i=0;i<s.length()-1;i++){
5                int num = s.charAt(i) - s.charAt(i+1);
6                if(num<0) num = -1*num;
7                sum+=num;
8        }
9        return sum;
10    }
11}