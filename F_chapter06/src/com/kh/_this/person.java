package com.kh._this;

public class person { 
	private String name;
	private int age;
	
	public person() {
		// this.name = "노네임드";
		// this.age = 1;
		this("이름없음", 1); // 코드의 중복을 막고자 이렇게 사용
		System.out.println("기본 생성자 호출"); // 이게 this보다 위로 올라가면 에러발생.
	}
	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
