1import java.util.Arrays;
2
3class Solution {
4    public int minMoves2(int[] nums) {
5        Arrays.sort(nums);
6        int median = nums[nums.length / 2];
7        int moves = 0;
8        for (int num : nums) {
9            moves += Math.abs(num - median);
10        }
11        return moves;
12    }
13}
14