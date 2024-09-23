package org.th.second;

import java.util.Vector;

public class Network {
    private Vector<Network> neighbors;

    public Network getNeighbor(int i) {
        return neighbors.get(i);
    }

    public void addNeighbor(Network n) {
        this.neighbors.add(n);
    }
}
