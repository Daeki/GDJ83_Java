package com.winter.study1;

import java.util.Scanner;

public class Study7 {

	public static void main(String [] args) {
		//반복문 - for, while
		//for(초기식;조건식;증감식){}
		//while(조건식){}
		//do{}while(조건식);
		//break, continue
		//3과목의 점수를 입력 받아서 합계 구하기
		Scanner sc = new Scanner(System.in);

		//입력받아서 합계
		int sum=0;
		for(int i=0;i<3;i++) {
			int num= sc.nextInt();
			//sum=sum+num;
			sum+=num;
			
		}
		
		//'a' -> z 출력 24
		char c='a';
		for(int i=0;i<25;i++) {
			System.out.println(c);
			c++;
		}
		
		for(int i='a';i<='z';i++) {
			System.out.println((char)i);
			c++;
		}
		
		System.out.print("abc");
		System.out.print("def");
		System.out.println("");
		System.out.println("123");
	}
}
