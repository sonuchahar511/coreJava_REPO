package com.chahar.core.covariants;

public class CovariantApp {

	/**
	 * 
	 * Both methods have different return type but it is method overriding. This is known as covariant return type
	 */

	public static void main(String[] args) {
		new B().get().message();
		new A().get().message();
	}

}

class A {
	public A get() {
		return this;
	}

	void message() {
		System.out.println("A>>welcome to covariant return type");
	}
}

class B extends A {
	public B get() {
		return this;
	}

	void message() {
		System.out.println("B>>welcome to covariant return type");
	}
}