package com.chahar.core.nativecall.noargument;

public class NativeCallApp {

	public static void main(String[] args) {
		HelloJNI hello = new HelloJNI();
		hello.sayHello();
	}
}

class HelloJNI {

	public native void sayHello();

	static {
		System.loadLibrary("hello");
		// Load native library at runtime
		// hello.dll (Windows) or libhello.so (Unixes)
	}

}
