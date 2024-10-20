package th;

import java.util.HashMap;
import java.util.HashSet;

public class Node {
    private String name;
    private HashSet<Node> neighbors;
    private HashMap<Node, Integer> weights;

   public Node(String name) {
    this.name = name;
    this.neighbors = new HashSet<>();
    this.weights = new HashMap<>();
   }
   public void addNeighbor(Node n, int weight) {
    this.neighbors.add(n); 
    this.weights.put(n, weight);
   } 
   public int getWeight(Node n) {
    return weights.get(n);
   }
}
