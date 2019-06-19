package com.chahar.core.string;

public class StringBuilderApp {

	public static void main(String[] args) {
		StringBuilder contactIds = new StringBuilder();
		
		for(int i=0;i<5;i++){
			if(i==0) contactIds.append(i);
			else contactIds.append(","+i);
		}
		System.out.println(contactIds.toString());
	}

}
