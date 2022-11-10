package com.kh.objectarray;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		library[0] = new Book("안녕하슈", "2소연");
		library[1] = new Book("안녀하슈크림", "3소연");
		library[2] = new Book("안녕하슈크림보", "4소연");
		library[3] = new Book("안녕하슈크림보물찾기", "5소연");
		library[4] = new Book("안녕하슈크림보물찾기러기", "6소연");
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
	}

}
