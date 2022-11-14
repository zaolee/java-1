package com.kh.inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		Customer customerZao = new Customer(10010, "리짜오");
		customerZao.bonusPoint = 1000;
		
		VIPCustomer customerJoo = new VIPCustomer(10020, "5근주", 123);
		customerJoo.bonusPoint = 10000;
		
		Customer customerLee = new VIPCustomer(10030, "2소연", 456); // 업캐스팅
		
		int price = 10000;
		
		System.out.println(customerZao.getCustomerName() + "님이 지불해야하는 금액은 " + customerZao.calcPrice(price) + "원 입니다.");
		
		System.out.println(customerJoo.getCustomerName() + "님이 지불해야하는 금액은 " + customerJoo.calcPrice(price) + "원 입니다.");

		System.out.println(customerLee.getCustomerName() + "님이 지불해야하는 금액은 " + customerJoo.calcPrice(price) + "원 입니다.");
		
		
	}
	

}
