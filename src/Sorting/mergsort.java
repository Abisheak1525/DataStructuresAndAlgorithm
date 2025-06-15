package Sorting;

public class mergsort {
    public static void main(String args[]){
        int arr[] = {4,2,5,1,6,3};
        int x = arr.length -1;
        Sort(arr,0,x);
        for(int n: arr){
            System.out.print(n+" ");
        }
    }

    private static void Sort(int[] arr,int left, int right){
        if(left < right){
            int mid =(left + right) / 2;
            Sort(arr, left, mid);
            Sort(arr, mid + 1, right);
            MergeSort(arr, left, mid, right);
        }
    }
    
    private static void MergeSort(int arr[], int left, int mid,  int right){
        int n1 = mid - left + 1;
        int n2 = right -mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0; i<n1; i++){
            L[i] = arr[left + i];
        }
        for(int i = 0; i<n2; i++){
            R[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = left;
        while(i < n1 && j < n2){
            if(L[i] < R[j]){
                arr[k++] = L[i++];
            }
            else{
                arr[k++] = R[j++];
            }
        }

        while(i < n1) arr[k++] = L[i++];
        while(j < n2) arr[k++] = R[j++];
    }
}
