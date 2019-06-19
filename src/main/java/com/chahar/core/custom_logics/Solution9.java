package com.chahar.core.custom_logics;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//5-8-2015 => WEDNESDAY
      
        int mm = in.nextInt();
        int dd = in.nextInt();
        int yy = in.nextInt();
        in.close();
        
        Calendar cal = new GregorianCalendar(yy,mm,dd);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        String days[]={ "MONDAY","TUESDAY", "WEDNESDAY", "THURSDAY","FRIDAY","SATURDAY","SUNDAY"};

        System.out.println(days[dayOfWeek]);
        
	}
	
}

  