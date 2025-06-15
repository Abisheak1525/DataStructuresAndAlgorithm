package myArrays;

import java.util.*;

public class Basics {
    public static void main(String args[]){
        Scanner op = new Scanner(System.in);
        int n = op.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=op.nextInt();
        }
        

        // //forward
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }
        // System.out.println();
        
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        
        // //reverse 
        // for(int i=arr.length-1;i>=0;i--){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // // Prefix sum 
        // for(int i=n-1;i>0;i--){
        //     arr[i]=arr[i-1]+arr[i];
        // }

        // for(int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        

        // reverse array

        // int a=0;
        // int b=n-1;
        // while(a<b){
        //     int temp = arr[a];
        //     arr[a]=arr[b];
        //     arr[b]=temp;
        //     a++;
        //     b--;
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        
        // rotate array 

        // int key = (op.nextInt())%n;
        
        // while(key>0){
        //     int temp=arr[0];
        //     for(int i=0;i<n-1;i++){
        //         arr[i]=arr[i+1];
        //     }
        //     arr[n-1]=temp;
        //     key--;
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();




    }
    
}
