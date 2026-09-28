1class Solution {
2    public int lengthOfLastWord(String s) {
3        int count = 0;
4        for(int i=s.length()-1;i>=0;i--){
5            if(s.charAt(i)==' ' && count==0) continue;
6            if(s.charAt(i)!=' ') count++;
7            else break;
8        }
9        return count;
10    }
11}