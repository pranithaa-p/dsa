1class Solution {
2    public int minElement(int[] nums) {
3        int minimum = Integer.MAX_VALUE;
4        
5        for(int i = 0;i<nums.length;i++){
6            int sum = 0;
7            while(nums[i]>0){
8            int digit = nums[i]%10;
9            sum+=digit;
10            nums[i]/=10;
11            }
12            minimum = Math.min(minimum, sum);
13        }
14        return minimum;
15    }
16}