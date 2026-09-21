1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        HashSet<Integer> set = new HashSet<>();
4        HashSet<Integer> intersection = new HashSet<>();
5
6        for(int x: nums1){
7            set.add(x);
8        }
9
10        for(int x: nums2){
11            if(set.contains(x)){
12                intersection.add(x);
13            }
14        }
15
16        int result[] = new int[intersection.size()];
17        int i = 0;
18
19        for(int x: intersection){
20            result[i++] = x;
21        }
22        return result;
23    }
24}