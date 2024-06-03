package com.winter.s1.lang;

public class S5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "      win     ter       ";
		System.out.println(name);
		System.out.println(name.length());
		name = name.strip();
		System.out.println(name);
		System.out.println(name.length());
		name = name.replace(" ", "");
		System.out.println(name);
		System.out.println(name.length());

		name = "winter-24*서울";
		// 파싱(parsing)
		name = name.replace("*", "-");
		String[] datas = name.split("-");

		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}

		String s = String.valueOf(10.2);
		System.out.println(10.2 + "");

	}

}
