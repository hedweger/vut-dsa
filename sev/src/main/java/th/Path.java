package th;

public class Path {
    private Graf graph;
    private int weight = 0;
    private Node start;

    public Path(Graf g, String n) {
        this.graph = g;
        this.start = g.getNode(n);
    }

    public void addConnection(String a) {
        Node n1 = graph.getNode(a);
        this.weight += start.getWeight(n1);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
