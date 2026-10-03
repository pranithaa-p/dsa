1public class Solution {
2    public int removeDuplicates(int[] nums) {
3        if (nums == null || nums.length == 0) {
4            return 0;
5        }
6        
7        int i = 0;
8        for (int j = 1; j < nums.length; j++) {
9            if (nums[j] != nums[i]) {
10                i++;
11                nums[i] = nums[j];
12            }
13        }
14        
15        return i + 1;
16    }
17}
18