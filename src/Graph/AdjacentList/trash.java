package Graph.AdjacentList;
import java.util.*;
public class trash {
    private static List<List<Integer>> graph = new ArrayList<>();
    public static void main(String[] args) {
        int[][] Edges = {{0, 1},{0, 3},{1, 2},{2, 3},{2, 4}};
        int n = Edges.length;
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] nums : Edges){
            addEdge(nums[0], nums[1]);
        }
        printGraph();
    }

    private static void addEdge(int a, int b){
        graph.get(b).add(a);
        graph.get(a).add(b);
    }

    private static void printGraph(){
        for(int i = 0; i < graph.size(); i++){
            System.out.print(i + " => ");
            for(int num : graph.get(i)){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
