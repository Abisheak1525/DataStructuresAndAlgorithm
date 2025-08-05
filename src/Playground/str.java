package Playground;

import java.util.stream.Collector.Characteristics;

public class str {
    public static void main(String[] args) {
        String str ="iamhere hm ai";

        if(isPalindrome(str)){
            System.out.println("ok");
        }
        else{
            System.out.println("noooo");
        }

        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;
        System.out.println(subarray(arr, target));
    }
    private static boolean isPalindrome(String str){
        int i = 0; 
        int j = str.length()-1;
        while(i < j){
            char a = str.charAt(i);
            char b = str.charAt(j);

            while( i < j && !Character.isLetter(a)){
                i++;
                a = str.charAt(i);
            }
            while(i < j && !Character.isLetter(b)){
                j--;
                b = str.charAt(j);
            }

            if(Character.isLetter(a) && Character.isLetter(b)){
                if(Character.toLowerCase(a) != Character.toLowerCase(b)) return false;
            }
            
            i++;
            j--;

        }
        return true;
    }

    private static boolean subarray(int arr[], int tagert){
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            int j = i;
            while(j < arr.length){
                sum+=arr[j];
                if(sum == tagert) return true;
                j++;

                if(sum > tagert) break;
            }
        }
        return false;
    }
}
