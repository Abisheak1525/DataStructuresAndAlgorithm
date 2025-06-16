package Heap;

import java.util.*;

class Pq{
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int n = op.nextInt();
        int arr[] = new int[n]; 

        for(int i = 0; i < n; i++){
            arr[i] = op.nextInt();
        }

        heap(arr);
        op.close();
    }

    private static void heap(int[]  arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int element : arr) {
            pq.add(element);
        }

        PriorityQueue<Integer> copy = new PriorityQueue<>(pq);
        while (!copy.isEmpty()) {
            System.out.print(copy.poll() + " ");
        }
    }
}