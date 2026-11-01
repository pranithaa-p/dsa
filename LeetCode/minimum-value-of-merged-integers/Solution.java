1class Solution {
2    public int minMergedInteger(int[] nums) {
3        int arr = 0;
4        int minimum = Integer.MAX_VALUE;
5        for(int i=0;i<nums.length;i++){
6            if(i%2==0 && (i+1)%2!=0)
7                arr = Integer.parseInt("" + nums[i] + nums[i+1]);
8            minimum = Math.min(arr, minimum);
9        }
10        return minimum;
11    }
12}