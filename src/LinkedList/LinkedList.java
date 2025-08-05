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
//     static Node deleteNode(Node head, int num) {
//         if (head == null) {
//             System.out.println("List is empty. Deletion not possible.");
//             return head;
//         }

//         if (head.num == num) {
//             head = head.next; 
//             return head; 
//         }

//         Node temp = head;
//         Node prev = null;

//         while (temp != null && temp.num != num) {
//             prev = temp;
//             temp = temp.next;
//         }

//         if (temp == null) {
//             System.out.println("Node with value " + num + " not found.");
//             return head;
//         }

//         prev.next = temp.next;
//         return head;
//     }

//     static void print(Node head) {
//         if (head == null) {
//             System.out.println("List is empty");
//         } else {
//             Node temp = head;
//             while (temp != null) {
//                 System.out.print(temp.num + " ");
//                 temp = temp.next;
//             }
//             System.out.println();
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
//         System.out.println("Enter value to delete:");
//         int deleteValue = op.nextInt();
//         head = deleteNode(head, deleteValue); 

//         System.out.println("Updated List:");
//         print(head);
//         op.close();
//     }
// }
