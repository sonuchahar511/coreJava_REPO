package com.chahar.core.covariants;

import java.util.ArrayList;
import java.util.List;
/** Java Covariant.
 * 
 * 
 * 
 * */
public class CheckCovianceApp {
	public static void main(String[] args) {
		/*List<Integer> myInts = new ArrayList<>();
		myInts.add(1);
		myInts.add(2);*/
//		List<Number> myNums = myInts; 
//		above line would throw compilation error.
		Integer[] myIntArr=new Integer[5];
		myIntArr[0]=1;
		myIntArr[1]=2;
		Number[] myNumArr=myIntArr;
	}
}
