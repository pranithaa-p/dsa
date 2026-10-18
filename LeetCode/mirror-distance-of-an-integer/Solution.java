1class Solution {
2    public int mirrorDistance(int n) {
3        int num = 0;
4        int temp = n;
5        while(n>0){
6            int digit = n%10;
7            num = num*10+digit;
8            n/=10;
9        }
10        if(num-temp<0) return -1*(num-temp);
11        else return num-temp;
12        
13    }
14}