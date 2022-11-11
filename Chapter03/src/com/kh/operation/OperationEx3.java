package com.kh.operation;

public class OperationEx3 {

	public static void main(String[] args) {
		System.out.println("복합대입연산자");
		int number = 12;
		String str = "Hello~!"; 
		
		number += 3; // number = 12(number) + 3;
		System.out.println("\"number+=3은\" " + number);
		
		number -= 5;
		System.out.println("\"number-=5는\" " + number);
		
		str += "\tworld~!"; // 문자열에서 '+'는 이어붙인다는 의미
		System.out.println(str); 
		// /t : tab을 나타내는 문자(escape문자열)
		// /n : newline, 줄바꿈
		
		str += 123; // str = str + "123";
		System.out.println(str);
		
		System.out.println("\n조건연산자(삼항연산자)");
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch = (fatherAge > motherAge)? 'T' : 'F'; // (조건)?(참일때 결과):(거짓일때 결과)
		System.out.println(ch);
		
		System.out.println("\nnum의 값이 짝수인지 음수인지 판별 후 출력");
		int num = 26;
		String result = ""; // 사용하기전에 빈문자를 초기화 시키기
		result = ((num % 2) == 0) ? "짝수입니다." : "홀수입니다.";
		System.out.println(result);
	}
}
