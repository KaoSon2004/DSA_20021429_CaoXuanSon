import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.Queue;

public class PrimMST {
    private boolean[] marked;
    private Queue<Edge> mst;
    private MinPQ<Edge> pq;

    public PrimMST(EdgeWeightedGraph G) {
        pq = new MinPQ<Edge>();
        marked = new boolean[G.getV()];
        mst = new Queue<Edge>();
        visit(G,0);
        while(!pq.isEmpty()) {
            Edge e = pq.delMin();
            int v = e.either(), w = e.other(v);
            if(marked[v] && marked[w]) continue;
            mst.enqueue(e);
            if(!marked[v]) visit(G, v);
            if(!marked[w]) visit(G, w);
        }

    }

    private void visit(EdgeWeightedGraph g, int v) {
        marked[v] = true;
        for(Edge e : g.adj(v)) {
            if(!marked[e.other(v)]) pq.insert(e);
        }
    }

    public Queue<Edge> getMst() {
        return mst;
    }
}
