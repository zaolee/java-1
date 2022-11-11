package com.kh.arraycopy;

import java.util.Iterator;

import com.kh.objectarray.Book;

public class ObjectCopy {

	public static void main(String[] args) {
		System.out.println("객체배열 복사하기:얕은복사");
		Book[] bookArray1 = {
				new Book("태흑산맥", "조청래"), 
				new Book("데(미안하)", "헤르만 허세"),
				new Book("아니떻게 살 것인가", "있을유시민")
		}; 
		Book[] bookArray2 = new Book[3];
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, bookArray1.length);
		
		for (Book book : bookArray2) {
			book.showBookInfo();			
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
