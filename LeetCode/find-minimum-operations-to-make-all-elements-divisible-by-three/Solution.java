1class Solution {
2    public int minimumOperations(int[] nums) {
3        int count = 0;
4        for(int i=0;i<nums.length;i++){ 
5            if(nums[i]%3!=0) count++;
6        }
7        return count;
8    }
9}