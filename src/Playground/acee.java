package Playground;

public class acee {

    static int arr[] = {1,2,3,4,5};
    public static void main(String[] args) {
        recu(0, 4);
        for(int n: arr){
            System.out.println(n);
        }
    }

    public static void recu(int i, int j){
        if(i >= j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
     