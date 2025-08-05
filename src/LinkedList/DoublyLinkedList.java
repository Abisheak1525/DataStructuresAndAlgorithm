// package LinkedList;
// import java.util.Scanner;

// class Node{
//     int num;
//     Node prev;
//     Node next;
//     Node(int num){
//         this.num=num;
//         this.prev=null;
//         this.next=null;
//     }
// }

// public class DoublyLinkedList {
//     static Node newNode = null;
//     static Node Head = null;
    
//     static Node create(int num){
//         newNode = new Node(num);
//         return newNode;
//     }

//     static void insert(){
//         if(Head==null){
//             Head=newNode;
//         }
//         else{
//             Node temp=Head;
//             while(temp.next!=null){
//                 temp=temp.next;
//             }
//             temp.next=newNode;
//             newNode.prev=temp;
//         }
//     }
//     static void print(){
//         if(Head==null){
//             return;
//         }
//         else{
//             Node temp=Head;
//             while(temp!=null){
//                 System.out.print(temp.num+" ");
//                 temp=temp.next;
//             }
//         }
//     }

//     public static void main(String args[]){
//         Scanner op=new Scanner(System.in);
//         int n=op.nextInt();
//         for(int i=0;i<n;i++){
//             int num=op.nextInt();
//             create(num);
//             insert();
//         }
//         print();
        
//         op.close();
//     }
// }
