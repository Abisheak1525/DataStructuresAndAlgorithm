package Sorting;

public class QuickSort {
    public static void main(String args[]){
        int arr[] = {4,2,5,1,6,3};
        int x = arr.length -1;
        Sort(arr,0,x);
        for(int n: arr){
            System.out.print(n+" ");
        }
    }

    private static void Sort(int[] arr, int left, int right){
        if(left < right){
            int k = QuickSort(arr,left,right);
            Sort(arr, left, k -1);
            Sort(arr, k + 1, right);
        }
    }

    private static int QuickSort(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left - 1;

        for(int j = left; j < right; j++){
            if(arr[j] < pivot){
                i++;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;
        
        return i + 1;
    }
}
