1import java.util.HashMap;
2import java.util.Map;
3
4public class Solution {
5    public int[] twoSum(int[] nums, int target) {
6        Map<Integer, Integer> map = new HashMap<>();
7        
8        for (int i = 0; i < nums.length; i++) {
9            int complement = target - nums[i];
10            
11            if (map.containsKey(complement)) {
12                return new int[] { map.get(complement), i };
13            }
14            
15            map.put(nums[i], i);
16        }
17        
18        return new int[] {};
19    }
20}
21