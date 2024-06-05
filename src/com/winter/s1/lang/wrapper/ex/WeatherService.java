package com.winter.s1.lang.wrapper.ex;

import java.util.Scanner;

public class WeatherService {

	// Controller Layer
	// Business Layer
	// DAO Layer
	private StringBuffer sb;

	public WeatherService() {
		this.sb = new StringBuffer();
		this.sb.append("서울 , 29.3 - 맑음 - 60");
		this.sb.append("-부산 , 33.6 - 흐림 - 90");
		this.sb.append("-제주 , 26.5 - 눈 - 30");
		this.sb.append("-광주 , 10.6 - 태풍 - 80");
	}

	public WeatherDTO[] init() {
		// sb 에 있는것을 문자열 변수에 담아서 출력
		String info = sb.toString();

		System.out.println(info);
		info = info.replace(",", "-");
		// info= info.replace(" ", "");

		WeatherDTO[] dtos = this.getWeathers(info);

		return dtos;

	}

	private WeatherDTO[] getWeathers(String info) {
		String[] infos = info.split("-");// 20/4
		WeatherDTO[] dtos = new WeatherDTO[infos.length / 4];

		int idx = 0;

		for (int i = 0; i < infos.length; i = i + 4) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(infos[i].trim());

			weatherDTO.setGion(Double.parseDouble(infos[i + 1].trim()));

			weatherDTO.setStatus(infos[i + 2].trim());

			weatherDTO.setHumidity(Integer.parseInt(infos[i + 3].trim()));

			dtos[idx] = weatherDTO;
			idx++;

		}

//		for(int i=0;i<dtos.length;i++) {
//			
//			WeatherDTO weatherDTO = new WeatherDTO();
//			weatherDTO.setCity(infos[idx].trim());
//			idx++;
//			weatherDTO.setGion(Double.parseDouble(infos[idx].trim()));
//			idx++;
//			weatherDTO.setStatus(infos[idx].trim());
//			idx++;
//			weatherDTO.setHumidity(Integer.parseInt(infos[idx].trim()));
//			idx++;
//			dtos[i]=weatherDTO;
//			
//		}

		return dtos;
	}

	// 날씨정보를 도시명으로 검색 해당 날씨정보를 리턴
	// findByCity
	public WeatherDTO findByCity(Scanner sc, WeatherDTO[] ar) {
		WeatherDTO weatherDTO = null;

		System.out.println("검색할 도시명을 입력");
		String cityName = sc.next();

		for (int i = 0; i < ar.length; i++) {
			if (cityName.equals(ar[i].getCity())) {
				weatherDTO = ar[i];
				break;
			}
		}

		return weatherDTO;
	}

}
