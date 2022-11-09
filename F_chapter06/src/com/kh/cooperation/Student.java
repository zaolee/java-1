package com.kh.cooperation;

public class Student {
	private String name;
	private int grade;
	private int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(name + "님의 남은 돈은 " + money + "원 입니다." );
	}
	

}
