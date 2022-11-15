package com.kh.polymorphism;

public class GoldCustomer extends Customer {
	double saleRatio;

	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		// shift + alt+ s 한담 ~~filed하고 상단에 customer(@@@)이걸로 변경 해줘야됨
		// 그리고 매개값으로는 saleRatio 없으니까 해제하기
		customerGrade = "Glod";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	@Override // 할인률 Gold에 맞춰서 바꿔줘야하니까
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		
		return price - (int)(price * saleRatio);
	}
	
	

}
