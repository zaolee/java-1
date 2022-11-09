package com.kh._this;

class BirthDay{
	int day;
	int month;
	int year;
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis(){
		System.out.println(this);
	}
	
	
}

public class ThisExample {
	public static void main(String[] args) {
		BirthDay day = new BirthDay();
		
		day.setYear(2000);
				
		System.out.println(day);
		day.printThis();
		

	}

}
