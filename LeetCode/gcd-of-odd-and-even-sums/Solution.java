1class Solution {
2    public int gcdOfOddEvenSums(int n) {
3        int evenSum = 0;
4        int oddSum = 0;
5        int gcd = 0;
6        for(int i=1;i<=2*n;i++){
7            if(i%2==0) evenSum+=i;
8            else oddSum+=i;
9        }
10        for(int i=1;i<=evenSum && i<=oddSum;i++){
11            if(evenSum % i == 0 && oddSum % i == 0)
12                gcd = i;
13        }
14        return gcd;
15    }
16}