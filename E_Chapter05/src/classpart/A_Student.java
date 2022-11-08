package classpart;

public class A_Student { // main메서드는 프로그램을 실행시키기 위한것, 지금은 객체 만드는거라 안쓸꺼임.
	int studentId; // 학번
	String studentName; // 학생이름
	int grade; // 학년
	String address; // 사는곳
	
	public void showStudentInfo() { // 객체의 기능(속성을 실행시켜주는 기능)
		System.out.println(studentName + "은(는) " + address +"에 산다.");		
	}
}
