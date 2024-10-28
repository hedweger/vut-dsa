package th;

import java.util.HashMap;

public class Graf {
    private static HashMap<String, Node> nodes = new HashMap<String, Node>();

    public void addPath(String name1, String name2, int cost) {
        Node n1 = nodes.get(name1);
        Node n2 = nodes.get(name2);

        if (n1 == null) {
            n1 = new Node(name1);
            nodes.put(name1, n1);
        }
        if (n2 == null) {
            n2 = new Node(name2);
            nodes.put(name2, n2);
        }
        n1.addNeighbor(n2, cost);
        n2.addNeighbor(n1, cost);
    }

    public Node getNode(String name) {
        return nodes.get(name);
    }
}
