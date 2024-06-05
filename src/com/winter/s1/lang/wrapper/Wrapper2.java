package com.winter.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper2 {

	public static void main(String[] args) {
		// 비번길이는 최소 6자 글자 이상
		// 대소문자, 숫자 1개 이상이 있어야 함 isDigit()
		Scanner sc = new Scanner(System.in);

		System.out.println("pw를 입력");
		String pw = sc.next();
		String result = "최소 1 이상의 대문자가 있어야 함";
//		int upper=0;
//		int lower=0;
//		int digit=0;
		boolean upper = false;
		boolean lower = false;
		boolean digit = false;
		for (int i = 0; i < pw.length(); i++) {
			char ch = pw.charAt(i);
			if (Character.isUpperCase(ch)) {
				// upper++;
				upper = true;
			} else if (Character.isLowerCase(ch)) {
				// lower++;
				lower = true;
			} else if (Character.isDigit(ch)) {
				// digit++;
				digit = true;

			} else {

			}
		}
		// upper>0&&lower>0&&digit>0
		if (upper && lower && digit) {
			System.out.println("통과");
		} else {
			System.out.println("fail");
		}

		System.out.println(result);

	}

}
