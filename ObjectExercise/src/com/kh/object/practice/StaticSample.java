package com.kh.object.practice;

public class StaticSample {
	static private String value;

	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticSample.value = value;
	}
	
	public static void toUpper() {
		value = value.toUpperCase();
		// value = value.toLowerCase();
	}
	
	public static void setChar(int index, char c) {
		char[] charArr = value.toCharArray(); // ctrl + shift + L = 변수 만들기
		
		charArr[index] = c;
		
		value = String.valueOf(charArr);
	}
	
	public static int valueLength() {
		return value.length();
	}
	
	public static String valueConcat(String str) {
		// return value + str;
		return value.concat(str);
	}
	
	
	


}



