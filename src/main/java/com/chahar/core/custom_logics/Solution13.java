package com.chahar.core.custom_logics;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList[] list = new ArrayList[n];

        for(int i=0;i<=n-1;i++){
            list[i] = new ArrayList();
            int q = in.nextInt();
            
            for(int j=0;j<=q-1;j++){
                int d = in.nextInt();
                list[i].add(d);
            }
        }
        
        int z = in.nextInt();
        for(int k=0;k<=z-1;k++){
            int i_index = in.nextInt();
            int j_index = in.nextInt();
            try{
                System.out.println(list[i_index-1].get(j_index));
            }catch(Exception e){
               System.out.println("ERROR!");
            }
        }
        
       in.close(); 
    }
}