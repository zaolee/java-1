package com.kh.practice.p7;
import java.util.StringTokenizer;

public class plitExample {
	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		// 작성 위치
		// #1: split() 메소드 이용
		String[] str1 = str.split(",");
		for (String string : str1) {
			System.out.println(string);
		}
		System.out.println();
		// #2: StringTokenizer 이용
		StringTokenizer str2 = new StringTokenizer(str, ",");
		for (String string : str1) {
			System.out.println(string);
		}
		}

}
//실행 결과
//아이디
//이름
//패스워드
//
//아이디
//이름
//패스워드
