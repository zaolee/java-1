package classpart;

public class C_StudentTest {

	public static void main(String[] args) {
		System.out.println("main매서드를 이용하여 객체 생성하기");
		
		A_Student studentzao = new A_Student(); // 클래스(설계도) 가져와서 이제 객체 생성할꺼임.
		// 해당 객체의 각각의 변수 메모리 공간이 생성됨. 지금 이게 스택메모리 안에 객체 생성중
		studentzao.studentId = 1001; // 참조변수(객체)에 .찍으면 해당 클래스 속성에 접근가능(대입, 출력)
		studentzao.studentName = "짜오리";// 지금 이게 힙메모리 안에 기능 넣는중
		studentzao.address = "경기도 용인시";
		studentzao.grade = 1;
		// 접근제어자가 동일한 패키지이기 때문에 ㄱㅊ음
		
		System.out.println(studentzao.studentId);
		System.out.println(studentzao.studentName);
		System.out.println(studentzao.address);
		System.out.println(studentzao.grade);
		studentzao.showStudentInfo(); // 매서드는 객체 생성후 출력
		System.out.println("\n");
		
		A_Student studentlee = new A_Student();
		studentlee.studentId = 1002;
		studentlee.studentName = "리짜오";
		studentlee.address = "경기도 성남시";
		studentlee.grade = 2;
		
		System.out.println(studentlee.studentId);
		System.out.println(studentlee.studentName);
		System.out.println(studentlee.address);
		System.out.println(studentlee.grade);
		studentlee.showStudentInfo(); // 매서드는 객체 생성후 출력
		
		// 하나의 클래스에 여러개 객체
		// 여러개의 객체에 여러개 속성,기능 접근가능
		
		// 메인메서드 실행 -> 스탯메모리(변수생성됨: studentzao, lee : 객체를 담고있는 주소값 생성되는거 = 참조변수), 힙메모리 생성(맴버변수생성(id, 주소, 학년등.. 기능))
		// 스택이 힙을 참조하고 있음, 힙 안에는 기능이 있으니까, studentzao, lee들이 기능(학년, 주소, 학번등,,) 참조하는거, 이게 lee, zao각각 만들어지는거임. 갠플.
		// 스택 메모리 안에 zao, lee각각의 메모리 생성, 힙 메모리 안에 zao, lee의 기능들이 각각 생성되는거, 그리고 스탯안에 있는 zao, lee가 힙 안에 있는 기능들을 참조하는거.
		
		System.out.println("\n참조변수와 참조값");
		
		System.out.println(studentzao); // 가상주소값
		System.out.println(studentlee);
		
		
	
	}

}
