package com.kh.array;

public class ArrayTest1 {

	public static void main(String[] args) {
		System.out.println("배열을 사용하지 않을 때");
		int score1 = 90;
		int score2 = 80;
		int score3 = 70;
		int score4 = 60;
		int score5 = 50; 
		
		System.out.println("다량의 데이터를 기록하고자 할 때");
		System.out.println(score1);
		System.out.println(score2);
		System.out.println(score3);
		System.out.println(score4);
		System.out.println(score5);
		
		System.out.println("\n합계");
		int sum = score1 + score2 + score3 + score4 + score5;
		System.out.println(sum);
		
		System.out.println("\n배열 사용하기");
		int[] score = {90, 80, 70, 60, 50};
		
		for(int i =0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
		System.out.println("\n합계");
		int sum1 = 0;
		for(int i =0; i < score.length; i++) {
			sum1 += score[i];
		}
		System.out.println(sum);
	}
}
