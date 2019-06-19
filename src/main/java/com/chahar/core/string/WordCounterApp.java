package com.chahar.core.string;

public class WordCounterApp {

	public static void main(String[] args) {
		String data = "Scholarship is financial aids which provided to selected student for their ability(based on some criteria like test exam in College/University).It encourages student to acheive their goal and plan study and their project(apart from regular study). This differentiates some deserving student amoung others.Student can organize their IT project easily."
				+ "Being IT student is challenge and have to face alot of difficulties including financial unless you does not belong to financial strong background.Managing studying part time and doing part time job is somewhat difficulties.This scholarship remove many hurdles ";

		String[] words = data.split(" ");
		System.out.println(words.length);
	}
}
