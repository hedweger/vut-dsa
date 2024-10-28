package th;

public class Path {
    private Graf graph;
    private int weight = 0;
    private Node start;
    private Node end;

    public Path(Graf g, String n) {
        this.graph = g;
        this.start = g.getNode(n);
        this.end = this.start;
    }

    public void addConnection(String a) {
        Node n1 = graph.getNode(a);
        this.weight += end.getWeight(n1);
        this.end = n1;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
