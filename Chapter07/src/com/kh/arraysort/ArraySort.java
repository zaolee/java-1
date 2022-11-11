package com.kh.arraysort;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
	// 정렬 : 데이터를 순차적으로 나열하는 과정을 정렬이라고 한다.(성적순, 이름순, 최신순, 인기순..)
	// 오름차순정렬(Ascending, ASC)은 작은 데이터부터 큰 데이터로 나열하는 방식이다.
	// 내림차순정렬(Descending, DESC)은 큰 데이터부터 작은 데이터로 나열하는 방식이다.
	// 종류 : 선택정렬, 버블정렬, 삽입정렬, 큌정렬, 병합정렬, 쉘정렬, 기타..
	public static void main(String[] args) {
		System.out.println("배열의 정렬");
		int[] arr = {2, 5, 7, 1, 3};
		
		for (int num : arr) {
			System.out.print(num + " ");
		}
		
		System.out.println("\n\n오름차순으로 정렬");
		Arrays.sort(arr);
		for (int num : arr) {
			System.out.print(num + " ");
		}
		
		System.out.println("\n\n내림차순으로 정렬");
		// 1. for문을 사용해서 오름차순으로 정렬된 배열의 값을반대로 새로운 배열에 대입한다.
		// 2. wrapper 클래스를 사용하는 방법
		// Integer[] integerArray = {new Integer(2), new Integer(5), 7, 1, 3};
		// 찍 그어진 이유 : 이제 안씀.. 하위버전에서 사용가능..(주석풀면 그어져)
		Integer[] integerArray = {2, 5, 7, 1, 3}; // 자동으로 인스턴스 생성, 오토박싱
		// 기본자료형을 객체로 만드는거..
		Arrays.sort(integerArray, Collections.reverseOrder());
		System.out.print(Arrays.toString(integerArray));
		
		System.out.println("\n\n문자열 정렬"); // 문자열은 Arrays.뭐시기 -> object로 선택하기
		String[] strArr = {"apple", "orange", "banana", "메론", "레몬"};
		System.out.print(Arrays.toString(strArr));
		
		System.out.println("\n\n오름차순으로 정렬");
		Arrays.sort(strArr);
		System.out.print(Arrays.toString(strArr));
		
		System.out.println("\n\n내림차순으로 정렬"); 
		Arrays.sort(strArr, Collections.reverseOrder());
		System.out.print(Arrays.toString(strArr)); // 이런 기능은 참조변수만 사용가능.
		
		
	}

}
