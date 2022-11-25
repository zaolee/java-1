package com.kh.operation;

public class OperationEx1 {

	public static void main(String[] args) {
		System.out.println("부호 연산자");
		int num = 10;
		
		System.out.println(num);
		System.out.println(-num);
		System.out.println(num); // 실제 값은 변하지않아.
		
		// 아에 바꿔주고 싶으면??
		num = -num; // + 부호는 현상 유지, - 부호는 부호를 바꿔주는것
		System.out.println(num); // 아에 바뀜
		System.out.println(-num);
		System.out.println(+num);
		
		System.out.println("\n산술연산자");
		int mathScore = 85;
		int engScore = 70;
		
		int totalScore = mathScore + engScore; 
		// 대입연산자 우선순위가 제일 낮아서 + 먼저 진행된거
		
		System.out.println("총점:" + totalScore);
		
		double avgScore = totalScore / (double)2; 
		// or 2를 2.0으로 기재해야됨.
		// 그냥 2를 기재하면 totalScore와 같이 둘다 정수형이라서 소수점을 구하지않음
		// 2가 double형이면 int보단 double형이 더 큰 개념이기때문에 자동으로 형 변환 일어남
		System.out.println("평균:" + avgScore);
		
		System.out.println(10 % 3); // 나머지 연산
		System.out.println(35.0 % 10.0); // 실수 역시 나머지 연산 가능
		
		System.out.println("\n증가 감소 연산자");
		int gameScore = 150;
		int lastScore = ++gameScore; // gamseScore = gameScore + 1
		
		System.out.println(lastScore);
		
		int lastScore2 = --gameScore; // gamseScore = gameScore - 1
		
		System.out.println(lastScore2);
		System.out.println(gameScore); // 부호연산자과 다름
		
		int value = 10;
		int num2 = value++; //문장이 끝나고난 다음 ++ 인식
		
		System.out.println(num2);
		System.out.println(value);
		
		System.out.println("\n실습 문제");
		int number = 20;
		int result = number++ * 3;
		
		System.out.println(number); //21
		System.out.println(result); //60
		
		int number1 = 10;
		int number2 = 20;
		int number3 = 30;
		
		System.out.println(number1++); //10 
		System.out.println((++number1)+(number2++));//32
		System.out.println((number1++)+(--number2)+(--number3));//61
		
		System.out.println(number1);//13
		System.out.println(number2);//20
		System.out.println(number3);//29
		// 후위연산은 무조건 문장이 종료된 뒤에 실행됨. 해당연산과는 노상관
	}
}
