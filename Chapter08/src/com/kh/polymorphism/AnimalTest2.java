package com.kh.polymorphism;

import java.util.ArrayList;

import com.kh.polymorphism.animal.Animal;
import com.kh.polymorphism.animal.Eagle;
import com.kh.polymorphism.animal.Human;
import com.kh.polymorphism.animal.Tiger;

public class AnimalTest2 {
	ArrayList<Animal> aniList = new ArrayList<>();
	
	public static void main(String[] args) {
		System.out.println("기본");
		AnimalTest2 aTest = new AnimalTest2();
		aTest.addAnimal();
		
		System.out.println("\n원래 형으로 다운 캐스팅");
		aTest.testCasting();
	}
	private void addAnimal() {
	aniList.add(new Human()); // 업캐스팅
	aniList.add(new Tiger());
	aniList.add(new Eagle());
	
		for (Animal animal : aniList) {
			animal.move(); // 다형성
			// 참조변수가 move 밖에 없기 때문에 각 인스턴스의 고유의 기능들엔 접근 할 수가 없다.
			// -> 다운캐스팅 이용하기.
		}		
	}
	
	public void testCasting() {
		for(int i = 0; i < aniList.size(); i++) { // 인덱스가 0부터 시작이니까
			Animal animal = aniList.get(i); // 이 get은 Animal에 있으니까
			// length를 안쓰는 이유 : ArrayList는 size가 유동적으로 변하기 때문에 length란 개념이 있지 않아.
			
			if(animal instanceof Human) { // 실제 가르키고 있는 인스턴스가 Human인가?
				Human h = (Human) animal; // 형변환
				h.readBook();
			}
			else if(animal instanceof Tiger) {
				Tiger t = (Tiger) animal;
				t.hunting();
			}
			else if(animal instanceof Eagle) {
				Eagle e = (Eagle) animal;
				e.flying();
			}
			else {
				animal.move();
			}
		}
	}

}
