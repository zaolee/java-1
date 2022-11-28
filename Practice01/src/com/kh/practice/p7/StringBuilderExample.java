package com.kh.practice.p7;

public class StringBuilderExample {
	public static void main(String[] args) {
		String str = "";
		for(int i=1; i<=100; i++) {
		str += i;
		}
		System.out.println(str);
		// 작성 위치
		StringBuilder str1 = new StringBuilder();
		
		str1.append(str);
		System.out.println(str1.toString());
		}

}
