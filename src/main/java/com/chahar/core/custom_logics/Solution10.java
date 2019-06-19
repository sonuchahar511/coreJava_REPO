package com.chahar.core.custom_logics;

import java.util.Scanner;

public class Solution10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        int l = in.nextInt();
        in.close();
        
        String min="" , max="";
       
        for(int i=0;i<=(input.length()-1)-(l-1);i++){
        	String sb="";
            for(int j=i;j<i+l;j++){
                sb +=input.charAt(j);
            }
            
            if(i==0){
            	min=sb; max=sb;
            }else{
            	if(sb.compareTo(min) <0) min=sb;
            	if(sb.compareTo(max) >0) max=sb;
            }
        }
        
        System.out.println(min);
        System.out.println(max);
        
    }
}