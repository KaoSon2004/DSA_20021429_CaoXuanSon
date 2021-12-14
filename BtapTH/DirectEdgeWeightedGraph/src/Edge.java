public class Edge {
    private int v;
    private int w;
    private double weight;
    public Edge(int v, int w, int weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public int getV() {
        return v;
    }

    public int getW() {
        return w;
    }

    public String toString() {
        return String.format("%d-%d %.2f", v, w, weight);
    }
}
