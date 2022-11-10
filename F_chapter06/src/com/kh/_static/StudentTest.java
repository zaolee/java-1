package com.kh._static;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("Static변수 선언하기");
		Student studentLee = new Student(); // 컴파일러가 자동으로 생성해준 생성자
		
		studentLee.setStudentName("리짜오");
		System.out.println(Student.getSerialNum());
		studentLee.studentInfo();
		System.out.println();

		Student studentOh = new Student();
		
		studentOh.setStudentName("5근주");
		System.out.println(studentOh.getSerialNum()); 
		// static변수인데 굳이 인스턴스 변수처럼 쓰니까 이클립스가 노란줄로 알려주는거.
		// 그냥 Student(클래스이름)으로 접근하면 됨. 그렇게 구별하는거.
		studentOh.studentInfo();
		
		// System.out.println(studentLee.serialNum); // 1001
		// System.out.println(studentOh.serialNum); // 1001
		// 인스턴스 Lee, Oh가 서로 seriaNum을 공유하고 있기때문에 같은 값이 나옴
		


	}

}
