package com.kh.variable;

public class Variable {

	public static void main(String[] args) { // 변수 선언은 사용하기 전에 상단에 선언하기!
		int level; // 정수형 변수 level을 선언한다.
		int age = 20; // 변수 선언과 동시에 값을 대입(초기화)		
		
		level = 10; // level 변수에 값 10을 대입한다.
		
		System.out.println(level); // level 값 출력
		System.out.println(age);

	}

}

// 보통 함수 선언시 대문자로 선언
// 변수는 소문자를 지향!
// 변수는 대소문자를 구분한다
// 숫자로 시작(중간, 끝에 들어가는건 됨)또는 예약어를 변수명으로 사용할 수 없다.
