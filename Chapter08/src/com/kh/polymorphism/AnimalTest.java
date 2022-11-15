package com.kh.polymorphism;

import com.kh.polymorphism.animal.Animal;
import com.kh.polymorphism.animal.Eagle;
import com.kh.polymorphism.animal.Human;
import com.kh.polymorphism.animal.Tiger;

public class AnimalTest {
	
	public static void main(String[] args) {
		System.out.println("업캐스팅 테스트");
		AnimalTest.moveAnimal(new Human()); // 이렇게 클래스이름으로 접근 가능.
		moveAnimal(new Tiger());
		moveAnimal(new Eagle()); // ctrl + shift + o(영어) : 인풋 저절로 넣어줌
		
		// Animal human = new Human(); // 업캐스팅
		// Animal tiger = new Tiger();
		// Animal eagle = new Eagle();
		// moveAnimal(human);
		// moveAnimal(tiger);
		// moveAnimal(eagle);
		// 이과정이 생략된거. 일일히 만들기 귀찮아서 아래처럼 함수 만들어서 쉽게쓰는거.
		 // 전달되는 인스턴스에 따라 결과값이 다른게 나옴. -> 다형성
		

	}
	
	public static void moveAnimal(Animal animal) {
		animal.move(); // 이걸 실행시키려면 실행시킬 클래스랑 주소값이 있어야돼.
		
		
	
	}
}
