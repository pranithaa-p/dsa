1class Solution {
2    public String trafficSignal(int timer) {
3        if(timer==0) return "Green";
4        else if(timer==30) return "Orange";
5        else if(timer>30 && timer<=90) return "Red";
6        else return "Invalid";
7    }
8}