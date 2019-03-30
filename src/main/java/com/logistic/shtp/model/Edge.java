package com.logistic.shtp.model;

public class Edge {
    private Node dest;
    private int cost;
    private int distance;

    public Edge(Node dest, int cost, int distance) {
        this.dest = dest;
        this.cost = cost;
        this.distance = distance;
    }
    
    public Node getDest() {
        return this.dest;
    }

    public void setDest(Node dest) {
        this.dest = dest;
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDistance() {
        return this.distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}