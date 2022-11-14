package com.kh.inheritance;

public class CustomerTest {
	
	public static void main(String[] args) {
		Customer customerZao = new Customer();
		customerZao.setCustomerID(10010);
		customerZao.setCustomerName("리짜오");
		customerZao.bonusPoint = 1000;
		System.out.println(customerZao.showCustomerInfo()+ "\n" );
		
		VIPCustomer customerJoo = new VIPCustomer();
		customerJoo.setCustomerID(10020);
		customerJoo.setCustomerName("5근주");
		customerJoo.bonusPoint = 10000;
		System.out.println(customerJoo.showCustomerInfo());
		
		System.out.println();
		VIPCustomer customerLee = new VIPCustomer(10030, "2소연", 123);
		customerLee.bonusPoint = 10000;
		System.out.println(customerLee.showVIPInfo());
		
		System.out.println();
		Customer customer = new VIPCustomer(); // 반대는 안됨.
		// 업캐스팅 : 자식타입이 부모타입의 인스턴스로 형변환 되는것
		// 상위와 하위간의 형변환이 일어날 수 있지만, 참조변수는 부모타입에만 한정된다, 자식타입에 있는 기능들은 쓸수가 없어.
		System.out.println(customer.showCustomerInfo());
		
		// 업캐스팅의 반대 개념 : 다운캐스팅. 자동으로 형변환이 안되고, 내가 직접 형변환 시켜줘야 돼.
	}

}
