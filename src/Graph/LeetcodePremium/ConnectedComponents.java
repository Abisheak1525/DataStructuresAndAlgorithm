package Graph.LeetcodePremium;

import java.util.*;

public class ConnectedComponents {
    public static void main(String[] args) {
        int n = 5;
        int[][] edges = {
            {0, 1},
            {1, 2},
            {3, 4}
        };

        int result = countComponents(n, edges);
        System.out.println(result); 
    }

    public static int countComponents(int n, int[][] edges) {
        // Your code here
        
        boolean visited[] = new boolean[n];
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }
        for(int edge[] : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        int count = 0;
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(i, visited, graph);
                count++;
            }
        }
        return count;
    }

    private static void dfs(int node, boolean visited[], List<List<Integer>> graph){
        visited[node] = true;
        for(int edge : graph.get(node)){
            if(!visited[edge]){
                dfs(edge, visited, graph);
            }
        }
    }
}
