package com.winter.study1;

import java.util.Scanner;

public class Study8 {
	
	public static void main(String [] args) {
		//이중 for
		
		//FPS(배그, 서든, 배필,)
		//총알(30발, 탄창 3개)
		//점사, 단발
		
		
		// 1. 단발, 2.점사
		// 탕 *30
		// 타타탕 * 10
		Scanner sc = new Scanner(System.in);
		int tan =3;
		
		for(int i=0;i<tan;i++) {
			System.out.println("1. 단발 2.점사");
			int select = sc.nextInt();
			System.out.println(select);
			int count=10;
			String sound="타타탕";
			if(select ==1) {
				count=30;
				sound="탕";
			}
			
			//for
			for(int j=0;j<count;j++) {
				System.out.println(sound);
			}
		}
		
		
		
		
		
		
	}

}
