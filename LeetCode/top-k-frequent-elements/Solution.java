1import java.util.*;
2
3class Solution {
4    public int[] topKFrequent(int[] nums, int k) {
5        Map<Integer, Integer> count = new HashMap<>();
6        for (int num : nums) {
7            count.put(num, count.getOrDefault(num, 0) + 1);
8        }
9
10        PriorityQueue<Integer> heap = new PriorityQueue<>(
11            (a, b) -> count.get(a) - count.get(b)
12        );
13
14        for (int num : count.keySet()) {
15            heap.add(num);
16            if (heap.size() > k) {
17                heap.poll();
18            }
19        }
20
21        int[] result = new int[k];
22        for (int i = 0; i < k; i++) {
23            result[i] = heap.poll();
24        }
25
26        return result;
27    }
28}
29