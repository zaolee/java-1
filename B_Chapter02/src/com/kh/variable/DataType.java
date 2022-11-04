package com.kh.variable;

public class DataType {

	public static void main(String[] args) {
		System.out.println("정수형");
		// byte형 (-128~-127)
		byte bs1 = -128;
		
		// short형 (-32468~32767)
		short s = 32767;
		
		// int형 (-2,147,483,648~2,147,483,647)
		int iNum = 10;
		int result = bs1 +s; // 자료형을 short이라 하면 error남
		// 연산을 할때는 기존 short, byte여도 정수형으로 변환됨.
		
		// long형 (-9,223,372,036,854,775,808~9,223,372,036,854,775,807)
		long lNum = 1234567891234l; // 8바이트 정수를 담은수 있는 변수 선언
		// 코드에서 작성되는 값 = 리터럴 
		// 자바에서 기본 값 = int타입 
		// int범위 이상인 수는 표현x, 숫자뒤에 long의 리터럴이란것을 명시해줘야됨.
 		
		System.out.println(bs1);
		System.out.println(s);
		System.out.println(iNum);
		System.out.println(lNum);
		
		
		System.out.println("\n문자형");
		char ch1 = '뷁';
		char ch2 = '\uBBA4'; // 유니코드를 넣어도 됨
		char ch3 = '\u0000'; // 빈문자를 뜻하는 유니코드
		char ch4 = 66; // 정수값에 해당하는 문자코드 출력가능
		// 인코딩값에는 음수가 존재하지 않음 -> error남
		
		String str = "ABCD"; 
		// 여러개의 문자열 출력시 String타입(클래스)과 ""이용하기
		
		System.out.println(ch1);
		System.out.println((int)ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(str);
		
		System.out.println("\n실수형");
		// float형
		float fNum = 3.14f; // 실수형의 기본형은 double형이기때문에 float형임을 명시해줘야됨.
		double dNum = 3.14;
		System.out.println(fNum);
		System.out.println(dNum);
		
		System.out.println("\n논리형");
		boolean isMarried = false;
		
		System.out.println(isMarried);
	}

}
