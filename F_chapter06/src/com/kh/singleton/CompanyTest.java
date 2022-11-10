package com.kh.singleton;

public class CompanyTest {

	public static void main(String[] args) {
		System.out.println("single톤 패턴 실습");
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();

		System.out.println(company1);
		System.out.println(company2);
		System.out.println(company1 == company2);
		
		
	}

}
