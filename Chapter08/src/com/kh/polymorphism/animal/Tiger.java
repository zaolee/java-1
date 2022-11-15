package com.kh.polymorphism.animal;

public class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	// Tiger 클래스에만 있는 method
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
