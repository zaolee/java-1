package com.kh.singleton;

public class Company {
	private static Company instance = new Company();
	private Company() {				
	}
	
	public static Company getInstance() {
		if(instance == null) { // 참조값을 가지고 있지 않다.
		// null은 참조변수에만 사용가능, 참조변수가 힙메모리에 주소값이 없다. 할당하고 있지 않다.
			instance = new Company();
		}
		return instance;
	}
	
}
