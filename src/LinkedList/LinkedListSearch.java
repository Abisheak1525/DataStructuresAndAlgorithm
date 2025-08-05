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
// public class LinkedListSearch {
//     static Node Head = null;
//     static Node newNode=null;
//     static void create(int num){
//         newNode = new Node(num);
//     }

//     static void insert(){
//         if(Head==null){
//             Head=newNode;
//         }
//         else{
//             Node temp = Head;
//             while(temp.next!=null){
//                 temp=temp.next;
//             }
//             temp.next=newNode;
//         }
//     }

//     static int search(int x,int n){
//         if(Head==null){
//             return -1;
//         }
//         int count=1;
//         Node temp = Head;
//         while(temp != null && temp.num!=x){
//             temp=temp.next;
//             count++;
//         }
//         if(temp!=null){
//             return count;
//         }
//         else{
//             return 0;
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
//         int x=op.nextInt();
//         int index=search(x,n);
//         if(index==-1){
//             System.out.println("List is Empty");
//         }
//         if(index==0){
//             System.out.println("Number Not fount");
//         }
//         else{
//             System.out.println("Present at "+index+" Index");
//         }
//         op.close();
//     }
// }
