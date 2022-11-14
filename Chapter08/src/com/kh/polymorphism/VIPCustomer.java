package com.kh.polymorphism;

public class VIPCustomer extends Customer { // extends 하고 상속받을 부모 입력
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		this.bonusPoint += price * this.bonusRatio;
		return price - (int)(price * this.saleRatio);
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당 상담원의 아이디는 " + this.agentID + "입니다.";
	}
		
	public int getAgentLD() {
		return agentID;
	}
	
	
}


