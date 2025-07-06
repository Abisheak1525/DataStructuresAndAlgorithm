package Graph.AdjacentMatrix;
import java.util.*;

public class bfs {
    private static int graph[][];
    private static boolean visited[];
    public bfs(int values[][], int num){
        graph = new int[num][num];
        visited = new boolean[num];
        for(int pair[] : values){
            graph[pair[0]][pair[1]] = 1;
            graph[pair[1]][pair[0]] = 1;
        }
    }
    public static void main(String[] args) {
        int values[][] = { {1, 2}, {0, 1}, {2, 3}, {3, 5}, {0, 4}, {4, 1}, {5, 2}, {5, 4}};
        bfs bf = new bfs(values, 6);
        bf.BFS(0);
    }
    public void BFS(int st){

        Queue<Integer> queue = new LinkedList<>();
        queue.add(st);
        visited[st] = true;

        while(!queue.isEmpty()){
            int num = queue.poll();
            System.out.print(num + " ");
            
            for(int i = 0; i < 6; i++){
                if(graph[num][i] == 1 && !visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
