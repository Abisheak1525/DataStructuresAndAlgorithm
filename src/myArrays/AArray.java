package myArrays;

import java.util.*;
class AArrays{
    public static void main(String args[]){
        Scanner op = new Scanner(System.in);
        int n = op.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=op.nextInt();
        }
        print(arr);
        // reverse(arr);
        // Rotate(arr);
        op.close();

    }

    private static void print(int[] arr){
        for(int n:arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }

    public static int[] copyOfRange(int[] arr, int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'copyOfRange'");
    }

    

    // private static void Rotate(int[] arr){
    //     int n=arr.length;
    //     int temp=arr[0];
    //     for(int i=0;i<n-1;i++){
    //         arr[i]=arr[i+1];
    //     }
    //     arr[n-1]=temp;
    //     print(arr);
    // }

    // private static void reverse(int[] arr){
    //     int st=0;
    //     int ed=arr.length-1;
    //     while(st<ed){
    //         int temp=arr[st];
    //         arr[st]=arr[ed];
    //         arr[ed]=temp;
    //         st++;
    //         ed--;
    //     }
    //     print(arr);
    // }
}
