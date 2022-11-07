package com.kh.operation;

public class OperationEx2 {

	public static void main(String[] args) {
		System.out.println("관계연산자");
		int myAge = 26;
		boolean value = (myAge > 25);
		System.out.println(value);
		
		value = ('A' == 65); // 65 == 65 (정수형이 범위가 더 커)
		System.out.println(value);
		
		value = (3 == 3.0); // 3.0 == 3.0 (묵시적형변환)
		System.out.println(value);
		
		value = (0.1 == 0.1f); // 부동소수점 -> 오차발생
		System.out.println(value);
		// 비교연산 사용시 실수보단 정수를 선호
		
		System.out.println("\nmyAge값이 짝수인지, 홀수인지 판단해보자.");
		value = (myAge % 2) == 0; 
		System.out.println("myAge는 짝수인가??" + value);
		
		value = (myAge % 2) != 0; 
		System.out.println("myAge는 홀수인가??" + value);
		
		System.out.println("\n논리연산자");
		int num1 = 10;
		int num2 = 20;
		
		boolean flag = (num1 > 0) && (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 < 0) && (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 < 0) || (num2 > 0);
		System.out.println(flag);
		
		System.out.println("\nnum1의 값이 1부터 100사이의 값인지 확인하기");
		// flag = (1 <= num1 <= 100) 즉, (1 <= num1)-> (t <= 100)이란 뜻
		flag = (1 <= num1) && (num1 <= 100);
		System.out.println(flag);
		
		System.out.println("\n단락회로평가");
		int i = 2;
		num1 = 10;
		
		value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); // i는 아에 수행이 되지않음
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
	}

}
