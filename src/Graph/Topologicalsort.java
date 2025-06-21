package Graph;
import java.util.*;

public class Topologicalsort {
    private static List<List<Integer>> graph = new ArrayList<>();
    private static boolean visited[];
    static Stack<Integer> topoStack = new Stack<>();

    public static void main(String[] args) {
        int numCourses = 4;
        int[][] prerequisites = {
            {1, 0},
            {2, 0},
            {3, 1},
            {3, 2}
        };
        int[] order = findOrder(numCourses, prerequisites);

        if (order.length == 0) {
            System.out.println("No valid course order (Cycle Detected)");
        } else {
            System.out.println("Valid Course Order: " + Arrays.toString(order));
        }
    }
    public static int[] findOrder(int numCourses, int[][] prerequisites){
        int ans[] = new int[numCourses];
        visited = new boolean[numCourses];

        graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for(int arr[] : prerequisites){
            addNode(arr[1], arr[0]);
        }
        
        for(int i = 0; i < numCourses; i++){
            if(!visited[i]){
                dfs(i);
            }
        }

        for(int i = 0; i < numCourses; i++){
            ans[i] = topoStack.pop();
        }

        return ans;
    }

    public static void addNode(int a, int b){
        graph.get(a).add(b);
    }

    public static void dfs(int node){
        visited[node] = true;

        for(int neighbor : graph.get(node)){
            if(!visited[neighbor]){
                dfs(neighbor);
            }
        }
        topoStack.push(node);
        
    }

}
