package com.logistic.shtp.service;

import java.util.List;

import com.logistic.shtp.model.Edge;
import com.logistic.shtp.model.GraphInput;
import com.logistic.shtp.model.Node;
import com.logistic.shtp.model.Shtp;

import org.springframework.stereotype.Service;

@Service
public class ShtpService {

    private GraphInput graphInput;

    public GraphInput create(GraphInput graphInput) {

        this.graphInput = graphInput;
        return graphInput;
    }

    public GraphInput getGraph(){
        return this.graphInput;
    }
    public boolean findFirstShortestPath(String src, String dest) {

        return true;
    }

    public boolean findAllShortestPath() {

        return true;
    }

    public boolean findShortestPath(String src, String dest) {


        return true;
    }

    public static void main(String args[]) {
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        Edge e1 = new Edge(B, 20, 1);
        System.out.println(e1);
        A.addPath(e1);

        A.addPath(new Edge(B, 20, 1));
        A.addPath(new Edge(C, 3, 5));
        B.addPath(new Edge(D, 10, 1));
        C.addPath(new Edge(D, 3, 6));


        Shtp.computePath(A);
        List<Node> path = Shtp.getShortestPath(D);
        System.out.print(path);


    }

}