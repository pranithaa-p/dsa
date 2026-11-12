1class Solution {
2    public int[] recoverOrder(int[] order, int[] friends) {
3        int[] res = new int[friends.length];
4        int idx = 0;
5
6        for (int i = 0; i < order.length; i++) {
7            for (int j = 0; j < friends.length; j++) {
8                if (order[i] == friends[j]) {
9                    res[idx++] = order[i];
10                    break;
11                }
12            }
13        }
14        return res;
15    }
16}