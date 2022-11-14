package com.kh.inheritance;

public class VIPCustomer extends Customer { // extends 하고 상속받을 부모 입력
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		// super(); 상위클래스 실행 후에 하위클래스가 실행되는거.
		// 하위 클래스 인스턴스를 호출하면 상위 클래스 인서턴스가 실행되고 난 뒤에 실행된다는 뜻.
		// super은 우리가 따로 넣어주지 않아도 컴파일러가 알아서 넣어줌
		
		// setCustomerGrade("Vip"); 
		// 상속을 받더라도 private는 예외. private는 함부로 쓸수가 없음.
		// 1. 게터,세터 만들어서 하기(근접하게 접근)
		
		// 2. private를 protected로 변경하기
		// protected 접근 제한자 : 상속관계인 자식클래스한테 맴버변수 접근이 가능해. 
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		
		System.out.println("VIPcustomer() 생성자 호출");
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		
		System.out.println("VIPcustomer(int, String, int) 생성자 호출");
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + " 담당 상담원의 아이디는 " + this.agentID + "입니다.";
	}
		
	public int getAgentLD() {
		return agentID;
	}
	
	@Override // 오버로딩과는 다르게 선언부가 완전히 동일해. 재정의 하겠다라는 의미.(부모에 있는 매서드 내가 다시 쓸꺼야) 
	// 오버라이드 된 매소드라고 컴파일러에 알려줌
	// alt + shift + s 도가능
	// 오버라이드를 빼버리고 동일한 매서드에 매개변수를 다르게 해서 써도 돼 = 오버로딩
	public int calcPrice(int price) {
		this.bonusPoint += price * this.bonusRatio;
		
		return price - (int)(price * this.saleRatio);
	}
}


