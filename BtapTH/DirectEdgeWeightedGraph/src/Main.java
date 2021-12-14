import java.util.List;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(1,2,3);
        graph.addEdge(1,3,4);
        graph.addEdge(2,3,5);
        List<Integer> list = graph.adj(2);
        System.out.println(graph.hasEdgeBetween(2,1));
        System.out.println(list);
        graph.print();

        List
    }
}
