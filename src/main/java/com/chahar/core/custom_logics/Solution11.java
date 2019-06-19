package com.chahar.core.custom_logics;

import java.util.Scanner;

public class Solution11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String input=sc.next();
        
        boolean result = true;
        for(int i=0;i<input.length()/2;i++){
            if(input.charAt(i) != input.charAt(input.length()-1-i)){
              result=false;
              break;  
            } 
        }
        
        System.out.println(result?"Yes":"No");

	}

}
