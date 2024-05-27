package com.winter.study1;

public class Study2 {
	
	public static void main(String [] args) {
		//
		//Reference type(객체)
		String name=new String("winter");
		Object obj = new Object();
		int age=30;
		String na="1";
		//형변환(Cascading)
		//primitive 타입끼리만 형변환 가능(boolean 제외)
		
			
		//형태의 변환(type의 변환)
		//강제 형변환(명시적 형변환)
		//큰타입을 작은 타입에 넣을 때
		long num1 = 30L;
		int num2 = (int)num1;
		
		float f1 = 1.2F;
		//자동 형변환 (묵시적 형변환)
		//작은타입을 큰타입에 넣을 때
		double d1 = f1;
		
		//자동형변환
		//byte -> short, char -> int -> long -> float -> double
		//수 표현의 갯수(비트 조합)
		//1.0000002
		//1.000000000000011
		
		int total =100;
		double avg = total/3;
		
		avg=33.22;
		total=(int)avg*10;
		
		System.out.println(avg);
		System.out.println(total);
		
		//over flow
		byte b = 127;
		byte b2 = 1;
		b =(byte) (b+b2);
		//under flow
		System.out.println(b);
		
		
		
		//연산자는 같은 타입끼리만 연산이 가능
		//산술연산자 : +, -, *, /, %
		System.out.println(1.2+3);
		
		
		
		
		
		
	}

}
