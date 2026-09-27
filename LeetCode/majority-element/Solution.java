1class Solution {
2    public int majorityElement(int[] nums) {        
3        HashMap<Integer, Integer> map = new HashMap<>();
4        int max = 0;
5
6        for(int num: nums){
7            map.put(num, map.getOrDefault(num, 0)+1);
8        }
9
10        for(int count: map.values()){
11            if(count>max) max = count;
12        }
13        
14        for(int key: map.keySet()){
15            if(map.get(key) == max) return key;
16        }
17        return 0;
18    }
19}