package com.winter.study2;

public class S2 {

	public static void main(String[] args) {
		// 배열 - 하나의 변수로 여러개의 데이터를 다룰때 사용
		// let ar = [1,2,3, 'a', true]
		// 같은 데이터타입만 모을 수 있다.
		// 배열 선언
		// 모을려고하는데이터타입명 [] 변수명 = new 모을려고하는데이터타입명 [갯수]
		// 변수 선언
		// 데이터타입명 변수명;
		// String name;

		int num = 0;
		double n2 = 0.0;
		char ch = ' ';
		boolean flag = false;
		String name = null;

		int[] ar = new int[3];
		int[] ar2 = { 1, 2, 3 };

		String[] names = new String[2];
		System.out.println(names);

		System.out.println(num);

		System.out.println(ar[0]);
		System.out.println(names[0]);
		ar[0] = 50;
		ar = ar2;
		System.out.println(ar[0]);

	}

}
