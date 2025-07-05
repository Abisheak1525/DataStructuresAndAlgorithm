package Graph.AdjacentList;

import java.util.*;

public class GraphIntro {
    public static void main(String[] args) {
        int n = 5; // number of nodes
        List<List<Integer>> graph = new ArrayList<>();

        // Initialize list
        for(int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges (undirected)
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);

        printGraph(graph);
    }

    static void addEdge(List<List<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u); // for undirected graph
    }

    static void printGraph(List<List<Integer>> graph) {
        for (int i = 0; i < graph.size(); i++) {
            System.out.print(i + " -> ");
            for (int j : graph.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
