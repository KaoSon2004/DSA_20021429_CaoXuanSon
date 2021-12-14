    public static List<Integer> adj(int v, List<List<Integer>> edges) {
        List<Integer> ad = new ArrayList<>();
        for(int i = 0; i < edges.size(); i++) {
        if(edges.get(i).get(0) == v) {
        ad.add(edges.get(i).get(1));
        }
        if(edges.get(i).get(1) == v) {
        ad.add(edges.get(i).get(0));
        }
        }
        return ad;
    }
    public static List<Integer> bfs(int n, int m, List<List<Integer>> edges, int s) {
        // Write your code here
        boolean[] marked = new boolean[1000];
        int[] edgeTo = new int[1000];
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
        ans.add(-1);
        }
        Queue<Integer> queue = new LinkedList<>();
        marked[s] = true;
        queue.add(s);
        edgeTo[s] = 0;
        while(!queue.isEmpty()) {
        int v = queue.remove();
        for(int w : adj(v,edges)) {
        if(!marked[w]) {
        edgeTo[w] = edgeTo[v] + 6;
        ans.set(w, edgeTo[w]);
        marked[w] = true;
        queue.add(w);
        }
        }
        }

        ans.remove(s);
        ans.remove(0);
        return ans;
    }