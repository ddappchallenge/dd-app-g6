package com.logistic.shtp.model;

import java.util.ArrayList;

public class Node implements Comparable<Node>{
    private String name;
    private ArrayList<Edge> path;
    private int minDistance = Integer.MAX_VALUE;
    private Node previousNode;

    public Node(String name) {
        this.name = name;
        path = new ArrayList<>();
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
        System.out.println("Adding..." + e);
        path.add(e);
        return true;
    }

    public int compareTo(Node o) {
        return Double.compare(minDistance, o.minDistance);
    }
    
}