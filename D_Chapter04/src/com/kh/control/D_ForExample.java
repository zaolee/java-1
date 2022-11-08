package com.kh.control;

public class D_ForExample {

	public static void main(String[] args) {
		System.out.println("for문");
		
		int sum = 0; // for문 뿐만 아니라 이후에도 사용
		
		for (int i = 1; i <= 10; i++) { // 변수 for문 안에다 선언가능
			sum += i;
		} // i는 for문을 위한 변수, 종료되면 소멸돼
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		System.out.println("\n구구단 출력하기(8단gabojago)");
		
		for(int i = 1; i <= 9; i++) {
			System.out.println("8 X " + i + " = " + (8 * i));
		}
		
		System.out.println("\n중첩된 반복문");
		
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println(dan + "단gabojago");
			for(int times = 1; times <= 9; times++) {
				System.out.println(dan + " X " + times + " = " + (dan * times));
			}
			System.out.println("\n");
		}

	}

}
