1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<List<Integer>> generate(int numRows) {
6        List<List<Integer>> triangle = new ArrayList<>();
7        
8        if (numRows <= 0) {
9            return triangle;
10        }
11        
12        for (int i = 0; i < numRows; i++) {
13            List<Integer> row = new ArrayList<>();
14            for (int j = 0; j <= i; j++) {
15                if (j == 0 || j == i) {
16                    row.add(1);
17                } else {
18                    List<Integer> prevRow = triangle.get(i - 1);
19                    row.add(prevRow.get(j - 1) + prevRow.get(j));
20                }
21            }
22            triangle.add(row);
23        }
24        
25        return triangle;
26    }
27}
28