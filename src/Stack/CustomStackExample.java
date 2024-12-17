package Stack;

import java.util.*;
class CustomStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public CustomStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full!");
        } else {
            stackArray[++top] = value;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class CustomStackExample {
    public static void main(String[] args) {
        Scanner op=new Scanner(System.in);
        CustomStack stack = new CustomStack(5);
        stack.push(5);
        stack.push(10);
        stack.push(15);
        System.out.println("Top Element: " + stack.peek());  // Output: 15
        stack.pop();
        System.out.println("Top Element after pop: " + stack.peek());  // Output: 10
        op.close();
    }
}
