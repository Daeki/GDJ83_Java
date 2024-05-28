package com.winter.study2;

import java.util.Scanner;

public class S2_2 {

	public static void main(String[] args) {

		// 학생 수를 입력 받아서 학생 수 만큼 이름과 국어점수, 영어 점수, 수학 를 입력 받아서 최종 출력
		// a:80, b:90
		Scanner sc = new Scanner(System.in);

		// 1. 학생정보 입력 2. 학생정보 출력 3.프로그램종료
		boolean flag = true;
		int[] nums = null;
		String[] names = null;
		int[] kors = null;
		int[] engs = null;
		int[] maths = null;
		int[] totals = null;
		double[] avgs = null;

		while (flag) {

			System.out.println("1.학생정보 입력 2.학생정보 출력 3.학생정보 검색 4.성적순출력 5.프로그램종료");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("학생 수 입력");
				int count = sc.nextInt();

				nums = new int[count];
				names = new String[count];
				kors = new int[count];
				engs = new int[count];
				maths = new int[count];
				totals = new int[count];
				avgs = new double[count];

				for (int i = 0; i < names.length; i++) {
					nums[i] = i + 1;
					System.out.println("학생 이름 입력");
					names[i] = sc.next();
					System.out.println(names[i] + "의 국어점수 입력");
					kors[i] = sc.nextInt();
					System.out.println(names[i] + "의 영어점수 입력");
					engs[i] = sc.nextInt();
					System.out.println(names[i] + "의 수학점수 입력");
					maths[i] = sc.nextInt();
					totals[i] = kors[i] + engs[i] + maths[i];
					avgs[i] = totals[i] / 3.0;

				}
				break;
			case 2:
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				for (int i = 0; i < names.length; i++) {
					System.out.print(nums[i] + "\t");
					System.out.print(names[i] + "\t");
					System.out.print(kors[i] + "\t");
					System.out.print(engs[i] + "\t");
					System.out.print(maths[i] + "\t");
					System.out.print(totals[i] + "\t");
					System.out.print(avgs[i] + "\n");
				}
				break;
			case 3:
				System.out.println("검색할 학생 번호 입력");
				int n = sc.nextInt();
				for (int i = 0; i < nums.length; i++) {
					if (n == nums[i]) {
						System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
						System.out.print(nums[i] + "\t");
						System.out.print(names[i] + "\t");
						System.out.print(kors[i] + "\t");
						System.out.print(engs[i] + "\t");
						System.out.print(maths[i] + "\t");
						System.out.print(totals[i] + "\t");
						System.out.print(avgs[i] + "\n");

					}
				}

			case 4:
				for (int i = 0; i < avgs.length - 1; i++) {
					for (int j = i + 1; j < avgs.length; i++) {
						if (avgs[i] < avgs[j]) {
							// 둘이 자리를 바꿈
							names[i] = names[j];
							nums[i] = nums[j];
						}
					}
				}

				break;
			default:
				flag = !flag;
			}

		}

	}
}
