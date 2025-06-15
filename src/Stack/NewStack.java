package Stack;
import java.util.*;

public class NewStack {
    private int[] arr;
    private int top;
    private int size;
    NewStack(int n){
        this.arr = new int[n];
        size = n;
        top = -1;
    }

    public void push(int n){
        if(this.top == size - 1){
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top] = n;
    }
    
    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        int n = arr[top];
        top--;
        return n;
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(top == size - 1){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner op = new Scanner(System.in);
        int n = op.nextInt();
        NewStack st = new NewStack(n);

        for(int i = 0; i < n; i++){
            st.push(op.nextInt());
        }

        System.out.println("Top element: " + st.peek());
        op.close();
    }    
}