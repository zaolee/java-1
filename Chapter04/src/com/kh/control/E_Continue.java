package com.kh.control;

public class E_Continue {

	public static void main(String[] args) {
		System.out.println("continue문(분기문)");
		int total = 0;
		
		for(int num =1; num <= 100; num++) {
			//if(num % 2 != 0) {
			//	total += num;
			//}
			if(num % 2 == 0) {
				continue;
			}
			total += num; // 복합대입연산자
		}
		System.out.println("합계: " + total);
		
		System.out.println("\n(짝수)구구단 출력하기");
		
		for(int dan = 2; dan <= 9; dan++) {
			if(dan % 2 != 0) {
				continue;
			} // 홀수는 걸러버림
			System.out.println("\n" + dan + "단gabojago");
			for(int times = 1; times <= 9; times++) {
				System.out.println(dan + " X " + times + " = " + (dan * times));
			}
		}
	}

}
