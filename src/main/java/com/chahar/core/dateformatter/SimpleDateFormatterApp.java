package com.chahar.core.dateformatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatterApp {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MMM/yyy:HH:mm:ss");
		SimpleDateFormat dateFormatter1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat dateFormatter2 = new SimpleDateFormat("yyyy-MM-dd");
		
		Date result = dateFormatter1.parse("2018-09-25 18:30:33.0");
		
		System.out.println(result);
		
		System.out.println(dateFormatter2.format(new Date() ));
		
		SimpleDateFormat dateFormatter4 = new SimpleDateFormat("yyyyMMdd_HHmmssSSS");
		System.out.println("result= "+dateFormatter4.format(new Date() ));
		
	}

}
