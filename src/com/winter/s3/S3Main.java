package com.winter.s3;

public class S3Main {

	public static void main(String[] args) {
		// 배열 선언
		Tiger tiger = new Tiger();
		tiger.age = 5;
		tiger.name = "호돌이";
		tiger.power = 500;

		Penguin penguin = new Penguin();
		penguin.age = 3;
		penguin.name = "펭수";
		penguin.wing = 2;

		Animal animal = tiger;
		animal = penguin;

		System.out.println(animal.name);
		// System.out.println(animal.power);

		penguin = (Penguin) animal;

		Animal[] dropShip = new Animal[8];

		dropShip[0] = tiger;
		dropShip[1] = penguin;

		Tiger ani = (Tiger) dropShip[0];

		Eagle eagle = new Eagle();
		AirPlane airPlane = new AirPlane();

		Fly fly = eagle;
		fly = airPlane;

	}

}
