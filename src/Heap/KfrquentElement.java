package Heap;
import java.util.*;
public class KfrquentElement {
    
    public static void main(String[] args) {
        
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int n : nums){
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        
        pq.addAll(freq.entrySet());

        int ans[] = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = pq.poll().getKey();
        }

        return ans;
    }
}