package com.kh.arraycopy;

import com.kh.objectarray.Book;

public class ObjectCopy2 {

	public static void main(String[] args) {
		System.out.println("객체배열 복사하기:깊은복사");
		Book[] bookArray1 = {
				new Book("태흑산맥", "조청래"), 
				new Book("데(미안하)", "헤르만 허세"),
				new Book("아니떻게 살 것인가", "있을유시민")
		}; 
		Book[] bookArray2 = new Book[3];
		
		for(int i = 0; i < bookArray1.length; i++ ) {
			bookArray2[i] = new Book();
			
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		bookArray1[0].setBookName("나무말고 나목");
		bookArray1[0].setAuthor("박완성");
		
		System.out.println("\nbookArray1");
		for (Book book : bookArray1) {
			book.showBookInfo();
		}
		
		System.out.println("\nbookArray2");
		for (Book book : bookArray2) {
			book.showBookInfo();
		}	

	}

}
