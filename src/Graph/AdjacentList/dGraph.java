package Graph.AdjacentList;
import java.util.*;

public class dGraph {
    private static List<List<Integer>> graph = new ArrayList<>();
    private static boolean visited[];
    private static Stack<Integer> topoStack = new Stack<>();
    public static void main(String[] args) {
        int numCourses = 6;
        int[][] prerequisites = {
            {2, 1},
            {3, 1},
            {4, 2},
            {4, 3},
            {5, 4}
        };

        int[] order = findOrder(numCourses, prerequisites);

        if (order.length == 0) {
            System.out.println("No valid course order (Cycle Detected)");
        } else {
            System.out.println("Valid Course Order: " + Arrays.toString(order));
        }
    }

    private static int[] findOrder(int numCourses,int[][] prerequisites){
        visited = new boolean[numCourses];
        int ans[] = new int[numCourses];
        graph = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            graph.add(new ArrayList<>());
        }

        for(int num[] : prerequisites){
            addNode(num[0], num[1]);
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

    private static void dfs(int node){
        visited[node] = true;

        for(int neighbor : graph.get(node)){
            if(!visited[neighbor]){
                dfs(neighbor);
            }
        }
        topoStack.push(node);
    }

    private static void addNode(int a, int b){
        graph.get(b).add(a);
    }
}
