package com.kh.inherit;



public class Application {
	
	public static void main(String[] args) {
		System.out.println("학생정보 출력");
		
		Person[] studentList = {
			(new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과")),
			(new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과")),
			(new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과"))
		};
		
		for (Person person : studentList) {
			System.out.println(person.information());
		}
	}

}
