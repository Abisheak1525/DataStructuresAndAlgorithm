package Graph.AdjacentMatrix;

public class dfs {
    private static int[][] graph;
    private static boolean visited[];
    private static int n;
    public dfs(int[][] values, int n){
        graph = new int[n][n];
        visited = new boolean[n];
        dfs.n = n;
        for(int val[] : values){
            graph[val[0]][val[1]] = 1;
            graph[val[1]][val[0]] = 1;
        }
    }
    public static void main(String[] args) {
        int values[][] = { {1, 2}, {0, 1}, {2, 3}, {3, 5}, {0, 4}, {4, 1}, {5, 2}, {5, 4}};
        dfs df = new dfs(values, 6);
        df.dfs(0);
    }
    private void dfs(int start){
        visited[start] = true;

        for(int i = 0; i < n; i++){
            if(graph[start][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
        System.out.print(start + " ");
    }
}
