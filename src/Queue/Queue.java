package Queue;

import java.util.Scanner;

public class Queue {
    public int queue[];
    public int size;
    public int capacity;
    public int top;
    public int rear;
    Queue(int n){
        this.capacity = n;
        queue = new int[capacity];
        size = 0;
        top = 0;
        rear = -1;
    }

    public void push(int n){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = n;
        size++;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int num = queue[top];
        top = (top+1) % capacity;
        size--;
        return num;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return queue[top];
    }

    public boolean isFull(){
        return size == capacity;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }

        for(int i=0; i<size; i++){
            System.out.print(queue[(top+i) % capacity] + " ");
        }
    }

}
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        Queue qu= new Queue(n);
        for(int i=0;i<n;i++){
            qu.push(sc.nextInt());
        }
        System.out.print(qu.pop()+" ");
        System.out.print(qu.pop()+" ");
        System.out.print(qu.pop()+" ");
        System.out.println(qu.pop()+" ");

        qu.printQueue();

        sc.close();
    }
}
