package com.winter.s4;

public final class Car {

	// 접근지정자 [그외지정자] 데이터타입 변수명;
	public static final String COMPANY = "abc";

	//
	public final int MAX_PRICE;
//	{
//		this.price=30;
//	}

	public Car() {
		// TODO Auto-generated constructor stub
		this.MAX_PRICE = 100;
	}

	public static void info() {
		System.out.println(Car.COMPANY);
		// System.out.println(this.price);
		System.out.println("static method");
		// this.info2();
	}

	public final void info2() {
		Car.info();
		System.out.println(Car.COMPANY);
		final int num = 30;

	}

}
