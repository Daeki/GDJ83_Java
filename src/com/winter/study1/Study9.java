package com.winter.study1;

import java.util.Scanner;

public class Study9 {

	public static void main(String[] args) {

		// 로그인 검증
		// id=1234, pw=5678

		// 로그인 시도 전에 1.로그인, 2.종료
		// 사용자의 id와 pw를 입력 받아서 로그인 시도를 N번 시도
		// 틀리면 로그인 실패 출력, 로그인성공하면 성공을 출력하고 반복문 종료

		// 반복문 종료 후 종료를 선택 했다면 프로그램이 종료
		// 로그인이성공 후 반복문이 종료 되었다면 게임을 시작하자

		// 로그인 검증
		// 키보드 연결
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		// while 시작하기 위한 용도
		boolean flag = true;

		while (flag) {
			System.out.println("1.로그인 2.종료");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.println("id 입력");
				int yId = sc.nextInt();
				System.out.println("pw 입력");
				int yPw = sc.nextInt();

				if (yId == id && yPw == pw) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("로그인 실패");
				}

			} else {
				System.out.println("종료");
				flag = false;
			}

		}
		// ------------ 로그인 검증 끝 --------------------

		if (flag) {
			System.out.println("게임시작");
			int level = 1;
			int mon = 3;
			int gold = 0;
			for (level = 1; level < 15; level++) {
				System.out.println("1.사냥 2.종료");
				int select = sc.nextInt();
				if (select != 1) {
					break;
				}

				if (level % 5 == 0) {
					gold = gold + level / 5 * 1000;
					System.out.println(level + " 축하금 " + level / 5 * 1000 + "지급");

				}

				System.out.println("현재 레벨 : " + level);
				for (int j = 0; j < level * mon; j++) {
					System.out.println(j + 1 + "번째 사냥");
				}

			}
			gold = gold + 3000;
			System.out.println("최종 레벨 : " + level + " 소유 골드 " + gold);
		}

		System.out.println("프로그램이 종료 됩니다");

		// MMORPG :
		// 시작레벨은 1 로 시작해서 15가 만랩
		// GOLD : 0으로 시작
		// 1 -> 2 :3마리
		// 2 -> 3 :6마리
		// 3 -> 4 :9마리
		// ....
		// 14 -> 15 : 42마리
		// 5레벨 달성시 1000G 지급
		// 10레벨 달성시 2000G 지급
		// 15레벨 달성시 3000G 지급

		// 현재 레벨 현재 Gold 출력하고 종료

	}

}
