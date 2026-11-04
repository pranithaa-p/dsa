1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<List<Integer>> combinationSum(int[] candidates, int target) {
6        List<List<Integer>> res = new ArrayList<>();
7        backtrack(0, candidates, target, 0, new ArrayList<>(), res);
8        return res;
9    }
10
11    private void backtrack(int i, int[] candidates, int target, int curSum, 
12        List<Integer> current, List<List<Integer>> res) {
13        if (curSum == target) {
14            res.add(new ArrayList<>(current));
15            return;
16        }
17        if (curSum > target || i >= candidates.length) {
18            return;
19        }
20
21        current.add(candidates[i]);
22        backtrack(i, candidates, target, curSum + candidates[i], current, res);
23        
24        current.remove(current.size() - 1);
25
26        backtrack(i + 1, candidates, target, curSum, current, res);
27    }
28}
29