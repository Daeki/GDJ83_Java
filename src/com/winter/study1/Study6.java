package com.winter.study1;

public class Study6 {
	
	public static void main(String [] args) {
		
		int total=300;
		int avg = total/3;
		
		//평균이 90점 이상이면 A
		//평균이 80점 이상이면 B
		//평균이 70점 이상이면 C
		//평균이 60점 이상이면 D
		//그외 F
		//switch case 사용

		
		
		switch(avg/10) {
		case 10:
		case 9:
			System.out.println("A");
			
			
		case 8:
			
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		
		
		
	}

}
