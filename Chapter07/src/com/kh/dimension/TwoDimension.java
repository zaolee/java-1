package com.kh.dimension;

public class TwoDimension {

	public static void main(String[] args) {
		System.out.println("이차원 배열");
		int[][] arr = {{1,2,3},{4,5,6}}; // 이차원이라 2개의 인덱스 번호 있어야됨.
					
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		
		System.out.println("\n가변배열"); 	
		// 배열의 행과 열은 같을 필요없음, 행과 열중 둘중 하나만 써도 돼 : 가변배열
		double[][] dArr = new double[2][];
		
		dArr[0] = new double[4];
		dArr[1] = new double[] {1.1, 3.3};
		
		for(int i = 0; i < dArr.length; i++) {
			for(int j = 0; j < dArr[i].length; j++) {
				System.out.print(dArr[i][j] + " ");
			}
			System.out.println();
		}
	
	}
}