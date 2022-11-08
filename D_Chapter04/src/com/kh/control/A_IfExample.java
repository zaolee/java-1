package com.kh.control;

public class A_IfExample {

	public static void main(String[] args) {
		System.out.println("if문, if-eles문");
		int age = 10;
		
		if(age >= 8) { // 조건 만족시 중괄호 명령이 실행됨
			System.out.println(age +"세는 학교에 다닙니다.");			
		} else {
			System.out.println(age +"세는 학교에 다니지 않습니다.");
		}
		
	char gender = 'F';
	if(gender == 'F') {
		System.out.println("여성입니다.");
	} else {
		System.out.println("남성입니다.");
	}
	
	System.out.println("\nif-else if-else문");
	int charge;
	age = 9;
	
	if(age<8) {
		charge = 1000;
		System.out.println("미취학 아동입니다.");
	} else if(age<14) {
		charge = 2000;
		System.out.println("초등학생입니다.");
	} else if(age<20) {
		charge = 2500;
		System.out.println("중, 고등학생입니다.");
	} else {
		charge = 3000;
		System.out.println("일반인입니다.");
	} 
	// 조건이 점차적으로 커지는거면, 작은값 -> 큰값 순으로 기재해야됨.
	// 이전 조건을 처리하면 그다음 조건도 이전조건 전제로 이뤄지는거임.
	System.out.println("입장료는" + charge + "원입니다.");
	
	}

}
