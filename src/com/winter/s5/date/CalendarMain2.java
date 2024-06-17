package com.winter.s5.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();

		Calendar birth = Calendar.getInstance();
		// 9532
		birth.set(1995, 2, 2);
		System.out.println(birth.getTime());

		long c = ca.getTimeInMillis();
		System.out.println(c);

		System.out.println(1000 * 60 * 60 * 24 * 2 / 1000 * 60 * 60 * 24);

		System.out.println(c / (1000 * 60 * 60 * 24));

		long b = birth.getTimeInMillis();
		b = b + 1000 * 60 * 60 * 24 * 100L;

		birth.setTimeInMillis(b);

		System.out.println(birth.getTime());

		// 1995-03-12
		String n = "1995-03-12";
		String[] a = n.split("-");
		ca.set(Integer.parseInt(a[0]), Integer.parseInt(a[1]) - 1, Integer.parseInt(a[2]));
		System.out.println(ca.getTime());

		//

		ca = Calendar.getInstance();

		SimpleDateFormat sd = new SimpleDateFormat("yyyy년MM월dd일 HH:mm");
		String s = sd.format(ca.getTime());
		System.out.println(s);

		String id = UUID.randomUUID().toString();
		System.out.println(id);

	}

}
