package com.winter.s1.lang.wrapper.ex;

public class WeatherView {

	// view
	// 날씨들의 정보를 받아서 이쁘게 출력
	public void view(WeatherDTO[] dtos) {

		for (int i = 0; i < dtos.length; i++) {
			System.out.println(dtos[i].getCity());
			System.out.println(dtos[i].getGion());
			System.out.println("===================");
		}

	}

}
