package prep;
import java.util.*;

public class StringPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        PrintPattern(str);
        sc.close();
    }    
    private static void PrintPattern(String str){
        int len = str.length();
        int n = (len % 2 == 0)  ?len +1: len;
        int k = 0;
        for(int i = 0; i < n; i++){
            if(i == n/2){
                int x = 0;
                for(int j = 0; j < n; j++){
                    if(len % 2 == 0 && j == n/2){
                        System.out.print("*");
                        k-=1;
                    }
                    else{
                        if(x < len)
                            System.out.print(str.charAt(x++));
                        else
                            System.out.print(" ");
                    }
                    if(j < n-1){
                        System.out.print(" ");
                    }
                }
                k+=1;
                System.out.println();
            }
            else{
                for(int j = 0; j < n; j++){
                    if(i == j || j == n/2 || i + j == n - 1){
                        System.out.print(str.charAt(k));
                    }
                    else{
                        System.out.print(" ");
                    }
                    if(j < n-1){
                        System.out.print(" ");
                    }
                }
                k++;
                System.out.println();
            }
        }   
    }
}
