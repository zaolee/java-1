package com.kh.object.practice;

public class Book {
	private String title; // 도서명
	private int price; // 가격
	private double discountRate; // 할인율
	private String author; // 저자명
	
	public Book() {
				
	}	

	
	public Book(String title, int price, double discountRate, String author) {
		super();
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	public int clacprice() {
		double clacprice =	price - (price * discountRate);
		System.out.println("도서명 = " +  this.title);
		return (int) clacprice;
	}

	String information;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
