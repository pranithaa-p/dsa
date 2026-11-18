1class Solution {
2    public int[] transformArray(int[] nums) {
3        int n = nums.length;
4        int res[] = new int[n];
5        for(int i=0;i<n;i++){
6            if(nums[i]%2==0) res[i] = 0;
7            else res[i] = 1; 
8        }
9        Arrays.sort(res);
10        return res;
11    }
12}