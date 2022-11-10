package com.kh._static;

public class Student {
	private static int serialNum = 1000; // 정적변수 = static변수, 클래스 내부에 기재
	
	private int studentId;	
	private String studentName;	
	private int grade;	
	private String address;
	
	public Student() {
		studentId = ++serialNum;
	} // 이렇게 해줘야 각 학생마다 고유의 시리얼넘이 들어가, 차곡차곡 쌓이는거
	
	// private로 만든 변수 다 게터,세터 해주기
	
	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	} 
	// this가 없는 이유 : 객체(this)가 생성되기 전에 진작에 만들어졌음.
	// 클래스 호출후 사용하면 됨.

	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void studentInfo() {
		System.out.println(studentName + "학번 : " + studentId);
	}
	
	
	
	
	

}
