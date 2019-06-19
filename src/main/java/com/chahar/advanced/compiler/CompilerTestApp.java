package com.chahar.advanced.compiler;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class CompilerTestApp {

	@SuppressWarnings("restriction")
	public static void main(String[] args) {
		JavaCompiler comp=ToolProvider.getSystemJavaCompiler();
		
		int i=comp.run(System.in, System.out, System.err, "CloneDemoApp.java");
		System.out.println(i);
		
	}

}
