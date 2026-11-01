1class Solution {
2    public long minimumMaxValue(int n, int index, int value) {
3        
4        if(value==1 && n>1) return -1;
5        long fact = getFact(value);
6
7        long left = value - fact -2L*(index-1);
8        if(index>0 && left<=0) return -1;
9
10        long right = value;
11        if(index< n-1)
12            right = value + fact + 2L*(n-index-2);
13
14        return right;
15    }
16
17    public long getFact(long number){
18        for(long i=2;i*i<=number;i++)
19            if(number%i==0) return i;
20        return number;
21    }
22}