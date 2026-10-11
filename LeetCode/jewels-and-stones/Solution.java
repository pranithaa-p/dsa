1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3
4        int count = 0;
5        for(int i = 0; i < jewels.length(); i++){
6            for(int j = 0; j < stones.length(); j++){
7                if(stones.charAt(j) == jewels.charAt(i)){
8                    count++;
9                }   
10            }
11        }
12        return count;
13    }
14}