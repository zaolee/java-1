package com.kh.practice.p4;

public class Member {
	
	private String id;
	private String name;
	public Member(String id, String name) {
	this.id = id; // blue
	this.name = name; // 이파란
	}
	// 작성 위치
	@Override
	public String toString() {
		return id + ": " + name;

	}
	

}
