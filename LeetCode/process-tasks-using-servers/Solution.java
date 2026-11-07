1class Solution {
2    class Server {
3        long weight;
4        int index;
5        long freeTime;
6
7        Server(long weight, int index, long freeTime) {
8            this.weight = weight;
9            this.index = index;
10            this.freeTime = freeTime;
11        }
12    }
13
14    public int[] assignTasks(int[] servers, int[] tasks) {
15        int n = servers.length;
16        int m = tasks.length;
17        int[] ans = new int[m];
18
19        PriorityQueue<Server> free = new PriorityQueue<>((a, b) -> {
20            if (a.weight != b.weight) {
21                return Long.compare(a.weight, b.weight);
22            }
23            return Integer.compare(a.index, b.index);
24        });
25
26        PriorityQueue<Server> busy = new PriorityQueue<>((a, b) -> {
27            if (a.freeTime != b.freeTime) {
28                return Long.compare(a.freeTime, b.freeTime);
29            }
30            if (a.weight != b.weight) {
31                return Long.compare(a.weight, b.weight);
32            }
33            return Integer.compare(a.index, b.index);
34        });
35
36        for (int i = 0; i < n; i++) {
37            free.offer(new Server(servers[i], i, 0));
38        }
39
40        long currentTime = 0;
41        for (int i = 0; i < m; i++) {
42            currentTime = Math.max(currentTime, i);
43
44            while (!busy.isEmpty() && busy.peek().freeTime <= currentTime) {
45                free.offer(busy.poll());
46            }
47
48            if (free.isEmpty()) {
49                currentTime = busy.peek().freeTime;
50                while (!busy.isEmpty() && busy.peek().freeTime <= currentTime) {
51                    free.offer(busy.poll());
52                }
53            }
54
55            Server server = free.poll();
56            ans[i] = server.index;
57            server.freeTime = currentTime + tasks[i];
58            busy.offer(server);
59        }
60
61        return ans;
62    }
63}
64