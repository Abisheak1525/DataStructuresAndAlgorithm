import java.util.Scanner;

public class ArrayRotation {
    public static void main(String args[]){
     Scanner op= new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int key = op.nextInt();
        
        //0th index to 5th index 
        while (key>0) {
            int temp = arr[0];
            for(int i=0;i<n-1;i++){
                arr[i]=arr[i+1];
            }
            arr[n-1]=temp;
            key--;
        }
        
        // Opposite rotation 
        // while (key>0) {
        //     int temp = arr[n-1];
        //     for(int i=n-1;i>0;i--){
        //         arr[i]=arr[i-1];
        //     }
        //     arr[0]=temp;
        //     key--;
        // }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        op.close();
    }
}
