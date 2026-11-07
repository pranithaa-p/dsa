1class Solution {
2    public long countValidSubstrings(String s) {
3        int n = s.length();
4
5        int a = -1;
6        int ab = -1;
7        int abc = -1;
8
9        long count = 0;
10
11        for(int i=0;i<n;i++){
12            char ch = s.charAt(i);
13
14            if(ch == 'a'){
15                a = i;
16            }else if(ch == 'b'){
17                if(a!= -1){
18                    ab = a;
19                }
20            }else if(ch == 'c'){
21                if(ab!=-1){
22                    abc = Math.max(abc, ab);
23                }
24            }
25            count+=i-abc;
26        }
27        return count;
28    }
29}