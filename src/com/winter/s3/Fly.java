package com.winter.s3;

public interface Fly extends Landing {

	// 상수 접근지정자는 public 만 가능
	public final static int NUM = 1;
	String NAME = "abc";

	// 추상 메서드
	// 접근지정자 public abstract
//	public abstract void t1();
//	public int t2();
//	abstract String t3(int num);
//	void t4();

	public abstract void flyAble();

}
