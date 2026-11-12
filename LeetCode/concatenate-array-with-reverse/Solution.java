1class Solution {
2    public int[] concatWithReverse(int[] nums) {
3        int n = nums.length;
4        int[] arr = new int[2*n];
5
6        for(int i=0;i<n;i++){
7            arr[i] = nums[i];
8        }
9        for(int i=n-1;i>=0;i--){
10            arr[n++] = nums[i];
11        }
12        return arr;
13    }
14}