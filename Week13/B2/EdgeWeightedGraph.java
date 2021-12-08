import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;

public class EdgeWeightedGraph {
    private int V;
    private int E;
    private Bag<Edge>[] adj;
    public EdgeWeightedGraph(int V) {
        this.V = V;
        this.E = 0;
        adj = (Bag<Edge>[]) new Bag[V];
        for(int v = 0; v < V; v++ ) {
            adj[v] = new Bag<Edge>();
        }

    }

    public EdgeWeightedGraph(In in) {

    }

    public int getV() {
        return V;
    }

    public int getE() {
        return E;
    }

    public void addEdge(Edge e) {
        int v = e.either();
        int w = e.other(v);
        adj[v].add(e);
        adj[w].add(e);

    }

    public Iterable<Edge> adj(int v) {
        return adj[v];
    }

    public static void main(String[] args) {
        EdgeWeightedGraph edgeWeightedGraph = new EdgeWeightedGraph(8);
        Edge edge1 = new Edge(4,5,0.35);
        edgeWeightedGraph.addEdge(edge1);
        Edge edge2 = new Edge(4,7,0.37);
        edgeWeightedGraph.addEdge(edge2);
        Edge edge3 = new Edge(5,7, 0.28);
        edgeWeightedGraph.addEdge(edge3);
        Edge edge4 = new Edge(0,7,0.16);
        edgeWeightedGraph.addEdge(edge4);
        Edge edge5 = new Edge(1,5,0.32);
        edgeWeightedGraph.addEdge(edge5);
        Edge edge6 = new Edge(0,4,0.38);
        edgeWeightedGraph.addEdge(edge6);
        Edge edge7 = new Edge(2,3,0.17);
        edgeWeightedGraph.addEdge(edge7);
        Edge edge8 = new Edge(1,7, 0.19);
        edgeWeightedGraph.addEdge(edge8);
        Edge edge9 = new Edge(0,2,0.26);
        edgeWeightedGraph.addEdge(edge9);
        Edge edge10 = new Edge(1,2, 0.36);
        edgeWeightedGraph.addEdge(edge10);
        Edge edge11 = new Edge(1,3,0.29);
        edgeWeightedGraph.addEdge(edge11);
        Edge edge12 = new Edge(2,7,0.34);
        edgeWeightedGraph.addEdge(edge12);
        Edge edge13 = new Edge(6,2,0.4);
        edgeWeightedGraph.addEdge(edge13);
        Edge edge14 = new Edge(3,6,0.52);
        edgeWeightedGraph.addEdge(edge14);
        Edge edge15 = new Edge(6,0,0.58);
        edgeWeightedGraph.addEdge(edge15);
        Edge edge16 = new Edge(6,4, 0.93);
        edgeWeightedGraph.addEdge(edge16);
        PrimMST mst = new PrimMST(edgeWeightedGraph);

        Queue<Edge> ms = mst.getMst();

        for (Edge edge : ms) {
            System.out.println(edge.toString());
        }

    }


}
