package constructor;

import classpart.A_Student; // 패키지가 다르기 때문에 따로 지정해서 알려줘야돼

public class PersonTest {

	public static void main(String[] args) {
		Person personLee;
		personLee = new Person();

		personLee.setName("쏘연");
		personLee.setWeight(46); // 간접적 접근, 세터로,,
		personLee.height = 158.8f;
		
		// 클래스를 내 손으로 생성자 생성했기 때문에 컴파일러는 디폴트생성자를 생성해주지 않아
		// 내 손으로 생성한 생성자 양식에 맞춰서 입력하기
		
		System.out.println(personLee.getName());
		System.out.println(personLee.getWeight()); // 게터로 접근
		System.out.println(personLee.height);
		System.out.println("\n");
		
		Person person5 = new Person("근주", 49, 173.2f); // 생성자에서 직접 맴버변수에 접근한거라 세터 필요없음.
		
		System.out.println(person5.getName());
		System.out.println(person5.getWeight()); // 게터는 해줘야됨
		System.out.println(person5.height);
		
		
//		System.out.println("\n접근제한자 Test");
//		A_Student studentzao = new A_Student(); // 클래스(설계도) 가져와서 이제 객체 생성할꺼임.
//		// 해당 객체의 각각의 변수 메모리 공간이 생성됨. 지금 이게 스택메모리 안에 객체 생성중
//		studentzao.studentId = 1001; // 참조변수(객체)에 .찍으면 해당 클래스 속성에 접근가능(대입, 출력)
//		studentzao.studentName = "짜오리";// 지금 이게 힙메모리 안에 기능 넣는중
//		studentzao.address = "경기도 용인시";
//		studentzao.grade = 1;
//		
//		System.out.println(studentzao.studentId);
//		System.out.println(studentzao.studentName);
//		System.out.println(studentzao.address);
//		System.out.println(studentzao.grade);
//		studentzao.showStudentInfo(); // 매서드는 객체 생성후 출력
		// 디폴트 생성자이기 때문에, 같은 패키지가 아님으로 에러남, 해당 클래스 변수들 앞에다 접근제어자를 public 써줘야됨
		// 아니면 게터, 세터 하던가
	}

} // alt + shift + r : 똑같은 변수명(이름) 한번에 바뀜
