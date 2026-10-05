1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<List<Integer>> permute(int[] nums) {
6        List<List<Integer>> result = new ArrayList<>();
7        backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);
8        return result;
9    }
10
11    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] used) {
12        if (tempList.size() == nums.length) {
13            result.add(new ArrayList<>(tempList));
14            return;
15        }
16        
17        for (int i = 0; i < nums.length; i++) {
18            if (used[i]) continue;
19            used[i] = true;
20            tempList.add(nums[i]);
21            backtrack(result, tempList, nums, used);
22            tempList.remove(tempList.size() - 1);
23            used[i] = false;
24        }
25    }
26}
27