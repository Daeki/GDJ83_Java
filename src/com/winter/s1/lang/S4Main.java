package com.winter.s1.lang;

import java.util.Scanner;

public class S4Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "computer Science";

		String result = name.substring(3);
		// puter Science

		result = name.substring(3, 5);

		System.out.println(result);

		System.out.println("파일명을 입력하세요 확장자 포함");
		name = sc.next();// abc.pdf

		// 확장자만 분리
		// jpg, png, gif, jpeg, jiff
		int idx = name.lastIndexOf(".");
		result = name.substring(idx + 1);
		System.out.println(result);

		String[] files = { "jpg", "png", "gif" };

		for (int i = 0; i < files.length; i++) {
			if (result.equals(files[i])) {
				System.out.println("이미지파일");
				break;
			}
		}

//		switch(result) {
//		case "jpg":
//			System.out.println("이미지파일");
//			break;
//		case "gif":
//			System.out.println("이미지파일");
//			break;
//		default:
//			System.out.println("이미지파일 X");
//		}

//		if(result.equals("jpg") || result.equals("gif")) {
//			System.out.println("이미지파일");
//		}else {
//			System.out.println("이미지파일 X");
//		}

//		if(result.equals("jpg")) {
//			System.out.println("이미지파일");
//		}else if(result.equals("png")) {
//			System.out.println("이미지파일");
//		}else {
//			
//		}

		String n = " ";
	}

}
