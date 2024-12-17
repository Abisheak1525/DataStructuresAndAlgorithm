package LinkedList;
//The given set of numbers forms a linked list and deletes those nodes which have a greater value on their right side.
//NOTE: The final linked list should be formed in the reverse order of the given input integers. For a better understanding refer to the sample input and output.
// input 5  3 2 6 5 11
//output 11 6 3

import java.util.Scanner;

class Node{
    int num;
    Node next;
    Node(int num){
        this.num=num;
        this.next=null;
    }
}

public class DeletingNodeInLinkedListWithCondition {
    static Node head=null;
    static Node newNode=null;
    static void create(int num){
        newNode=new Node(num);
    }
    static void insert(){
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    static void print(){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.num+" ");
            temp=temp.next;
        }
    }
    static void delete(int n){
        if(head==null){
            return;
        }
        Node PreNode=head;
        Node curNode=head.next;
        while(n>0){
            if(PreNode.num>curNode.num){
                PreNode.next=curNode.next;
            }
            if(curNode.next==null){
                return;
            }
            PreNode=curNode;
            curNode=curNode.next;
        }

    }
    public static void main(String args[]){
        Scanner op=new Scanner(System.in);
        int n=op.nextInt();
        for(int i=0;i<n;i++){
            int num=op.nextInt();
            create(num);
            insert();
        }
        delete(n);
        print();
        
        op.close();
    }
}
