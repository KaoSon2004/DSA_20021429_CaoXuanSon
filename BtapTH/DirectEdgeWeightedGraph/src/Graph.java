import java.util.ArrayList;
import java.util.List;

public class Graph {
    private static List<Edge> edges;

    public Graph() {
        edges = new ArrayList<>();
    }

    public  void addEdge(int v, int w, int weight) {
        Edge edge = new Edge(v, w, weight);
        edges.add(edge);
    }

    public void removeEdge(int v, int w) {
        for (int i = 0; i < edges.size(); i++) {
            if(edges.get(i).getV() == v && edges.get(i).getW() == w) {
                edges.remove(i);
            }
        }
    }

    public boolean hasEdgeBetween(int v, int w) {
        for (int i = 0; i < edges.size(); i++) {
            if(edges.get(i).getV() == v && edges.get(i).getW() == w) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> adj(int v) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < edges.size(); i++) {
            if(edges.get(i).getV() == v) {
                ans.add(edges.get(i).getW());
            }
        }
        return ans;
    }
    public void print() {
        for (Edge edge : edges) {
            System.out.println(edge.toString());
        }
    }
}
