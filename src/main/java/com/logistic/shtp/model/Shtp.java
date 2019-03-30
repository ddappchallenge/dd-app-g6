package com.logistic.shtp.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Shtp {
    public static void computePath(Node src) {
        src.setMinDistance(0);
        PriorityQueue<Node> nodeQueue = new PriorityQueue<Node>();
        nodeQueue.add(src);

        while (!nodeQueue.isEmpty()) {
            Node node = nodeQueue.poll();

            for (Edge e : node.getPath()) {
                Node nextNode = e.getDest();
                int totalCost = node.getMinDistance() + ( e.getCost() * e.getDistance() );
                if (totalCost < nextNode.getMinDistance()) {
                    nodeQueue.remove(node);

                    nextNode.setMinDistance(totalCost);
                    nextNode.setPreviousNode(node);
                    nodeQueue.add(nextNode);
                }
            }
        }

    }

    public static List<Node> getShortestPath(Node dest) {
        List<Node> path = new ArrayList<>();
        for (Node target = dest; target != null; target = target.getPreviousNode()) {
            path.add(target);
        }
        
        Collections.reverse(path);
        return path;
    }

}