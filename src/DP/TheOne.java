package DP;

import java.util.Arrays;

public class TheOne {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(climb(n));


    }
    //Bottom-up approach  - Tabulation
    public static int climb(int n){
        if(n <= 2) return n;

        int dp[] = new int[n];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 2; i < n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    // Top-down approach - Memorization
    // public static int climb(int n){
    //     if( n <= 2) return n;
    //     int dp[] = new int[n + 1];
    //     Arrays.fill(dp, -1);
    //     return helper(dp,n);
    // }
    // public static int helper(int[] dp, int n){
    //     if(n <= 2) return n;
    //     if(dp[n] != -1) return dp[n];  
    //     return dp[n] = helper(dp, n - 1) + helper(dp, n - 2);
    // }



}
