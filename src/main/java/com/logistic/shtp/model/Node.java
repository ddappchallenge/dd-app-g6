package com.logistic.shtp.model;

import java.util.ArrayList;

public class Node {
    private String name;
    private ArrayList<Edge> path;
    private int minDistance = Integer.MAX_VALUE;
    private Node previousNode;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Edge> getPath() {
        return this.path;
    }

    public void setPath(ArrayList<Edge> path) {
        this.path = path;
    }

    public int getMinDistance() {
        return this.minDistance;
    }

    public void setMinDistance(int minDistance) {
        this.minDistance = minDistance;
    }

    public Node getPreviousNode() {
        return this.previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

    public boolean addPath(Edge e) {
        return path.add(e);
    }
    
}