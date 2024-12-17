package LinkedList;
// import java.util.Scanner;

// class Node{
//     int num;
//     Node pre;
//     Node next;
//     Node(int num){
//         this.num=num;
//         this.pre=null;
//         this.next=null;
//     }
// }
// public class DoublyLinkedListMiddleInsertion {
//     static Node newNode=null;
//     static Node head=null;
//     static void create(int num){
//         newNode= new Node(num);
//     }
//     static void insert(){
//         if(head==null){
//             head= newNode;
//         }
//         else{
//             Node temp= head;
//             while(temp.next!=null){
//                 temp=temp.next;
//             }
//             temp.next=newNode;
//             newNode.pre=temp;
//         }
//     }
//     static void print(){
//         if(head==null){
//             return;
//         }
//         else{
//             Node temp = head;
//             while (temp!=null) {
//                 System.out.print(temp.num+" ");
//                 temp=temp.next;
//             }
//         }
//         System.out.println();
//     }
//     static void middleInsert(int num,int n){
//         int a=n/2;
//         if(a%2==0){
//             a-=1;
//             Node curNode=head;
//             for(int i=0;i<a;i++){
//                 curNode=curNode.next;
//             }
//             newNode.next=curNode.next;
//             newNode.pre=curNode;
//             if (curNode.next != null) {
//                 curNode.next.pre = newNode;
//             }
//             curNode.next = newNode;
//         }
//         else if(a%2==1){
//             a-=1;
//             Node curNode=head;
//             for(int i=0;i<a;i++){
//                 curNode=curNode.next;
//             }
//             newNode.next=curNode.next;
//             newNode.pre=curNode;
//             if (curNode.next != null) {
//                 curNode.next.pre = newNode;
//             }
//             curNode.next = newNode;
//         }
        
//     }
//     public static void main(String args[]){
//         Scanner op= new Scanner(System.in);
//         int n=op.nextInt();
//         for(int i=0;i<n;i++){
//             int num=op.nextInt();
//             create(num);
//             insert();
//         }
//         print();
//         int x=op.nextInt();
//         for(int i=0;i<x;i++){
//             int val=op.nextInt();
//             create(val);
//             middleInsert(val,n);
//             n=n+1;
//             print();
//             System.out.println();
//         }
//         op.close();

//     }
// }
