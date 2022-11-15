package com.kh.object.practice;

public class Application {

	public static void main(String[] args) {
		
		// 기본생성자를 이용하여 첫 번째 Book 객체 생성
		Book book = new Book();
		
		// 매개변수 생성자를 이용하여 두 번째 Book 객체 생성
		Book book2 = new Book("자바의 정석", 20000, 0.2, "윤상섭");
		
		// 객체가 가진 필드 값 출력 확인
		System.out.println(book.information());
		System.out.println(book2.information());
						
		// 첫번째 객체가 가진 값을 setter를 이용하여 수정
		book.setTitle("C언어");
		book.setPrice(30000);
		book.setDiscountRate(0.1);
		book.setAuthor("홍길동");
		
		// 수정된 내용 출력 확인
		System.out.println("\n====================");
		System.out.println("수정된 결과 확인");
		System.out.print(book.getTitle() + " " + book.getPrice() + " " + book.getDiscountRate() + " " + book.getAuthor());
	
		// 각 객체의 할인율을 적용한 책 가격을 계산해서 출력
		// 할인된 가격 = 가격 - (가격 * 할인율)
		System.out.println("\n=======================");
		System.out.println(book.clacprice() + "원");
		System.out.println(book2.clacprice() + "원");
		
	}

}
