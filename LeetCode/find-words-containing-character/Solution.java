1class Solution {
2    public List<Integer> findWordsContaining(String[] words, char x) {
3        List<Integer> res = new ArrayList<>();
4
5        for(int i=0;i<words.length;i++){
6            for(char ch: words[i].toCharArray()){
7                if(ch==x) {
8                    res.add(i);
9                    break;
10                }
11            }
12        }
13        return res;
14    }
15}