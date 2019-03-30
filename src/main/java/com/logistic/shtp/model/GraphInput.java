package com.logistic.shtp.model;

import java.util.List;

/**
 * GraphInput
 */
public class GraphInput {

    private List<String> nodes;

    private List<EdgeSerialize> edges;

    /**
     * @return the nodes
     */
    public List<String> getNodes() {
        return nodes;
    }

    /**
     * @return the edges
     */
    public List<EdgeSerialize> getEdges() {
        return edges;
    }

    /**
     * @param edges the edges to set
     */
    public void setEdges(List<EdgeSerialize> edges) {
        this.edges = edges;
    }

    /**
     * @param nodes the nodes to set
     */
    public void setNodes(List<String> nodes) {
        this.nodes = nodes;
    }

    public String toString() {
        return edges.toString() + nodes.toString();
    }

}