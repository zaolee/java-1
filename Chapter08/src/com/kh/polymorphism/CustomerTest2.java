package com.kh.polymorphism;

import java.util.ArrayList;

public class CustomerTest2 {

	public static void main(String[] args) {
		System.out.println("배열을 활용한 다형성");
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		// import 구문 써서 패키지 생략하기. 그거 싫으면 앞에 일일히 써줌 됨ㅋ
		// Customer 인스턴스를 상속할수 있는 클래스만 만들수 있다.
		customerList.add(new Customer(10010, "신짱구")); 
		// customerList의 ArrayList에 인스턴스 생성중
		customerList.add(new Customer(10020, "철수"));
		customerList.add(new GoldCustomer(10030, "맹구")); // 업캐스팅
		customerList.add(new GoldCustomer(10040, "유리"));
		customerList.add(new VIPCustomer(10050, "훈발이", 123));
		
		System.out.println("\n===== 고객 정보 출력 =====");
		
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("\n===== 할인율과 보너스 포인트 계산 =====");
		int price = 10000;
		
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다. 보유하신 포인트는 " + customer.bonusPoint + "점 입니다.");
		}
	}
}
