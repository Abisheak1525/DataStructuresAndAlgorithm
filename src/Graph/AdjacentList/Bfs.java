package Graph.AdjacentList;
import java.util.*;
public class Bfs {
    public static void main(String[] args) {
        GraphList g = new GraphList(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);

        g.DFS(0);
        System.out.println();
        g.BFS(0);
    }
}

class GraphList{
    private static List<List<Integer>> graph = new ArrayList<>();
    private static boolean visited[];
    private int n;

    GraphList(int n){
        this.n = n;
        visited = new boolean[n];

        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }
    }

    public void addEdge(int a, int b){
        graph.get(a).add(b);
        graph.get(b).add(a);
    }

    public void DFS(int node){
        visited[node] = true;
        for(int neighbor : graph.get(node)){
            if(!visited[neighbor]){
                DFS(neighbor);
            }
        }
        System.out.print(node + " ");
    }

    public void BFS(int node){
        visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);

        visited[node] = true;

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            System.out.print(temp+ " ");

            for(int neighbor : graph.get(temp)){
                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    queue.offer(neighbor);
                }
            }
        }
    }
}
