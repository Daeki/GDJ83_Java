package com.winter.s1.lang;

import java.util.Scanner;

public class S1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		// import 생략 :
		// 1. 같은 패키지내의 클래스를 사용할 때
		// 2. java.lang 내의 클래스를 사용할 때
		Object obj = new Object();
		Object obj2 = new Object();
		String n = new String("winter");//
		String n2 = "winter";//

		System.out.println(obj.toString());
		System.out.println(n.toString());

		// 참조변수명.멤버들
		char ch = n.charAt(1);// int index
		System.out.println(ch);

		int l = n.length();
		System.out.println(l);

		System.out.println("문자열 입력");
		n = sc.next();

		for (int i = 0; i < n.length(); i++) {
			ch = n.charAt(i);
			System.out.println(ch);
		}

		System.out.println(n.length() * 1000 + "원입니다");

	}

}
