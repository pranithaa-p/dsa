1class Solution {
2    public int alternatingSum(int[] nums) {
3        int even = 0;
4        int odd = 0;
5        for(int i=0;i<nums.length;i++){
6            if(i%2==0) even+=nums[i];
7            else odd+=nums[i];
8        }
9        return even - odd;
10    }
11}