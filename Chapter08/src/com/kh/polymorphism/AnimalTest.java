package com.kh.polymorphism;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}	

class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}	
	


public class AnimalTest {
	
	public static void main(String[] args) {
		AnimalTest.moveAnimal(new Human()); // 이렇게 클래스이름으로 접근 가능.
		moveAnimal(new Tiger());
		moveAnimal(new Eagle());
		
		// Animal animal = new Human();
		// animal.move();
		// animal = new Tiger();
		// animal.move();
		// 이과정이 생략된거. 일일히 만들기 귀찮아서 아래처럼 함수 만들어서 쉽게쓰는거.

	}
	public static void moveAnimal(Animal animal) {
		animal.move(); // 이걸 실행시키려면 실행시킬 클래스랑 주소값이 있어야돼.
	
	} // 전달되는 인스턴스에 따라 결과값이 다른게 나옴. -> 다형성
}
