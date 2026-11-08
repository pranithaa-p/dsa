1import java.util.*;
2
3class Solution {
4    public int countSuffix(int[] nums, int[] target) {
5       int n = nums.length;
6        int count = 0;
7
8        Map<Integer, Integer> map = new HashMap<>();
9        
10        for(int i=0;i<n;i++){
11            update(map, nums[i], 1);
12            update(map, target[i], -1);
13        }
14        
15        boolean[] sorted = new boolean[n];
16        sorted[n-1] = true;
17
18        for(int i=n-2;i>=0;i--)
19            sorted[i] = sorted[i+1] && target[i]>=target[i+1];
20
21            boolean prefix = true;
22
23            for(int i=0;i<n;i++){
24                if(prefix && sorted[i] && map.isEmpty()) count++;
25
26                if(nums[i]!=target[i]) prefix = false;
27
28                update(map, nums[i], -1);
29                update(map, target[i], 1);
30            }
31        return count;
32    }
33    
34    void update(Map<Integer, Integer> map, int x, int d){
35        int val = map.getOrDefault(x, 0) + d;
36
37        if(val == 0) map.remove(x);
38        else map.put(x, val);
39    }
40}