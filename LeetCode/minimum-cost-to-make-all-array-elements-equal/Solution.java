1class Solution {
2    public long minCost(int[] nums) {
3        int n = nums.length;
4        if(n<=1) return 0;
5        long ans = Long.MAX_VALUE;
6
7        for(int i=0;i<n;){
8            int j=i;
9            while(j+1<n&&nums[j]==nums[j+1]) j++;
10
11            if(i<=n-2 && j>=1){
12                long cost = (long)nums[i]*(i+n-1-j);
13                ans = Math.min(ans, cost);
14            }
15            i = j+1;
16        }
17
18        HashMap<Integer, Integer> last = new HashMap<>();
19        for(int i=1;i<n-1;i++){
20            int x = nums[i];
21            if(last.containsKey(x)){
22                int prev = last.get(x);
23                if(i-prev>1){
24                    long cost = (long)x*(n-1+i-prev);
25                    ans = Math.min(ans, cost);
26                }
27            }
28           last.put(x, i); 
29        }
30        return ans;
31    }
32}