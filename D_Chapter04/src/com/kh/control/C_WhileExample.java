package com.kh.control;

public class C_WhileExample {

	public static void main(String[] args) {
		System.out.println("While문");
		
		int num = 1; // 메서드 안에서 생성된 변수 = 지역변수
		int sum = 0; // 초기화를 진행되지 않은 상태에서 사용할 수 없다.(출력, 연산등..)
		
		while(num <= 10) {
			sum += num;
			num++; // 단독으로 쓰기 때문에 증감이 전위, 후위 노상관.
		}
		
		System.out.println("num의 값은 " + num + "입니다.");
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		System.out.println("\n랜덤값(1~10)까지의 합계구하기");		
		// java.lang.Math
		// java.lang(패키지) 안에 Math(클래스)에서 제공하는 random()(메소드)를 사용해서 랜덤값을 발생
		// class. 은 해당 class안에 있는 함수나 메서드에 접근할 수 있다.
		// int random = Math.random(); 
		// Math.ramdom() 실행 시 랜덤값이 double타입이라 대입 불가능.
		// Math.ramdom() 실행 시 -> 0.0 ~ 0.99999... 사이의 랜덤값을 발생 -> int형으로 변환해버리면 0~0임;;
		// double random = Math.random() * 10 + 1; // 1.0 ~ 10.999... 사이의 값  
		int random = (int) (Math.random() * 10 + 1); // 우선순위 때문에 연산 ()로 우선순위 높히기.
		num = 1; // 이전값 존재하니까 재초기화
		sum = 0;
		
		while (num <= random) {
			sum += num;
			num++;
		}
		System.out.println("random값:" + random); 
		System.out.println("1부터 " + random + "까지의 합은 " + sum);
		
		System.out.println("\ndo-while문");
		
		num = 1;
		
		while(num == 0) { // 조건을 먼저봄. flase = 실행안돼
			System.out.println("while문 수행");
		}
		
		do { // 수행문을 먼저 봐서 실행 시킴
			System.out.println("do-while문 수행");
		} while(num == 0); // ;(세미콜론) 잊지마!!!  조건이 false이기 때문에 반복 안됨.
		
		System.out.println("\n구구단 출력하기(3단gabojago)");
		int dan = 3;
		num = 1; // 곱해지는 수(1~9)
		
		do {
			System.out.println(dan + " X " + num + " = " + (dan * num));
			num++;
		} while(num <= 9);
		
	}

}
