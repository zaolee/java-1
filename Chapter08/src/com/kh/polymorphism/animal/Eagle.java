package com.kh.polymorphism.animal;

public class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	// Eagle 클래스에만 있는 method
	public void flying() {
		System.out.println("독수리가 날개를 쫙쫙 펴서 멀리 날아갑니다.");
	}
}
