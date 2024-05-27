package com.winter.study1;

public class Study3 {
	
	public static void main(String [] args) {
		//연산자: +, -,*,/,% 
		// + 산술연산자
		// + 연결연산자 : 문자열 + primitive => 문자열
		//sysout + crtl+space
		System.out.println("1"+1);
		System.out.println(1+"1"+1);
		System.out.println(1+'a'+"1");
		
		//물건을 고르고, 물건의 총합계, 돈을 내고 ,
		int total = 15760;
		int don = 50000;
		//잔돈 계산
		int jandon = don-total;
		
		
		
		//만원갯수를 담을 변수 34250
		int man=jandon/10000;
//		int chon=(jandon - man*10000)/1000;
//		int back= (jandon - man*10000-chon*1000)/100;
		int chon = jandon%10000/1000;
		int back = jandon%1000/100;
		
		
		
		
		System.out.println("잔돈 : "+jandon);
		System.out.println("만원 : "+man+"장");
		
		
	}

}
