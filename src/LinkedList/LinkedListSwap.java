// package LinkedList;
// import java.util.Scanner;

// class Node{
//     int num;
//     Node next;
//     Node(int num){
//         this.num=num;
//         this.next=null;
//     }
// }
// class LinkedList{
//     static Node head=null;
//     static Node newNode=null;
//     static void create(int num){
//         newNode = new Node(num);
//     }
//     static void insert(){
//         if(head==null){
//             head=newNode;
//         }
//         else{
//             Node temp=head;
//             while(temp.next!=null){
//                 temp=temp.next;
//             }
//             temp.next=newNode;
//         }
//     }
//     static void print(){
//         if(head==null){
//             System.out.println("not posible");
//         }
//         else{
//             Node temp = head;
//             while(temp!=null){
//                 System.out.print(temp.num+" ");
//                 temp=temp.next;
//             }
            
//         }
//     }
//     static void swap(int a,int b){
//         if(a==b){
//             return;
//         }

//         //to find a 
//         Node preA=null;
//         Node curA=head;
//         while(curA!=null && curA.num!=a){
//             preA=curA;
//             curA=curA.next;
//         }
//         //to find b
//         Node preB=null,curB=head;
//         while(curB!=null && curB.num!=b){
//             preB=curB;
//             curB=curB.next;
//         }
//         //if a or b not present 
//         if(curA==null || curB==null){
//             return;
//         }

//         //if a is head
//         if(preA==null){
//             head=curB;
//         }
//         else{
//             preA.next=curB;
//         }

//         //if b is head
//         if(preB==null){
//             head=curA;
//         }
//         else{
//             preB.next=curA;
//         }

//         //to change the pinter
//         Node temp = curA.next;
//         curA.next=curB.next;
//         curB.next=temp;
//     }
//     public static void main(String args[]){
//         Scanner op=new Scanner(System.in);
//         int n=op.nextInt();
//         for(int i=0;i<n;i++){
//             int num=op.nextInt();
//             create(num);
//             insert();
//         }
//         int a=op.nextInt();
//         int b=op.nextInt();
//         swap(a,b);
//         print();
//         op.close();
//     }
// }