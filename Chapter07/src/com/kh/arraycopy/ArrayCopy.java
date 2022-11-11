package com.kh.arraycopy;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		System.out.println("System클래스에서 제공하는 arraycopy()메소드를 이용한 복사");
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = new int[10];
		
		System.arraycopy(array1, 0, array2, 5, array1.length);
		// (원본, 복사할 첫 위치, 복사할 배열, 몇번째부터?, 몇개?)
		// 원본배열에서 몇개 복사할지, 어느 인덱스에 지정할지 세세하게 사용가능
		
		// 향상된 for문: 배열의 모든 요소를 하나씩 넣어서 실행하는 반복문
		for (int num : array1) {
			System.out.print(num + " ");
		} // system.oun.print() : 줄바꿈 없이 이어서 출력
		System.out.println();
		
		for (int num : array2) {
			System.out.println(num);			
		} // system.out.println() : 값 출력 후, 줄바꿈
		
		System.out.println("\nArrays 클래스에서 제공하는 copyOf()메소드를 이용한 복사");
		// java.lang패키지는 import할 필요 음슴.
		int[] array3 = Arrays.copyOf(array1, 7); // 원본배열, 복사할 배열길이
		// 메소드 오버로드 : 같은 이름으로 쓰는거.(매개변수는 달라) (생성자도 있음)
		for (int num : array3) {
			System.out.print(num + " ");
		}
	
		System.out.println("\n\nclone() 메소드를 이용한 복사");
		int[] array4 = array1.clone(); // ㄹㅇ복사, 크기, 값 다 똑같아
		
		for (int num : array4) {
			System.out.print(num + " ");
		}
	
		System.out.println("\n\nfor문을 이용한 복사");
		int[] array5 = new int[5];
		
		for(int i =0; i < array1.length; i++) {
			array5[i] = array1[i];
		}
		
		for (int num : array5) {
			System.out.print(num + " ");			
		}
		
		System.out.println("\n\narray1~array5까지의 주소값");
		System.out.println(array1);
		System.out.println(array2);
		System.out.println(array3);
		System.out.println(array4); 
		System.out.println(array5); // 각각의 배열은 주소값이 다 달라, 즉 다 다른 메모리
		
	
	}

}
