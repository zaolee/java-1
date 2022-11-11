package com.kh.arraylist;

import java.util.ArrayList;

import com.kh.objectarray.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		System.out.println("ArrayList클래스 사용하기"); // 배열의 단점 개선
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("어린왕자", "생택쥐페리"));
		
		for(int i = 0; i < library.size(); i++) {
			Book book = library.get(i); // alt + shift + L : 변수만들어줌
			
			book.showBookInfo();
		}
		
		
		System.out.println("\n삭제");
		library.remove(1);
		
		for (Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("\nisEmpty 메서드"); // 내용물이 있냐??
		System.out.println(library.isEmpty()); // 가지고 있으면 F	
		library.remove(0);
		library.remove(0);
		System.out.println(library.isEmpty()); // 아무것도 없으면 T

	}

}
