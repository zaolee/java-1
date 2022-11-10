package com.kh.cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student Zao = new Student("Zao", 5000);
		Student Lee = new Student("Lee", 10000);
		Zao.showInfo();
		Lee.showInfo();
		System.err.println();
		
		Bus bus100 = new Bus(100);
		
		bus100.showInfo();
		Zao.takeBus(bus100);
		Zao.showInfo();
		bus100.showInfo();
		
	
		
		System.err.println();
		Subway subwayGreen = new Subway("2호선");
		
		subwayGreen.showInfo();
		Lee.takeSubway(subwayGreen);;
		Lee.showInfo();
		subwayGreen.showInfo();
		
	

	}

}
