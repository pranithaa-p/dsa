1class Solution {
2    public int[] maxDepthAfterSplit(String seq) {
3        int n = seq.length();
4        int[] answer = new int[n];
5        int depth = 0;
6
7        for (int i = 0; i < n; i++) {
8            if (seq.charAt(i) == '(') {
9                depth++;
10                answer[i] = depth % 2;
11            } else {
12                answer[i] = depth % 2;
13                depth--;
14            }
15        }
16
17        return answer;
18    }
19}
20