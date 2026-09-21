1class Solution {
2    public boolean canJump(int[] nums) {
3        int maxReach = 0;
4        
5        for (int i = 0; i < nums.length; i++) {
6            if (i > maxReach) {
7                return false;
8            }
9            
10            maxReach = Math.max(maxReach, i + nums[i]);
11            if (maxReach >= nums.length - 1) {
12                return true;
13            }
14        }
15        
16        return true;
17    }
18}
19