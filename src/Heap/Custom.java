package Heap;

import java.util.*;

public class Custom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Heap hp= new Heap(n);
        for(int i = 0; i < n; i++){
            hp.insert(sc.nextInt());
        }
        hp.printHeap();

        System.out.println(hp.remove());

        hp.printHeap();

        sc.close();
    }    
}

class Heap {
    private int[] heap;
    private int size;
    private int cap;

    Heap(int n) {
        heap = new int[n];
        this.cap = n;
        size = 0;
    }

    private int getLeftChildIndex(int i) { return 2 * i + 1; }
    private int getRightChildIndex(int i) { return 2 * i + 2; }
    private int getParentIndex(int i) { return (i - 1) / 2; }

    private boolean hasLeftChild(int i) { return getLeftChildIndex(i) < size; }
    private boolean hasRightChild(int i) { return getRightChildIndex(i) < size; }
    private boolean hasParent(int i) { return getParentIndex(i) >= 0; }

    private int leftChild(int i) { return heap[getLeftChildIndex(i)]; }
    private int rightChild(int i) { return heap[getRightChildIndex(i)]; }
    private int parent(int i) { return heap[getParentIndex(i)]; }

    public void insert(int n) {
        if (size == cap) throw new IllegalStateException("Heap is full");
        heap[size] = n;
        size++;
        heapifyUp();
    }

    public int remove() {
        if (size == 0) throw new IllegalStateException("Heap is Empty");
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown();
        return min;
    }

    private void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && parent(index) > heap[index]) {
            swap(index, getParentIndex(index));
            index = getParentIndex(index);
        }
    }

    private void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
                smallerChildIndex = getRightChildIndex(index);
            }

            if (heap[index] < heap[smallerChildIndex]) {
                break;
            } else {
                swap(index, smallerChildIndex);
                index = smallerChildIndex;
            }
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public int peek() {
        if (size == 0) throw new IllegalStateException("Heap is Empty");
        return heap[0];
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) System.out.print(heap[i] + " ");
        System.out.println();
    }
}
