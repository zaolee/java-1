package com.kh.polymorphism.animal;

public class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	// Human 클래스에만 있는 method
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
