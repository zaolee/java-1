package com.kh.variable;

public class Constant {

	public static void main(String[] args) {
		System.out.println("상수");
		final int MAX_NUM =100;
		final int MIN_NUM;
		MIN_NUM = 0;
		// 상수 선언시 _와 대문자로!(약속), 선언시 초기화 바로 ㄱㄱ(지향)
		// 상수는 변하지 않아 -> 초기화 이후에는 변경할 수 없음.
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);

	}

}
