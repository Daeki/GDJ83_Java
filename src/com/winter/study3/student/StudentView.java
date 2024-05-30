package com.winter.study3.student;

public class StudentView {

	public void view3(String str) {
		System.out.println(str);
	}

	public void view2(Student student) {
		System.out.println(student.num);
		System.out.println(student.name);
	}

	public void view(Student[] students) {
		// 학생들의 모든 정보 출력
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			System.out.println(student.num);
			System.out.println(students[i].name);
		}

	}

}
