package com.kh.array;

public class CharArray {

	public static void main(String[] args) {
		System.out.println("문자 배열 출력하기");
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for (int i = 0; i < alphabets.length; i++, ch++) {
			alphabets[i] = ch;
			
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
		}
	}
}