package com.winter.s1.lang.wrapper.ex;

public class WeatherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DTO (Data Transfer Object)
		// VO (Value Object)

		WeatherDTO[] dtos = new WeatherService().init();
		WeatherView v = new WeatherView();
		v.view(dtos);

	}

}
