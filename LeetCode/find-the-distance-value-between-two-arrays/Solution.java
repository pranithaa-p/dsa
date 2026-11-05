1import java.util.Arrays;
2
3class Solution {
4    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
5        Arrays.sort(arr2);
6        int count = 0;
7        for (int v : arr1) {
8            int idx = Arrays.binarySearch(arr2, v);
9            if (idx < 0) {
10                idx = -idx - 1;
11                boolean valid = true;
12                if (idx < arr2.length && Math.abs(arr2[idx] - v) <= d) {
13                    valid = false;
14                }
15                if (idx > 0 && Math.abs(arr2[idx - 1] - v) <= d) {
16                    valid = false;
17                }
18                if (valid) {
19                    count++;
20                }
21            }
22        }
23        return count;
24    }
25}
26