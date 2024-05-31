package com.winter.s1;

public class S1Main {

	public static void main(String[] args) {

		Object obj = new Object();
		Test test = new Test();
		String str = test.toString();
		System.out.println(str);
		System.out.println(test.toString());

		System.out.println(String.CASE_INSENSITIVE_ORDER);

		String n = new String("winter");
		String name = "winter";
		System.out.println(name.toString());
		System.out.println(name);

	}

}
