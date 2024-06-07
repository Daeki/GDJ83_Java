package com.winter.s2.util.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		String name = "winter";
		int num = 2;
		ar.add(name); // 0
		ar.add(num); // Integer 1
		ar.add(3.12);// Double 2
		ar.add('a'); // 3
		ar.add(false);// 4
		ar.add(num);

		ar.add(1, "test");//

		ar.set(0, 'c');

		ar.remove(0);
		ar.remove(2);

		ar.clear();// 전체삭제
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		LinkedList lk = new LinkedList();
		lk.add("ad");

	}

}
