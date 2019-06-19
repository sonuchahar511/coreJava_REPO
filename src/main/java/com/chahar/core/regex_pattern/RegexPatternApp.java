package com.chahar.core.regex_pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatternApp {

	public static void main(String[] args) {
		String regex = "\\w{2,4}";
		String line = "asia1r";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(line);
		while (m.find()) {
			System.out.println("Found: " + m.group());
			System.out.println("starting at index:" + m.start() + " and ending at index: " + m.end());
		}

	}
}
