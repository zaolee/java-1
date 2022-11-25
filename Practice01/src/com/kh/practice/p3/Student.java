package com.kh.practice.p3;

public class Student {
	
	private String studentNum;
	public Student(String studentNum) {
	this.studentNum = studentNum;
	}
	public String getStudentNum() {
	return studentNum;
	}
	// 작성 위치

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student1 = (Student) obj;
			if(this.studentNum == student1.studentNum) {
				return true;
			}
		}
		return false;		
	}	
}
