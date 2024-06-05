package com.winter.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력");
		// 991225-1234567
		String jumin = sc.next();

		// 1. 성별검증
		char ch = jumin.charAt(7);
		jumin.substring(7, 8);
		System.out.println((int) ch);
		if (ch % 2 == 0) {

		} else {

		}
//		if(ch == '1' || ch=='3') {
//			
//		}else {
//			
//		}

		// 2. 나이를 계산 2024-출생년
		String y = jumin.substring(0, 2);

		int r = 1900;
		if (ch == '3' || ch == '4') {
			r = 2000;
		}

		int year = r + Integer.parseInt(y);
		System.out.println(2024 - year);

		// 3. 주민번호 유효성 검증
		// 9 5 1 2 2 6 - 1 2 3 4 5 6 7(검증용 숫자)
		// *2 *3 *4 *5 *6 *7 *8 *9 *2 *3 *4 *5
		// 18 15 4 10 12 42 8 18 6 12 20 30
		// 122
		// 총합을 11로 나눈 나머지를 구하기
		// 122%11 -- 1
		// 나머지 11로 뺀 결과값을 검증용 숫자와 같은지 비교
		// 11-1 => 10
		// 11로 뺀 결과값이 2자리수 라면
		// 뺀 결과값을 10으로 나눈 나머지를 검증용 숫자와 같은지 비교
		// 10%10 --> 0
		int c = 2;
		int sum = 0;
		// jumin.replace("-", "");
		for (int i = 0; i < jumin.length() - 1; i++) {
			char n1 = jumin.charAt(i);
			if (n1 == '-') {
				continue;
			}
			String n2 = String.valueOf(n1);
			int num1 = Integer.parseInt(n2);
			sum = sum + num1 * c;
			c++;
			if (c > 9) {
				c = 2;
			}
		}

		// sum = sum%11;
		sum %= 11;
		sum = 11 - sum;
		if (sum > 9) {
			sum = sum % 10;
		}

		int a = Integer.parseInt(String.valueOf(jumin.charAt(jumin.length() - 1)));
		if (sum == a) {
			System.out.println("OK");
		} else {
			System.out.println("재발급");
		}

	}

}
