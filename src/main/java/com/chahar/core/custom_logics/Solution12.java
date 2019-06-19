package com.chahar.core.custom_logics;

import java.util.Scanner;

public class Solution12 {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int arr[] = new int[n] ;
       for(int i=0;i<n;i++){
           arr[i] = in.nextInt();
       }
      in.close();
       
       
      int negArr = 0;
      for(int i=0;i<=n-1;i++){
          for(int j=0;j<=n-1-i;j++){
              int total = sum(j,i,arr);
              if(total <0) {
                  negArr++;
              }
          }
      }
        
      System.out.println(negArr);
        
    }
    
    static int sum(int from , int totalelements , int[] arr){
        int total = 0;
        for(int i=from;i<=totalelements+from  ; i++){
            total = total + arr[i];
        }
        return total;
    }
    
}
