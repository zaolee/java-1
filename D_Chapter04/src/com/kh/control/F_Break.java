package com.kh.control;

public class F_Break {

	public static void main(String[] args) {
		System.out.println("1부터 random값(1~10)의 합계를 반복문으로 출력하기");
		// 단, 랜덤값이 숫자 5가 나오면 프로그램을 종료한다.
		int sum = 0;
		int random = 0;
		while(true) { // 무한루프 이거 종료시키려면? : 콘솔 옆에 terminate
			sum = 0; // 반복문을 통해 누적된 sum값을 초기화
			random = (int)(Math.random() * 10 + 1);
			
			if(random == 5) {
				break; // for문 안에 있으면 for문만 break인거임. 위치 신경쓰기.
			}
			
			for(int i = 1; i <= random; i++) {
				sum += i; // 복합대입연산자				
			}
			System.out.println("1부터 " + random + "까지의 합계: " + sum);
		} 
		
		System.out.println("프로그램을 종료합니다.");

	}

}
