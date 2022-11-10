package com.kh.array;

public class ArrayTest2 {

	public static void main(String[] args) {
		System.out.println("배열 선언 후에 초기화");
		int[] studentIds1 = new int[5];
		
		System.out.println("초기화 전");
		System.out.println(studentIds1[0]);
		System.out.println(studentIds1[1]);
		System.out.println(studentIds1[2]);
		System.out.println(studentIds1[3]);
		System.out.println(studentIds1[4]);
		
		// 아직 초기화 전이라 int:0, double:0.0, String:null로 출력됨

		studentIds1[0] = 100;
		studentIds1[1] = 200;
		studentIds1[2] = 300;
		studentIds1[3] = 400;
		studentIds1[4] = 500;
		
		System.out.println("\n초기화 후"); // 반복문으로 출력하겠음
		for (int i = 0; i < studentIds1.length; i++) {
			System.out.println(studentIds1[i]);
		}
		
		System.out.println("\n선언과 동시에 초기화1");
		int[] studentIds2 = new int[] {100, 200, 300, 400, 500};
		for (int j = 0; j < studentIds2.length; j++) {
			System.out.println(studentIds2[j]);
		}
		
		System.out.println("\n선언과 동시에 초기화2");
		int[] studentIds3 = {100, 200, 300, 400, 500};
		for (int m = 0; m < studentIds3.length; m++) {
			System.out.println(studentIds3[m]);
		}
		// 값의 목록만 적어서 배열 선언할꺼면, 무조건 선언과 동시에 초기화 해야대
	}

}
