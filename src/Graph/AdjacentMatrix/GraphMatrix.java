package Graph.AdjacentMatrix;

import java.util.*;

public class GraphMatrix {
    int V;
    int[][] adj;
    boolean[] visited;

    GraphMatrix(int V) {
        this.V = V;
        adj = new int[V][V];
    }

    void addEdge(int u, int v) {
        adj[u][v] = 1;
        adj[v][u] = 1;
    }

    void dfsUtil(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for(int i = 0; i < V; i++) {
            if(adj[node][i] == 1 && !visited[i]) {
                dfsUtil(i);
            }
        }
    }

    void DFS(int start) {
        visited = new boolean[V];
        System.out.print("DFS: ");
        dfsUtil(start);
        System.out.println();
    }

    void BFS(int start) {
        visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        System.out.print("BFS: ");
        while(!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for(int i = 0; i < V; i++) {
                if(adj[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GraphMatrix g = new GraphMatrix(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);

        g.DFS(0);
        g.BFS(0);
    }
}
