package com.winter.s2;

public class MidStudent extends Student {
	private int history;

	public MidStudent() {
		super(10);

	}

	public void midInfo() {
		super.info();
		System.out.println(this.history);
	}

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}

}
