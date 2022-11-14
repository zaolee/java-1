package com.kh.polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "2소연");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerJoo = new VIPCustomer(10020, "5근주", 123);
		customerJoo.bonusPoint = 10000;
		System.out.println(customerJoo.showCustomerInfo()); // 다형성
		
		System.out.println("\n===== 할인율과 보너스 포인트 계산 =====");
		int price = 10000;
		int Leeprice = customerLee.calcPrice(price);
		int Jooprice = customerJoo.calcPrice(price);
		
		System.out.println(customerLee.getCustomerName() + "님이 " + Leeprice + "원 지불하셨습니다.");
		System.out.println(customerLee.showCustomerInfo());
		
		System.out.println("\n" + customerJoo.getCustomerName() + "님이 " + Jooprice + "원 지불하셨습니다.");
		System.out.println(customerJoo.showCustomerInfo());

	}

}
