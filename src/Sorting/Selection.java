package Sorting;

import java.util.*;
class Selection{
    public static void main(String args[]){
        Scanner op = new Scanner(System.in);
        int n = op.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = op.nextInt();
        }
        
        for(int i = 0; i < n - 1; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            
            System.out.print("After iteration " + (i+1) + ": ");
            for(int a : arr){
                System.out.print(a + " ");
            }
            
            System.out.println();
        }
        System.out.print("Sorted array: ");
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}
