package com.kh.variable;

public class Conversion {

	public static void main(String[] args) {
		System.out.println("묵시적 형 변환");
		byte bNum = 10;
		int iNum = bNum;
		float fNum = iNum;
		double dNum = fNum;
		// 손실이 발생하지 않아, 자동적으로 변환됨
		
		System.out.println(bNum);
		System.out.println(iNum); 
		System.out.println(fNum); 
		System.out.println(dNum); 
		
		System.out.println("\n명시적 형 변환");
		dNum = 1.2;
		fNum = (float)dNum; 
		// 더 좁은 범위로 들어가기 때문에 손실이 날수 있음 -> 손실을 감안하고 형 변환하고 싶다고 알려주는거
		
		System.out.println(dNum);
		System.out.println(fNum);
		
		System.out.println("\n데이터 손실 테스트");
		iNum = 290;
		bNum = (byte)iNum;
		System.out.println(iNum);
		System.out.println(bNum);
		System.out.println((int)fNum);
		
		System.out.println("\n연산 시 형 변환 테스트");
		double result1 = 12 + 3.3; // 연산을 하려면 좌우로 데이터타입이 같아야함
		long result2 = 30 + 30; // long로 형변환하여 저장(60L)
		long result3 = 30 + 30L; // long타입으로 맞춰줘야됨, int형이면 에러남
		int result4 = (int)10.0 + (int)5.5; // int형 변환하여 저장
		int result5 = (int)(10.0 + 5.5); // int형 변환하여 저장
		
		// "Hello" + "World" => "HelloWorld" 
		// "result1:" + "60" => "result1:60"
		// 문자열에서의 + 연산자는 문자열을 서로 연결하는 연산자이다.
		// 피연산자 중에 한쪽이 문자열이면 다른 피연산자를 문자열로 변환하고 서로 연결한다.
		System.out.println("result1:" + result1); // 문자열
		System.out.println("result2:" + result2);		
		System.out.println("result3:" + result3);		
		System.out.println("result4:" + result4);		
		System.out.println("result5:" + result5);
		
		System.out.println("\n연습문제 Q4, Q5");
		// Q4
		int sip = 10;
		double e = 2;
		System.out.println("더하기:" + (int)(sip + e)  );
		System.out.println("빼기:" + (int)(sip - e) );
		System.out.println("곱하기:" + (int)(sip * e) );
		System.out.println("나누기:" + (int)(sip / e) );
		
		// Q5
		char guel = '\uAE00'; // (\)u 유니코드를 쓰겠다 라는 기호
		System.out.println(guel);
	}

}
