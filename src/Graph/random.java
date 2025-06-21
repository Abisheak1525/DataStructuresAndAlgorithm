package Graph;

import java.util.*;
// Undirected graph
public class random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Graph graph = new Graph(n);
        while(sc.hasNext()){
            int a = sc.nextInt();
            if(a == 999){
                break;
            }
            int b = sc.nextInt();
            graph.addNode(a, b);

        }

        // graph.dfs(0);
        graph.bfs(0);
        graph.hasCycle(n);
        
        sc.close();
    }
}

class Graph{
    List<List<Integer>> graph = new ArrayList<>(); 
    boolean visited[];

    Graph(int n){
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void addNode(int a, int b){
        graph.get(a).add(b);
        graph.get(b).add(a);
    }

    public void dfs(int node){
        visited[node] = true;
        System.out.println(node +" ");

        for(int neighbor : graph.get(node)){
            if(!visited[neighbor]){
                dfs(neighbor);
            }
        }
        
    }

    public void bfs(int node){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;
        while(!queue.isEmpty()){
            int n = queue.poll();
            System.out.print(n+" ");
            for(int num : graph.get(n)){
                if(!visited[num]){
                    visited[num] = true;
                    queue.add(num);
                }
            }
        }
    }

    public void hasCycle(int n){
        boolean[] cycleVisited = new boolean[n]; 
        boolean hasCycle = false;

        for (int i = 0; i < n; i++) {
            if (!cycleVisited[i]) {
                if (dfs2(i, -1, cycleVisited)) {
                    hasCycle = true;
                    break;
                }
            }
        }
        System.out.println("Cycle exists: " + hasCycle);
    }

    public boolean dfs2(int node, int parent, boolean[] cycleVisited) {
        cycleVisited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!cycleVisited[neighbor]) {
                if (dfs2(neighbor, node, cycleVisited)) return true;
            } else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }
}
 